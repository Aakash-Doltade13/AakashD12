package Arrays2Assign;

public class ArrayPorduct
{
    public static void productOfArray(int[] arr1, int n)
    {
        int[] left = new int[n], right = new int[n], product = new int[n];
        left[0] = 1;
        right[n - 1] = 1;
        for(int i = 1; i < n; i++) {
            left[i] = arr1[i - 1] * left[i - 1];
        }
        for(int j = n - 2; j >= 0; j--) {
            right[j] = arr1[j + 1] * right[j + 1];
        }
        for(int i = 0; i < n; i++) {
            product[i] = left[i] * right[i];
        }
        for(int i = 0; i < n; i++) {
            System.out.print(product[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int n = arr1.length;

        System.out.print("The given array is :  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();

        System.out.print("The product array is: ");
        productOfArray(arr1, n);
    }
}
