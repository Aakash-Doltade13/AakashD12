package Assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfPrime

{

  public static void main(String[] args) 
  {
	  int n;
	  Scanner sc=new Scanner(System.in);
	 
	  try 
	  {
   
		  System.out.println("Input a Positive Integer :");
           n=Integer.parseInt(sc.next());
	  }
	  catch(InputMismatchException | NumberFormatException e)
	  {
		  System.out.println("Invalid Input");

          System.out.println("Input a Positive Integer :");
          n=Integer.parseInt(sc.next());


	  }
    boolean flag = false;
    
    for (int i = 2; i <= n / 2; ++i)
    {
        if (checkPrime(i)) 
        {

         if (checkPrime(n - i)) 
         {
              System.out.printf("%d = %d + %d\n", n, i, n - i);
          flag = true;
        }

      }
    }

    if (!flag)
      System.out.println(n + " cannot be expressed as the sum of two prime numbers.");
  }

  
  static boolean checkPrime(int num)
  {
    boolean isPrime = true;

    for (int i = 2; i <= num / 2; ++i)
    {
      if (num % i == 0)
      {
        isPrime = false;
        break;
      }
    }

    return isPrime;
  }
}