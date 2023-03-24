import java.util.Scanner;
import java.util.ArrayList;
public class App {
    private String input,search;
    Scanner sc = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();
    ArrayList<String> vehicle = new ArrayList<>();
    public void input(){
        for(int i=0; i<=10; i++){
            System.out.println("\t"+i+".Enter entery = ");
            input=sc.next();
            list.add(input);
        }
        System.out.println(list);
    }
    public void search(){
        for(int i=0; i<=10; i++){
            search=sc.next();
            if(search==list.get(i)){
                vehicle.add(list.get(i));
                System.out.println(vehicle);
            }
            else{
                System.out.println("Vechile is in search....");
            }
        }
    }
    public static void main(String[] args) throws Exception {
       
        App p = new App();
        p.input();
        p.search();
    }
}
