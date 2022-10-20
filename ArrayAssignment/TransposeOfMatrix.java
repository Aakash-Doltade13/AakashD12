package ArrayAssignment;

import java.util.Scanner;

public class TransposeOfMatrix
{
    public static void main(String[] args)
    {
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array : ");
        n = Integer.parseInt(sc.next());

        int[][] array = new int[4][4];

        System.out.println("Input elements in the matrix : ");
        for(i= 0; i < n; i++)
        {
            for( j = 0; j < n; j++)
            {
                System.out.print("element - [" + i + "],[" + j + "] : ");
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nThe matrix is : ");
        for(i = 0; i < n; i++) {
            System.out.println();
            for( j = 0; j < n; j++) {
                System.out.print(array[i][j] + "  ");
            }
        }
        System.out.println("\nThe Transpose matrix is : ");
        for(i = 0; i < n; i++) {
            System.out.println();
            for( j = 0; j < n; j++) {
                System.out.print(array[j][i] + "  ");
            }
        }
        System.out.println("\n");
    }
}
