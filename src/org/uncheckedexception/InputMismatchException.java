package org.uncheckedexception;

import java.util.Scanner;

public class InputMismatchException {
	public static void main(String[] args) {
		System.out.println("***********************");
		Scanner s = new Scanner(System.in);
		//byte range from -128 to +127
		byte a = s.nextByte();
		//right method call between -128 to 127
		System.out.println(a);
		// call out of the range ( Input Mismatch Exception will throw)
		
	}

}
