class A {
    int x=10;
    int y=10;
    public void print(){
        System.out.println("=============== SINGLE INHERITANCE ===============\n");
        System.out.println("1.This is class A having variables x=10,y=10");
        System.out.println("We will now derive one class that will be class B");
        System.out.println("And perform addition\n");
    }
    
}

class B extends A{
    int add;
    public void add(){
        add = x + y;
        System.out.println("2.Now,\nThis is class B Addition of x,y = "+add);
        System.out.println("\n3.class B is derived from class A i.e base class");
        System.out.println("Properties of class A is imported in class B");
    }
}

public class Simple{
    public static void main(String[] args) {
        //creating object of class B
        B obj = new B();
        obj.print();
        obj.add();
    }
}
/*
 *OUTPUT
    =============== SINGLE INHERITANCE ===============

    1.This is class A having variables x=10,y=10
    We will now derive one class that will be class B
    And perform addition

    2.Now,
    This is class B Addition of x,y = 20

    3.class B is derived from class A i.e base class
    Properties of class A is imported in class B
 */
