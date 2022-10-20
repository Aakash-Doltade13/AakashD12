package ArrayAssignment;

import java.util.Scanner;

public class LeftDiagonalMatrix
{
    public static void main(String[] args) {
        int i,j;
        Scanner sc =new Scanner(System.in);
        int[][] array1 = new int[50][50];
        int sum = 0, n;

        System.out.print("Input the size of the square matrix : ");
        n = sc.nextInt();
        System.out.println("Input elements in the matrix : ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("element - [" + i + "],[" + j + "] : ");
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is :");
        for( i = 0; i < n; i++)
        { System.out.println();
            for( j = 0; j < n; j++) {
                System.out.print( array1[i][j]+" ");
            }
            System.out.println();
        }
        for( i = 0; i < n; i++)
        {
            for(j = 0; j < n; j++)
            { System.out.println();
                if(i != j)
                {
                    sum = sum + array1[i][j];
                }
            }
        }
        System.out.println("Addition of the right Diagonal elements is :" + sum);
    }

}
