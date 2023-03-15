import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.Scanner;
class exceptionTypes {
		
	void arithmetic_exception()
	{
			Scanner sc = new Scanner(System.in);
			
		try {
			int num1,num2,num3;
			System.out.println("Enter number 1 = ");
			num1=sc.nextInt();
			System.out.println("Enter number 2 = ");
			num2=sc.nextInt();
			num3 = num1 / num2;
			System.out.println("Reasult: "+num3);
		}catch(ArithmeticException e) {
			
			System.out.println("Arithmetic-Exception found,");
			System.out.println("You are dividing number by zero");
		}
		finally
		{
			System.out.println("This is 'finally' block");
			System.out.println("Exception is handeled by catch block");
		}
		
	}
	
	void index_outof_bound()
	{
		try {
			
			int arr[] = new int[5];
			arr[6] = 9;
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("You are trying to accept element index beyond the array size");
		}
		finally
		{
			System.out.println("This is 'finally' block");
			System.out.println("Exception is handeled by catch block");
		}		
			
	}
	
	void null_pointer()
	{
		String name = null;
	//	int i = 100; 
		try
		{
			System.out.println(name.length());
		}catch(NullPointerException e)
		{
			System.out.println("NullPointerException found");
			System.out.println("There is null value assingned to variable");
			System.out.println("You can't check it's length of null String");
		}
		finally
		{
			System.out.println("This is 'finally' block");
			System.out.println("'NullPointerException' is handled by catch block");
		}
		
	}
	
	void number_format()
	{
		//trying converting string value into numeric value.
		String  str = "Aman";
		try {
			
			int a=Integer.parseInt(str);
			System.out.println(a);
			
		}catch(NumberFormatException e)
		{
			System.out.println("'NumberFormatException' found");
			System.out.println("You can't convert string yo number");
		}
		finally
		{
			System.out.println("This is 'finally' block");
			System.out.println("Exception is handled by catch blok");
		}
	}
	
	void input_mismatch()
	{
		int num4;
		try {
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter any Integer number");
			num4 = sc1.nextInt();
		}catch(Exception e ) //InputMismatchException e
		{
			System.out.println("'InputMismatchException' found");
			System.out.println("Enter integer value only");
		}
		finally
		{
			System.out.println("This is 'finally' block");
			System.out.println("Exception is handled by catch block");
		}
		
	}
}