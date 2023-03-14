import java.util.Scanner;

//Class MatrixAddition
public class MatrixAddition {

    public static void main(String[] args) {
        int row ,col;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of colums:");
        col = sc.nextInt();

        System.out.println("Enter numbers of rows");
        row = sc.nextInt();

        int mat1[][] = new int[row][col];
        int mat2[][] = new int[row][col];
        int add[][] = new int[row][col];
        int sub[][] = new int[row][col];
        int div[][] = new int[row][col];
        int mul[][] = new int[row][col];


        //1st matrix
        System.out.println("Enter elements of Matrix 1st");
        for(int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                System.out.print("Enter Element "+i+"x"+j+"=");
                mat1[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                System.out.print(mat1[i][j]+"\t");
            }
            // Change
            System.out.println();
        }
        //2nd matrix
        System.out.println("Enter elements of Matrix 2nd");
        for(int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                System.out.print("Enter Element "+i+"x"+j+"=");
                mat2[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                System.out.print(mat2[i][j]+"\t");
            }
            // Change
            System.out.println();
        }

    //    System.out.println("Addition Operation of matrix is");
        for(int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                add[i][j]=mat1[i][j]+mat2[i][j];
            }
        }

    //    System.out.println("Subtraction Operation of matrix is");
        for(int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                sub[i][j]=mat1[i][j]-mat2[i][j];
            }
        }

    //    System.out.println("Division Operation of matrix is");
        for(int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                div[i][j]=mat1[i][j]/mat2[i][j];
            }
        }

    //    System.out.println("Multilplication Operation of matrix is");
        for(int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                mul[i][j]=mat1[i][j]*mat2[i][j];
            }
        }

        //print add
        System.out.println("Addition of two matix");
        for(int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                System.out.print(add[i][j]+"\t");
            }
            // Change
            System.out.println();
        }

        //print sub
        System.out.println("Subtraction of two matix");
        for(int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                System.out.print(sub[i][j]+"\t");
            }
            // Change
            System.out.println();
        }

        //print div
        System.out.println("Division of two matix");
        for(int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                System.out.print(div[i][j]+"\t");
            }
            // Change
            System.out.println();
        }

        //print mul
        System.out.println("Multiplication of two matrix");
        for(int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                System.out.print(mul[i][j]+"\t");
            }
            // Change
            System.out.println();
        }
    }

}


// output:
// Enter number of colums:
// 2
// Enter numbers of rows
// 2
// Enter elements of Matrix 1st
// Enter Element 0x0=2
// Enter Element 0x1=2

// Enter Element 1x0=2
// Enter Element 1x1=2

// 2       2
// 2       2
// Enter elements of Matrix 2nd
// Enter Element 0x0=2
// Enter Element 0x1=2

// Enter Element 1x0=2
// Enter Element 1x1=2

// 2       2
// 2       2
// Addition of two matix
// 4       4
// 4       4
// Subtraction of two matix
// 0       0
// 0       0
// Division of two matix
// 1       1
// 1       1
// Multiplication of two matrix
// 4       4
// 4       4
