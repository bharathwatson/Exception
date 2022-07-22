package ExceptionHandling;

public class ArrayIndexOutofBoundsExceptionHandle {
	public static void main(String[] args) {
		int a[]= new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		//right method
		System.out.println(a[1]);
		try {
			System.out.println(a[5]);//array index out of bounds exception	
		} catch (Exception e) {
			System.out.println("a[4] out of bound in array it will throw array exception");
		}
		finally {
			System.out.println("finally.....!!");
		}
		System.out.println(a[2]);
		System.out.println(a[0]);
		
		int length= a.length;
		System.out.println(length);
		
		for(Integer x:a) {
			System.out.println(x);
			
		}
		
		
		
	}


}
