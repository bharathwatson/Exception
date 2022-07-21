package org.uncheckedexception;

public class ArrayIndexOutofBoundsException {
	public static void main(String[] args) {
		int a[]= new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		//right method
		System.out.println(a[1]);
		//array index out of bounds exception
		System.out.println(a[4]);
		
		
	}

}
