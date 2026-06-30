package blocks;

class Parent {
    static void display() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {
    static void display() { // This is METHOD HIDING, not overriding
        System.out.println("Child static method");
    }
    
    public static void main(String[] args) {
    	Parent p = new Child();
    	p.display(); // prints "Parent static method" — resolved by reference type, not object type
	}
}

