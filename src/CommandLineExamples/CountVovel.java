package CommandLineExamples;
import CommandLineExamples.*;

public class CountVovel {
public static void main(String[] args) {
	String s="PARMESHWAROUI";
	int count=0;
	for(int i=0;i<=s.length()-1;i++) {
		if(s.charAt(i)=='A'||s.charAt(i)=='I'||s.charAt(i)=='E'||s.charAt(i)=='O'||s.charAt(i)=='U') {
			count++;
		}
	}
	System.out.println(count);
}
}
