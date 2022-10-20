package Arrays2Assign;

public class SumOfAdjacent 
{
		public static int maxSum(int[] array, int n)
		{
			int incl = array[0];
			int excl = 0;
			int exclNew;
			for(int i = 1; i < n; i++) 
			{
				exclNew = incl > excl ? incl : excl;

				incl = excl + array[i];
				excl = exclNew;
			}
			return incl > excl ? incl : excl;
		}

		public static void main(String[] args) 
		{
			int[] array = {1, 3, 5, 9, 7, 10, 1, 10, 100};
			int n = (int)array.length;
				
			System.out.print("The given array is :  ");
			for(int i = 0; i < n; i++) 
			{
				System.out.print(array[i] + "  ");
			}
			System.out.println();
		
			System.out.println("The maximum sum from the array such that no two elements are adjacent is: " + maxSum(array, n) + " ");
		}
	

}
