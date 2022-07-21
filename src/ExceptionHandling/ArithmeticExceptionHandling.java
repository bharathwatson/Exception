package ExceptionHandling;

public class ArithmeticExceptionHandling {
	public static void main(String[] args) {
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(4/0);//arithmetic exception
		} 
		catch (ArithmeticException e) {
		    System.out.println("Number cant be divided by zero");
		}
		finally {
			System.out.println("finally...!!");
			System.out.println("Finally statement can print any thing without Exception inside finally");
		}
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		
	}

}
