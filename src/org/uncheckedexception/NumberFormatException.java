package org.uncheckedexception;

public class NumberFormatException {
	
	public static void main(String[] args) {
		
		String a = "1346";
		
		int paraint=Integer.parseInt(a);
		//right method
		System.out.println(paraint+10);
		
        String b = "1GJVJ16";
		
		int paraint1=Integer.parseInt(b);
		//NumberFormatExpection
		System.out.println(paraint1+10);
	}

}
