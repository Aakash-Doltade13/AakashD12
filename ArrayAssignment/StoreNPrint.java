package ArrayAssignment;

import java.util.Scanner;

public class StoreNPrint
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array :");
        n=Integer.parseInt(sc.next()) ;

        int[] array = new int[10];
        for(int i=0; i<n; i++)
        {
            System.out.println(" element - : "+i);
            array[i]=Integer.parseInt(sc.next()) ;
        }
        System.out.println("Array elements are : ");
        for (int i=0; i<n; i++)
        {
            System.out.print(array[i]+" ");
        }
    }

}