import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        double real1, img1, real2, img2;

        Scanner input = new Scanner(System.in);

        System.out.println("First complex number");

        System.out.println("Enter real part of the complex number");

        real1 = input.nextDouble();

        System.out.println("Enter imaginary part of the complex number ");

        img1 = input.nextDouble();

        complex obj1 = new complex(real1, img1);

        System.out.println("Second complex number");

        System.out.println("Enter real part of the complex number");

        real2 = input.nextDouble();

        System.out.println("Enter imaginary part of the complex number ");

        img2 = input.nextDouble();

        complex obj2 = new complex(real2, img2);

        complex obj3 = new complex();

        int choice;

        System.out.println("Enter:-");

        System.out.println(" 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division");

        choice = input.nextInt();

        switch (choice)
        {
            case 1:
                obj3.add(obj1, obj2);
                break;
            case 2:
                obj3.subtraction(obj1, obj2);
                break;
            case 3:
                obj3.multiplication(obj1, obj2);
                break;
            case 4:
                obj3.division(obj1, obj2);
                break;
            default:
                System.out.println("Please choice valid operation");
        }
    }

}
/*output
First complex number
Enter real part of the complex number
3
Enter imaginary part of the complex number 
Second complex number
Enter real part of the complex number
2
Enter imaginary part of the complex number 
2
Enter:-
 1.Addition
 2.Subtraction
 3.Multiplication
 4.Division
1
Additions of to complex number is  5.0 + 6.0 i
==================================================
Enter real part of the complex number
2
Enter imaginary part of the complex number 
8
Second complex number
Enter real part of the complex number
2
Enter imaginary part of the complex number 
4
Enter:-
 1.Addition
 2.Subtraction
 3.Multiplication
 4.Division
2
Subtraction of to complex number is  0.0 + 4.0 i
=====================================================
*/
