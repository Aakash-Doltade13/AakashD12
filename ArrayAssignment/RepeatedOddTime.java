package Arrays2Assign;

public class RepeatedOddTime
{

        static int Oddtimeappears(int array[], int arr_size)
        {
            int i;
            for (i = 0; i < arr_size; i++)
            {
                int count = 0;
                for (int j = 0; j < arr_size; j++)
                {
                    if (array[i] == array[j])
                        count++;
                }
                if (count % 2 != 0)
                    return array[i];
            }
            return -1;
        }

        public static void main(String[] args)
        {
            int array[] = new int[]{ 6, 7, 3, 6, 8, 7, 6, 8, 3, 3 };
            int n = array.length;
            System.out.println("The numbers occurring odd number of times are : "+Oddtimeappears(array, n));
        }

}
