package Arrays2Assign;

public class SumOfFourElements 
{
	
		public static void sumOfElements(int[] array1, int size, int sum) 
		{
			System.out.println("The elements are:  ");
			for(int i = 0; i < size - 3; i++) 
			{
				for(int j = i + 1; j < size - 2; j++) 
				{
					for(int k = j + 1; k < size - 1; k++) 
					{
						for(int l = k + 1; l < size; l++) 
						{
							if(array1[i] + array1[j] + array1[k] + array1[l] == sum) 
							{
								System.out.println(array1[i] + ", " + array1[j] + ", " + array1[k] + ", " + array1[l]);
								return;
							}
						}
					}
				}
			}
			System.out.println("No elements found for the given sum.");
		}

		public static void main(String[] args) {
			int[] array = {3, 7, 1, 9, 15, 14, 6, 2, 5, 7};
			int sum = 37;
			int n = (int)array.length;
			
			System.out.println("The given array is:  ");
			for(int i = 0; i < n; i++) {
				System.out.print(array[i] + "  ");
			}
			System.out.println();
			
			sumOfElements(array, n, sum);
		}
	

}
