package ArrayAssignment;

import java.util.Scanner;

public class matrix2D
{
    public static void main(String[] args)
    {
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array : ");
        n = Integer.parseInt(sc.next());

        int[][] array = new int[6][6];

        System.out.println("Input elements in the matrix : ");
        for(i= 0; i < 3; i++)
        {
            for( j = 0; j < 3; j++)
            {
                System.out.print("element - [" + i + "],[" + j + "] : ");
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nThe matrix is : ");
        for(i = 0; i < 3; i++) {
            System.out.println();
            for( j = 0; j < 3; j++) {
                System.out.print(array[i][j] + "  ");
            }
        }
        System.out.println("\n");
    }
    }