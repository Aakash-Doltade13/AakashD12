package Arrays2Assign;

import java.util.Scanner;

public class BiggestDiifBtTwo 
{
	public static int maxDifference(int[] array1, int n) 
	{
			int minElement = array1[0];
			int diff = array1[1] - array1[0];
			for(int i = 1; i < n; i++)
			{
				if(array1[i] - minElement > diff) 
				{
					diff = array1[i] - minElement;
					System.out.println("The elements which provide maximum difference is: " + minElement + ",   " + array1[i]);
				}
				if(array1[i] < minElement) 
				{
					minElement = array1[i];
				}
			}
			return diff;
		}

		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int[] arr1 = {7, 9, 5, 6, 13, 2};
			int n = (int)arr1.length;
				
			System.out.print("The given array is :  ");
			for(int i = 0; i < n; i++) {
				System.out.print(arr1[i] + "  ");
			}
			System.out.println();
		   

			System.out.print("The Maximum difference between two elements in the array is:  " + maxDifference(arr1, n));
			nextChar(sc);
		}

		public final static int nextChar(Scanner scanner)
		{
			scanner.useDelimiter("");
			int ret = scanner.next().charAt(0);
			scanner.reset();
			return ret;
		}
	

}
