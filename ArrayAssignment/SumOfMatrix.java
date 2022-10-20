package ArrayAssignment;

import java.util.Scanner;

public class SumOfMatrix
{
    public static void main(String[] args)
    {

        int n,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array : ");
        n = Integer.parseInt(sc.next());

        int[][] array1 = new int[4][4];
        int[][] array2 = new int[4][4];
        int[][] array3 = new int[4][4];

        System.out.println("Input elements in the First matrix : ");
        for(i= 0; i < n; i++)
        {
            for( j = 0; j < n; j++)
            {
                System.out.print("element - [" + i + "],[" + j + "] : ");
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input elements in the Second matrix : ");
        for(i= 0; i < n; i++)
        {System.out.println();
            for( j = 0; j < n; j++)
            {
                System.out.print("element - [" + i + "],[" + j + "] : ");
                array2[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nThe First matrix is : ");
        for(i = 0; i < n; i++) {

            for( j = 0; j < n; j++) {
                System.out.print(array1[i][j] + "  ");
            }
        }
        System.out.println("\nThe Second matrix is : ");
        for(i = 0; i < n; i++) {
            System.out.println();
            for( j = 0; j < n; j++) {
                System.out.print(array2[i][j] + "  ");
            }
        }
        System.out.println("\nThe Sum matrix is : ");
        for(i = 0; i < n; i++) {
            System.out.println();
            for( j = 0; j < n; j++)
            {
                array3[i][j]=array1[i][j]+array2[i][j];
                System.out.print(array3[i][j] + "  ");
            }
        }
        System.out.println("\n");
    }

}

