package Assignment2;
import java.util.InputMismatchException;
import java.util.Scanner;

// convert Octal number to Binary
//convert octal number
// to its decimal  value
// then convert decimal number
// to its binary equivalent num

public class OctalToBinary 

{
     public static int convert(int octa)
	   {
        int i = 0;
		int dec = 0;
		int bin = 0;

		while (octa > 0) 
		{
			dec+= (octa % 10) * Math.pow(8, i);
			++i;
			octa /= 10;
		}
		
		 i = 1;

		while (dec > 0) 
		{
			bin += (dec % 2) * i;
			dec /= 2;
			i *= 10;
		}
         
		return bin;
		 }
       public static void main(String[] args)
	       {
        	 int octnum,result;
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Input an octal number (using digit 0 - 7) : ");
			octnum = sc.nextInt();
			System.out.println("The Octal number: " + octnum);
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input");
			System.out.println("Input an octal number (using digit 0 - 7) : ");
			Scanner sc = null;
			octnum = sc.nextInt();
			System.out.println("The Octal number: " + octnum);
		}
		result = convert(octnum);

		System.out.println(" The equivalent Binary Number is: " + result);
	}
}
