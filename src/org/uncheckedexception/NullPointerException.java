package org.uncheckedexception;

public class NullPointerException {
	public static void main(String[] args) {
		String s1="bharath";
		//right method 
		System.out.println(s1.charAt(2));
		System.out.println("********************");
		//****string index out of bounds exception*******
		System.out.println(s1.charAt(15));
		
		String s = null;
		//right method
		System.out.println(System.identityHashCode(s));
		System.out.println("*****************************");
		//*******null pointer exception*********
		System.out.println(s.charAt(9));
		
	}
 
}
