package ArrayAssignment;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CopyArray
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array :");
        n = Integer.parseInt(sc.next());
        int[] array1 = new int[5];
        int[] array2 = new int[array1.length];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Element - : " + i + "--> ");
            array1[i] = Integer.parseInt(sc.next());
        }System.out.print("The elements copied in the Second array are : " + Arrays.toString(array1) );

        for(int i = 0; i < n; i++)
        {
            array2[i] = array1[i];
        }
        System.out.println("\n");
        System.out.print("The elements copied in the Second array are : " );
        for(int i = 0; i < n; i++) {
            System.out.print( array2[i]+" ");
        }
        System.out.println("\n");

    }

}


