package NewAssign;

import java.util.Scanner;

public class DiamondPattern
{
	 public static void main(String[] args) {
	        int number,m,n;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Number Of Row : ");
	        number = sc.nextInt();


         for (m = 1; m <= number; m++) {

             // Inner loop 1 print whitespaces inbetween
             for (n = 1; n <= number - m; n++) {
                 System.out.print(" ");
             }

             // Inner loop 2 prints star
             for (n = 1; n <= m * 2 - 1; n++) {
                 System.out.print("*");
             }

             // Ending line after each row
             System.out.println();
         }

         // Outer loop 2
         // Prints the second half diamond
         for (m = number - 1; m > 0; m--) {

             // Inner loop 1 print whitespaces between
             for (n = 1; n <= number - m; n++) {
                 System.out.print(" ");
             }

             // Inner loop 2 print star
             for (n = 1; n <= m * 2 - 1; n++) {
                 System.out.print("*");
             }

             // Ending line after each row
             System.out.println();
         }
     }
}

