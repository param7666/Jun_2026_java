package blocks;

class Outer {
    private static String outerStatic = "Outer Static Field";
    private String outerInstance = "Outer Instance Field";

    // Static nested class
    static class StaticNested {
        void display() {
            System.out.println(outerStatic);     // OK — static member
           // System.out.println(outerInstance); // ERROR — cannot access instance member
        }
    }

    // Non-static inner class
    class Inner {
        void display() {
            System.out.println(outerStatic);     // OK
            System.out.println(outerInstance);   // OK — has reference to outer object
        }
    }
    
    public static void main(String[] args) {
    	// Static nested class — no Outer object needed
    	Outer.StaticNested sn = new Outer.StaticNested();
    	sn.display();

    	// Non-static inner class — Outer object required
    	Outer outer = new Outer();
    	Outer.Inner inner = outer.new Inner();
    	inner.display();
	}
}


