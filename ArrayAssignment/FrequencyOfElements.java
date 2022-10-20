package Arrays2Assign;

import java.util.Arrays;
import java.util.Scanner;

class FrequencyOfElements
{
        public static void countFreq(int array[], int n)
        {
            boolean visited[] = new boolean[n];
             Arrays.fill(visited, false);


            for (int i = 0; i < n; i++) 
            {
                 if (visited[i] == true)
                  continue;
                  int count = 1;
            for (int j = i + 1; j < n; j++) 
            {
                if (array[i] == array[j])
                {
                   visited[j] = true;
                count++;
                }
             }
            System.out.println( "The number of times the number"+array[i] + "occurs in the given array is: "+ count);
            }
}
       public static void main(String []args)
        {
	        int n,count;
     Scanner sc=new Scanner(System.in);
     System.out.print("Input the number of elements to be stored in the array :");
     n=Integer.parseInt(sc.next()) ;

     int[] array = new int[10];
     for(int i=0; i<n; i++)
     {
         System.out.println(" element - : "+i);
         array[i]=Integer.parseInt(sc.next()) ;
     }

        countFreq(array, n);
}
}

