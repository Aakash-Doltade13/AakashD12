package Arrays2Assign;
import java.util.Arrays;

class MedianArraySameSize
{
    public static int Median(int[] arr)
    {
        int n = arr.length;

        if (n % 2 == 0)
        {
            int z = n / 2;
            int e = arr[z];
            int q = arr[z - 1];

            int ans = (e + q) / 2;
            return ans;
        }
        else
        {
            int z = Math.round(n / 2);
            return arr[z];
        }
    }


    public static void main(String[] args)
    {
        int[] array1 = { 1 ,5, 13, 24, 35 };
        int[] array2 = {  3 ,8 ,15 ,17 ,32 };

        int i = array1.length;
        int j = array2.length;
        int[] array3 = new int[i + j];
        System.arraycopy(array1, 0, array3, 0, i);
        System.arraycopy(array2, 0, array3, i, j);

        Arrays.sort(array3);

        System.out.print("Median = " + Median(array3));
    }
}

