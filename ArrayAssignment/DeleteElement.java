

package ArrayAssignment;

import java.util.Scanner;

        public class  DeleteElement
        {
            public static void main()
            {
                int i, pos, n;
                Scanner sc=new Scanner (System.in);
                int[] array = new int[10];


                System.out.print("Input the size of array : ");
                n = sc.nextInt();

                System.out.println("Input " + n + " elements in the array in ascending order:");
                for(i = 0; i < n; i++)
                {
                    System.out.print("element - " + i + " : ");
                    array[i] = sc.nextInt();
                }

                System.out.print("\nInput the position where to delete: ");
                pos = sc.nextInt();

                i = 0;
                while(i != pos - 1)
                {
                    i++;
                }

                while(i < n) {
                    array[i] = array[i + 1];
                    i++;
                }
                n--;
                System.out.print("\nThe new list is : ");
                for(i = 0; i < n; i++)
                {
                    System.out.print("  " + array[i]);
                }
                System.out.println("\n");
            }

        }


