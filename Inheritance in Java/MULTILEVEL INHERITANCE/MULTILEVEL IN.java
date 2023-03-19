/*
    Implemention of MULTILEVEL INHERITANCE
*/

class BaseClass {
    public void print() {
        System.out.println("=======================================================================");
        System.out.println("\t\t\tMULTILEVEL INHERITANCE");
        System.out.println("=======================================================================");
        System.out.println("This is Base Class");
        System.out.println("Containing Variables");
        System.out.println("x = 20 & y = 30");
        System.out.println("-----------------------------------------------------------------------");
    }
    int x = 20;
    int y = 30;
}

class DerivedClass1 extends BaseClass {

    public void add() {
        System.out.println("This is DerivedClass1 from BaseClass\nPrinting Addition of that two x and y variable = ");
        int result_add = x+y;
        System.out.println("Addition is = "+ result_add);
        System.out.println("Now,\n this class is containing two variables i=10 and j=5");
        System.out.println("-----------------------------------------------------------------------");
    }
    int i = 10;
    int j = 5;
}

class DerivedClass2 extends DerivedClass1 {

    public void sub() {
        int result_sub = i-j;
        System.out.println("This is DerivedClass2 from DerivedClass1\nPrinting Subtraction of that two i and j variable = ");
        System.out.println("Subtraction is = "+ result_sub);
        System.out.println("-----------------------------------------------------------------------");
    }

}

class TestMultilevelInheritance extends DerivedClass2 {
    public static void main(String[]args) {
        TestMultilevelInheritance i = new TestMultilevelInheritance();
        i.print();
        i.add();
        i.sub();
    }
}

// =======================================================================
//                      MULTILEVEL INHERITANCE
// =======================================================================
// This is Base Class
// Containing Variables
// x = 20 & y = 30
// -----------------------------------------------------------------------
// This is DerivedClass1 from BaseClass
// Printing Addition of that two x and y variable =
// Addition is = 50
// Now,
//  this class is containing two variables i=10 and j=5
// -----------------------------------------------------------------------
// This is DerivedClass2 from DerivedClass1
// Printing Subtraction of that two i and j variable =
// Subtraction is = 5
// -----------------------------------------------------------------------