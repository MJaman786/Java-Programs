import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int ch = 0;
		
		exceptionTypes et = new exceptionTypes();
		
		Scanner obj = new Scanner(System.in);
		
	do {
		System.out.println("------ Exception Handling -----");
		System.out.println("1.ArithmeticException");
		System.out.println("2.ArrayIndexOutOfBoundsException");
		System.out.println("3.NullPointerException");
		System.out.println("4.NumberFormatException");
		System.out.println("5.InputMismatchException");
		System.out.println("Enter your choice = ");
		ch = obj.nextInt();
		System.out.println("--------------------------------");
			switch(ch)
			{
				case 1:
					et.arithmetic_exception();
					break;
				case 2:
					et.index_outof_bound();
					break;
				case 3:
					et.null_pointer();
					break;
				case 4:
					et.number_format();
					break;
				case 5:
					et.input_mismatch();
					break;
				case 6:
					System.out.println("Exit");
					break;
			}
		}while(ch!=6);
		
	}

}

/*Output
 ------ Exception Handling -----
1.ArithmeticException
2.ArrayIndexOutOfBoundsException
3.NullPointerException
4.NumberFormatException
5.InputMismatchException        
Enter your choice = 
1
--------------------------------
Enter number 1 = 
2
Enter number 2 = 
0
Arithmetic-Exception found,
You are dividing number by zero
This is 'finally' block
Exception is handeled by catch block
------ Exception Handling -----
1.ArithmeticException
2.ArrayIndexOutOfBoundsException
3.NullPointerException
4.NumberFormatException
5.InputMismatchException
Enter your choice = 
2
--------------------------------
You are trying to accept element index beyond the array size
This is 'finally' block
Exception is handeled by catch block
------ Exception Handling -----
1.ArithmeticException
2.ArrayIndexOutOfBoundsException
3.NullPointerException
4.NumberFormatException
5.InputMismatchException
Enter your choice =
3
--------------------------------
NullPointerException found
There is null value assingned to variable
You can't check it's length of null String
This is 'finally' block
'NullPointerException' is handled by catch block
------ Exception Handling -----
1.ArithmeticException
2.ArrayIndexOutOfBoundsException
3.NullPointerException
4.NumberFormatException
5.InputMismatchException
Enter your choice =
4
--------------------------------
'NumberFormatException' found
You can't convert string yo number
This is 'finally' block
Exception is handled by catch blok
------ Exception Handling -----
1.ArithmeticException
2.ArrayIndexOutOfBoundsException
3.NullPointerException
4.NumberFormatException
5.InputMismatchException
Enter your choice =
5
--------------------------------
Enter any Integer number
xyz
'InputMismatchException' found
Enter integer value only
This is 'finally' block
Exception is handled by catch block
--------------------------------
------ Exception Handling -----
1.ArithmeticException
2.ArrayIndexOutOfBoundsException
3.NullPointerException
4.NumberFormatException
5.InputMismatchException
Enter your choice =
6
--------------------------------
Exit
 */