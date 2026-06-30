package day5;

import java.util.*;
public class ChengeCase {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s="ABCdef";
	
	String ans="";
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(!Character.isLetter(c)) {
			System.out.println("Invalid String");
			return;
		} else {
			if(Character.isUpperCase(c)) {
				ans=ans+Character.toLowerCase(c);
			} else {
				ans+=Character.toUpperCase(c);
			}
		}
		
	}
	System.out.println(ans);
}
}
