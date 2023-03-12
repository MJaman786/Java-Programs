
//======================= Java Constructor =====================

//Constructor is a special type of method whose name is same as
//class name
//
//note:
//	<1>The main purpose of constructor is to initalise the object.
//	<2>Every java class has a constructor,
//	<3>A constructor is automatically called at the time of object 
//		creation.
//	<4>Constructor never contain any written type including 'void'.


//class Aman
//{
//	int a,z;
//	String b;
//	
//	Aman()
//	{
//		a=1; b=null;
//		z = a + 1;
//	}
//	
//	public void display()
//	{
//		System.out.println(z+" "+b);
//		
//	}
//}
//
// class main {
//
//	public static void main(String[] args) {
//		
//		Aman a = new Aman();
//		
//		a.display();
//
//	}
//
//}

//========================default constructor=====================

//Syntax of default constructor

//class Aman
//{
//	int a; String b; boolean c;
//	
//	Aman()           
//	{
//		
//	a=100;
//	b="Aman";
//	c=true;
//	
//	}
////	Aman()            //If we dont use constructor then compiler will
//	                     //set its own default constructor.
////{
////
////a=100;
////b="Aman";
////c=true;
////
////}
//	public void print()
//	{
//		System.out.println(a+" "+b+" "+c);
//	}
//}
//
//class main{
//	public static void main(String[] args) {
//		Aman ref = new Aman();  //creating object of class
//		ref.print();
//	}
//}

//===================== Parameretized Constructor ====================

//A constructor through which we can pass one or more parameters
//is called paramerterized constructor.

//Syntax:

//import java.util.Scanner;
//class Aman{
//	int x; String y;
//	Aman(int a, String b) //here a and b are parameter of this
//								//constructor
//	{
//		x=a; y=b;
//	}
//	
//	public void display()
//	{
//		System.out.println("You entered "+x+" "+y);
//	}
//	
//}
//
//class main{
//	public static void main(String[] args) {
//		
//		int num1;
//		String num2;
//		
//		Scanner obj = new Scanner(System.in);
//		System.out.println("Enter number1: ");
//		num1=obj.nextInt();
//		System.out.println("Enter String: ");
//		num2=obj.next();
//		Aman a = new Aman(num1,num2);
//		a.display();
//	}
//}

//======================== Copy Constructor =======================

//Syntax:







