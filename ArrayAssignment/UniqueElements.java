package Arrays2Assign;

import java.util.Scanner;

public class UniqueElements
{
  public static void main(String[] args) 
  {
	  int n, count = 0;
	  Scanner sc =new Scanner(System.in);
		int[] array = new int[10];
		
		System.out.println("\n\nPrint all unique elements of an array:");
	
		System.out.print("Input the number of elements to be stored in the array: ");
		n = sc.nextInt();
		
		System.out.println("Input " + n + " elements in the array :");
		for(int i = 0; i < n; i++) 
		{
			System.out.print("element - " + i + " : ");
			array[i] = sc.nextInt();
		}
		System.out.println("\nThe unique elements found in the array are: ");
		for(int i = 0; i < n; i++) 
		{
			count = 0;
			for(int j = 0, k = n; j < k + 1; j++)
			{
				
				if(i != j) 
				{
					if(array[i] == array[j]) 
					{
						count++;
					}
				}
			}
			if(count == 0) 
			{
				System.out.print(array[i] + " ");
			}
		}
		System.out.println("\n");
	}

	
}