package ArrayAssignment;

import java.util.Scanner;

public class SumOfRownCMatrix
{
    public static void main(String[] args)
    {
        int i,j,sum = 0, n;
        Scanner sc =new Scanner(System.in);
        int[][] array1 = new int[4][4];
        int[] rowsum =new int [4];
        int[] colsum =new int [4];

        System.out.print("Input the size of the square matrix : ");
        n = sc.nextInt();
        System.out.println("Input elements in the First matrix : ");
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++)
            {
                System.out.print("element - [" + i + "],[" + j + "] : ");
                array1 [i][j] = sc.nextInt();
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
        for(i = 0; i < n; i++)
        {
            rowsum[i] = 0;
            for(j = 0; j < n; j++)
            {
                rowsum[i] +=array1[i][j];
            }
        }
        for(i = 0; i < n; i++)
        {
            colsum[i] = 0;
            for(j = 0; j < n; j++) {
                colsum[i] = colsum[i] + array1[j][i];
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                System.out.println(array1[i][j]);
            System.out.print(rowsum[i]);
            System.out.print("\n");
        }
        for(j = 0; j < n; j++)
        {
            System.out.println( colsum[j]);
        }
        System.out.println("\n");
    }

    }
