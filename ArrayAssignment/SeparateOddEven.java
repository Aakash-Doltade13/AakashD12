package ArrayAssignment;

import java.util.Scanner;

public class SeparateOddEven
{
    public static void main(String[] args)
    {
        int n,i=0,j=0,k=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array :");
        n = Integer.parseInt(sc.next());

        int [] array1 = new int[10];
        int [] array2 = new int[10];
        int [] array3 = new int[10];
        for (i = 0; i < n; i++)
        {
            System.out.println(" element - : " + i);
            array1[i] = Integer.parseInt(sc.next());
        }
        
        for(i = 0; i < n; i++)
        {
            if(array1[i] % 2 == 0)
            {
                array2[j] = array1[i];
                j++;
            }
            else
            {
                array3[k] = array1[i];
                k++;
            }
        }

        System.out.println("\nThe Even elements are : ");
        for( i = 0; i < j; i++)
        {
            System.out.print(array2[i] + " ");
        }

        System.out.println("\nThe Odd elements are :");
        for(i = 0; i < k; i++)
        {
            System.out.print(array3[i] + " ");
        }
        System.out.println("\n");
    }

            
}
