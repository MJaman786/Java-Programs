class A{
	int a; double b; String c;
	
	A()
	{									//<1>default constructor
		a = 100;
		b = 2.5;
		c = "Aman";
	}
	A(int x, double y)					//<2>parameterize constructor
	{
		a=x; b=y;
	}
	A(int x, int y, String z)			//<3>parameterize constructor
	{
		a=x; b=y; c=z;
	}
}
public class constructor_overloading {

	public static void main(String[] args) {
		
		A a = new A();				//<1>
		A a1 = new A(10,22.22); 	//<2>
		A a2 = new A(1000,12,"Ayan"); //<3>
		System.out.println(a.a+" "+a.b+" "+a.c);
		System.out.println(a1.a+" "+a1.b);
		System.out.println(a2.a+" "+a2.b+" "+a2.c);
	}

}


