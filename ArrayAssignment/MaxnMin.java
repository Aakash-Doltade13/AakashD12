package ArrayAssignment;

import java.util.Scanner;

public class MaxnMin 
{
    public static void main(String[] args)
    {
        int n,max,min;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array : ");
        n = Integer.parseInt(sc.next());

        int[] array = new int[10];
        for (int i = 0; i < n; i++) 
        {
            System.out.println(" element - : " + i);
            array[i] = Integer.parseInt(sc.next());
        }
        		max = array[0];
        		min = array[0];

        		for(int i = 1; i < n; i++) 
        		{
        			if(array[i] > max) 
        			{
        				max = array[i];
        			}


        			if(array[i] < min) 
        			{
        				min = array[i];
        			}
        		}
        		System.out.println("Maximum element is : " + max);
        		System.out.println("Minimum element is : " + min + "\n");
        	}

}
