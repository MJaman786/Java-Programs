import java.util.Scanner;
class ParameterCons {
    double num1,num2;
    double z;
    ParameterCons(int a, int b)
        {
            num1=a;
            num2=b;
            z=num1+num2;
        }
    ParameterCons(double a, double b)
        {
            num1=a;
            num2=b;
            z=num1+num2;
        }
    ParameterCons(int a, double b)
        {
            num1=a;
            num2=b;
            z=num1+num2;
        }
        void display()
        {
            System.out.print("Addition of two numbers is = ");
            System.out.print(z+"\n");
        }
        
    public static void main(String[] args) {
        {
            int ch;
            Scanner sc = new Scanner(System.in);
            do
            {
                System.out.println("1.Integer and Integer");
                System.out.println("2.Double and Double");
                System.out.println("3.Integer and Double");
                System.out.println("4.Exit");
                System.out.println("Enter your choice");
                ch=sc.nextInt();
                switch(ch)
                {
                    case 1:
                        ParameterCons dc1 = new ParameterCons(10,20);
                        dc1.display();
                    break;
                    
                    case 2:
                        ParameterCons dc2 = new ParameterCons(1.5,1.5);
                        dc2.display();
                    break;
                    
                    case 3:
                        ParameterCons dc3 = new ParameterCons(1,1.5);
                        dc3.display();
                    break;
                }
            }while(ch!=4);
        }

    }
}