//#Local variables: A variable which is declared inside the body of
//method or method parameter called local variable

//	Syntax :a 
//		void fun(int a)
//		{
//			int x;  //here a and x is instance variable
//		}

//#Instance variable: a variable which is delared inside the class but 
//outsid of all the methods called instace variable
//
//	Syntax:
//		class A
//		{
//			int a; //here a is instance variable 
//			public static void main(String[] args)
//			{
//				
//			}
//		}

//#Static Variable:
//	A variable which is declared with the help of static keyword called
//	Ststic  Variable

class B
{
	static int b = 20; //*this is static variable.
	int c = 30; //*this is instance variable.
}
public class local_instance_static_variable {

	public static void main(String[] args) {
		
		B obj = new B();	//creating object  for calling instance 
							//variable
		
		int a = 10;//*this is local variable.
		System.out.println(a+" is local variable");
		System.out.println(B.b+" is static variable.");
		System.out.println(obj.c+" is instance variable.");

	}

}
