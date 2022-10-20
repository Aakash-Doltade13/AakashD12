package ArrayAssignment;

import java.util.Scanner;

public class SecondLargest
{
    public static void main(String[] args)
    {
        int n,large,slarge;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array :");
        n = Integer.parseInt(sc.next());

        int[] array = new int[10];
        large =array[0];
        slarge=0;

        for (int i = 0; i < n; i++)
        {
            System.out.println(" element - : " + i);
            array[i] = Integer.parseInt(sc.next());
        }
        for (int i=1;i<array.length;i++)
        {
            if (array[i]>large)
            {
                slarge=large;
                large=array[i];
            }
            else if(array[i]>large)
            {
               slarge= array[i];
            }
        }
          System.out.println("The First largest element in the array is : "+large);
        System.out.println("The Second largest element in the array is : "+slarge);

    }
}