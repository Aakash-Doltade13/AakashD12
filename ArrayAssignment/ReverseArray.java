package ArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array :");
        n=Integer.parseInt(sc.next()) ;
        int[] array = new int[5];

        for(int i=0; i<n; i++)
        {
            System.out.print("Element - : "+i +"--> ");
            array[i]=Integer.parseInt(sc.next()) ;
        }
        System.out.println("Elements in Array : "+ Arrays.toString(array));
        System.out.println("Array in reverse order: ");
        for (int i = array.length-1; i >= 0; i--)
        {
            System.out.print(array[i] + " ");
        }
    }
}

