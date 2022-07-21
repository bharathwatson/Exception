package org.uncheckedexception;

import java.util.ArrayList;
import java.util.List;

public class IndexOutofBoundsException {
	public static void main(String[] args) {
		
	     List li = new ArrayList();
	     li.add(10);
	     li.add(20);
	     li.add(30);
	     //right method
	     System.out.println(li.get(2));
	     //index out of bounds exception
	     System.out.println(li.get(8));
	}

}
