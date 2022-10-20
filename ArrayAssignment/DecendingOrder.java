package ArrayAssignment;

import java.util.Scanner;

public class DecendingOrder 
{
    public static void main(String[] args)
    {
        int n,temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array :");
        n = Integer.parseInt(sc.next());

        int[] array = new int[10];
        for (int i = 0; i < n; i++) 
        {
            System.out.println(" element - : " + i);
            array[i] = Integer.parseInt(sc.next());
        }
   
		for(int i = 0; i < n; i++) 
		{
			for(int j = i + 1; j < n; j++) 
			{
				if(array[i] < array[j]) 
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println("\nElements of array is sorted in descending order:");
		for(int i = 0; i < n; i++) 
		{
			System.out.print(array[i] + "  ");
		}
		System.out.println("\n");
	}

	
}