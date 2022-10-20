package Arrays2Assign;

import java.util.Scanner;

public class SumOfUpperMatrix 
{
public static void main(String[] args) 
{
	int i, j, n, sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Input the size of the square matrix : ");
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
    for(i = 0; i < 3; i++) 
    {System.out.println();
         for( j = 0; j < 3; j++) {
            System.out.print(array[i][j] + "  ");
        }
    }
    System.out.print("\n");
    		System.out.print("The elements of upper matrix are : ");
    		for( i = 0; i < n; i++) 
    		{
    			for( j = 0; j < n; j++)
    			{
    				if(i < j) {
    					System.out.print(array[i][j] + "  ");
    					sum += array[i][j];
    				}
    			}
    		}
    		System.out.print("\nThe Sum of the upper triangular Matrix Elements are: " + sum);
    	}
    }
           









