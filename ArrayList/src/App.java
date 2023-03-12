import java.util.ArrayList;
import java.util.Scanner;
public class App {
        static ArrayList<Integer> list = new ArrayList<Integer>(100);
        static ArrayList<Integer> even = new ArrayList<Integer>(100);
        static ArrayList<Integer> odd = new ArrayList<Integer>(100);
     // static ArrayList<Integer> compair = new ArrayList<Integer>(100);
        static Scanner sc = new Scanner(System.in);
        int size;
        public void getdata(){
            System.out.println("Enter Integer for size of list");
            System.out.println(" 'maxsize = 100' = ");
            size=sc.nextInt();
            for(int i=0; i<=size; i++){
                System.out.print(i+") Enter Element = ");
                int num=sc.nextInt();
                list.add(num);
            }
        }

        public void even_odd(){
            for(int i=0; i<size; i++){
                if(list.get(i)%2==0){
                    even.add(list.get(i));
                }
                else{
                    odd.add(list.get(i));
                }
            }
        }

        // public void grater(){
        //     for(int i=0; i<=size; i++){
        //         if((list.get(i)>=10) && (list.get(i)<=30)){
        //             compair.add(list.get(i));
        //         }
        //     }
        // }

        public void printlist(){
            System.out.println("=====================================");
            System.out.println("Elements of List = ");
            System.out.println(list);
        }

        public void even(){
            System.out.println("=====================================");
            System.out.println("Even-Elements of List = ");
            System.out.println(even);
        }

        public void odd(){
            System.out.println("=====================================");
            System.out.println("Odd-Elements of List = ");
            System.out.println(odd);
        }
        
        //  public void compair(){
        //     System.out.println("=====================================");
        //     System.out.println("Elements>=10 OR Elemnts<=30 of List = ");
        //     System.out.println(compair);
        // }
    public static void main(String[] args) throws Exception {
        int choice;
        do{
            App obj = new App();
            System.out.println("=====================================");
            System.out.println("1.Input Integers in List");
            System.out.println("2.2.Print List");
            System.out.println("3.Print Even-List");
            System.out.println("4.Print Odd-List");
            System.out.println("5.Print Elements>=10 OR Elemnts<=30");
            System.out.println("Enter your choice = ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                obj.getdata();
                obj.even_odd();
            // obj.grater();
                break;

                case 2:
                obj.printlist();
                break;

                case 3:
                obj.even();
                break;

                case 4:
                obj.odd();

                // case 5:
                // obj.compair();
            }
        }while(choice!=5);
    }
}
//Output
/*  =====================================
*    1.Input Integers in List
*    2.2.Print List
*    3.Print Even-List
*    4.Print Odd-List
*    5.Print Elements>=10 OR Elemnts<=30
*    Enter your choice = 
*    1
*    Enter Integer for size of list
*    'maxsize = 100' = 
*    10
*    0) Enter Element = 1
*    1) Enter Element = 2
*    2) Enter Element = 3
*    3) Enter Element = 4
*    4) Enter Element = 5
*    5) Enter Element = 6
*    6) Enter Element = 7
*    7) Enter Element = 8
*    8) Enter Element = 9
*    9) Enter Element = 10
*    10) Enter Element = 19
*    =====================================
*    1.Input Integers in List
*    2.2.Print List
*    3.Print Even-List
*    4.Print Odd-List
*    5.Print Elements>=10 OR Elemnts<=30
*    Enter your choice =
*    2
*    =====================================
*    Elements of List =
*    [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 19]
*    =====================================
*    1.Input Integers in List
*    2.2.Print List
*    4.Print Odd-List
*    5.Print Elements>=10 OR Elemnts<=30
*    Enter your choice =
*    3
*    =====================================
*    Even-Elements of List =
*    [2, 4, 6, 8, 10]
*    =====================================
*    1.Input Integers in List
*    2.2.Print List
*    3.Print Even-List
*    4.Print Odd-List
*    5.Print Elements>=10 OR Elemnts<=30
*    Enter your choice =
*    4
*    =====================================
*    Odd-Elements of List =
*    [1, 3, 5, 7, 9]
*    ===================================== 
 */
