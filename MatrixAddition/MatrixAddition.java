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
        int reasult[][] = new int[row][col];

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

        System.out.println("Addition of matrix is");
        for(int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                reasult[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        for(int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                System.out.print(reasult[i][j]+"\t");
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
// Enter Element 0x0=1
// Enter Element 0x1=1

// Enter Element 1x0=1 
// Enter Element 1x1=1

// 1       1
// 1       1
// Enter elements of Matrix 2nd
// Enter Element 0x0=2
// Enter Element 0x1=2

// Enter Element 1x0=2
// Enter Element 1x1=2

// 2       2
// 2       2
// Addition of matrix is
// 3       3
// 3       3
