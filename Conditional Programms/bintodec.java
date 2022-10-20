package NewAssign;

import java.util.InputMismatchException;
import java.util.Scanner;

class bintodec
{
  public static void main(String[] args)
  { 
	  String binary = " " ;
      Scanner sc = new Scanner(System.in);
      try
      {

          System.out.print("The Binary Number : ");
          binary =Integer.toString(0);

      }
      catch(InputMismatchException | NumberFormatException e)
      {

          System.out.println(" Invalid Input ");

          System.out.print("The Binary Number : ");
          binary =Integer.toString(0);
      }// binary number
    
    
    // convert to decimal
    int decimal = Integer.parseInt(binary, 2);
    
    System.out.println(binary + " in binary = " + decimal + " in decimal.");
  }
}