import java.util.Scanner;
class FunctionArguments {
    static Scanner sc = new Scanner(System.in);
    static float num1;
    static float num2;
    public void getdata(){
        System.out.print("Enter number 1 = ");
        num1=sc.nextFloat();
        System.out.print("Enter number 2 = ");
        num2=sc.nextFloat();
    }
    public void add(float x,float y){
        float z = x + y;
        System.out.println("Addition is = "+z);
    }
    public void sub(float x,float y){
        float z = x - y;
        System.out.println("Subtraction is = "+z);
    }
    public void multi(float x,float y){
        float z = x * y;
        System.out.println("Multiplication is = "+z);
    }
    public void div(float x,float y){
        float z = x / y;
        System.out.println("Division is = "+z);
    }
    public void mod(float x,float y){
        float z = x % y;
        System.out.println("Modulo is = "+z);
    }
    public static void main(String[] args) {
        //making class object to call class methods.
        FunctionArguments fa = new FunctionArguments();
        int ch;
        do{
            System.out.println("================== Types of Operations ==================");
            System.out.println("1.Give Input (x,y)");
            System.out.println("2.Addition");
            System.out.println("3.Subtraction");
            System.out.println("4.Multiplcation");
            System.out.println("5.Division");
            System.out.println("6.Modulo");
            System.out.println("Enter your choice = ");
            ch =sc.nextInt();
            
            switch(ch){
                case 1:
                    //method 1
                   fa.getdata();
                   break;
                case 2:
                    //method 2
                    fa.add(num1,num2);
                    break;
                case 3:
                    //method 3
                    fa.sub(num1,num2);
                    break;
                case 4:
                    //method 4
                    fa.multi(num1,num2);
                    break;
                case 5:
                    //method 5
                    fa.div(num1,num2);
                    break;
                case 6:
                    //method 6
                    fa.mod(num1,num2);
                    break;
            }
        }while(ch!=0);
    }
}
/*
OUTPUT = 
================== Types of Operations ==================
1.Give Input (x,y)  
2.Addition
3.Subtraction       
4.Multiplcation     
5.Division
6.Modulo
Enter your choice = 
1
Enter number 1 = 2
Enter number 2 = 5
================== Types of Operations ==================
1.Give Input (x,y)
2.Addition
3.Subtraction
4.Multiplcation
5.Division
6.Modulo
Enter your choice =
2
Addition is = 7.0
================== Types of Operations ==================
1.Give Input (x,y)
2.Addition
3.Subtraction
4.Multiplcation
5.Division
6.Modulo
Enter your choice =
3
Subtraction is = -3.0
================== Types of Operations ==================
1.Give Input (x,y)
2.Addition
3.Subtraction
4.Multiplcation
5.Division
6.Modulo
Enter your choice =
4
Multiplication is = 10.0
================== Types of Operations ==================
1.Give Input (x,y)
2.Addition
3.Subtraction
4.Multiplcation
5.Division
6.Modulo
Enter your choice =
5
Division is = 0.4
================== Types of Operations ==================
1.Give Input (x,y)
2.Addition
3.Subtraction
4.Multiplcation
5.Division
6.Modulo
Enter your choice =
6
Modulo is = 2.0
================== Types of Operations ==================
1.Give Input (x,y)
2.Addition
3.Subtraction
4.Multiplcation
5.Division
6.Modulo
Enter your choice =
1 
Enter number 1 = 2
Enter number 2 = 2
================== Types of Operations ==================
1.Give Input (x,y)
2.Addition
3.Subtraction
4.Multiplcation
5.Division
6.Modulo
Enter your choice =
6
Modulo is = 0.0
================== Types of Operations ==================
1.Give Input (x,y)
2.Addition
3.Subtraction
4.Multiplcation
5.Division
6.Modulo
Enter your choice =
2
Addition is = 4.0
================== Types of Operations ==================
1.Give Input (x,y)
2.Addition
3.Subtraction
4.Multiplcation
5.Division
6.Modulo
Enter your choice =
3
Subtraction is = 0.0
================== Types of Operations ==================
1.Give Input (x,y)
2.Addition
3.Subtraction
4.Multiplcation
5.Division
6.Modulo
Enter your choice =
4
Multiplication is = 4.0
================== Types of Operations ==================
1.Give Input (x,y)
2.Addition
3.Subtraction
4.Multiplcation
5.Division
6.Modulo
Enter your choice =
5
Division is = 1.0
================== Types of Operations ==================
1.Give Input (x,y)
2.Addition
3.Subtraction
4.Multiplcation
5.Division
6.Modulo
Enter your choice =
6
Modulo is = 0.0
================== Types of Operations ==================
1.Give Input (x,y)
2.Addition
3.Subtraction
4.Multiplcation
5.Division
6.Modulo
Enter your choice =
*/