package Assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LengthOfString 
{
		public static void main(String args[])
		{
			String str=" ";
			str.trim();
			
			Scanner sc = new Scanner(System.in);

			try {
				System.out.println(" Input a string : ");
				str=sc.nextLine();
			} catch(InputMismatchException | NumberFormatException e)
			{
				System.out.println("Invalid Input");
				System.out.println(" Input a string : ");
			 	str=sc.nextLine();
			}
			char ch[]=str.toCharArray();

			int i = 0;
			if(str.equalsIgnoreCase(String.valueOf(ch)))
			{
				for (char c : ch)
				{
					i++;
				}
			}
	        	System.out.println("The String Contains "+i+ " Numbers of character");
			System.out.println("So, the length of the string "+ str + " is : "+i);

		}

}
