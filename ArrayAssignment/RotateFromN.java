package Arrays2Assign;

public class RotateFromN {
	
		public static void shiftArr1pos(int[] arr1, int arrSize) {
			int i, temp;
			temp = arr1[0];
			for(i = 0; i < arrSize - 1; i++) {
				arr1[i] = arr1[i + 1];
			}
			arr1[i] = temp;
		}

		public static void arr1rotate(int[] arr1, int arrSize, int rotFrom) {
			for(int i = 0; i < rotFrom; i++) {
				shiftArr1pos(arr1, arrSize);
			}
			return;
		}

		public static void main(String[] args) {
			int[] arr1 = {0, 3, 6, 9, 12, 14, 18, 20, 22, 25, 27};
			int ctr = (int)arr1.length;
			System.out.print("The given array is :  ");
			for(int i = 0; i < ctr; i++) {
				System.out.print(arr1[i] + "  ");
			}
			
			System.out.println();
			System.out.print("From 4th position the values of the array are :  ");
			for(int i = 4; i < ctr; i++) {
				System.out.print(arr1[i] + "  ");
			}
			System.out.println();
			System.out.print("Before 4th position the values of the array are :  ");
			for(int i = 0; i < 4; i++) {
				System.out.print(arr1[i] + "  ");
			}
			System.out.println();
		
			arr1rotate(arr1, ctr, 4);
			System.out.println("\nAfter rotating from 4th position the array is: ");
			for(int i = 0; i < ctr; i++) {
				System.out.print(arr1[i] + " ");
			}
		}
	
}
