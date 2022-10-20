package ArrayAssignment;

import java.util.Scanner;

public class SecondSmallest
{
    public static void main(String[] args)
    {
        int n,small,ssmall;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array :");
        n = Integer.parseInt(sc.next());

        int[] array = new int[10];
        small =array[0];
        ssmall=0;

        for (int i = 0; i < n; i++)
        {
            System.out.println(" element - : " + i);
            array[i] = Integer.parseInt(sc.next());
        }
        for (int i=1;i<array.length;i++)
        {
            if (array[i]<small)
            {
                ssmall=small;
                small=array[i];
            }
            else if(array[i]<small)
            {
                ssmall = array[i];
            }
        }
        System.out.println("The First smallest element in the array is : "+small);
        System.out.println("The Second smallest element in the array is : "+ssmall
        );

    }
}