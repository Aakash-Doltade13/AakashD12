package ArrayAssignment;

import java.util.Scanner;

public class InsertValue
{
    public static void main(String[] args)
    {
        int n,x,y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array :");
        n = Integer.parseInt(sc.next());

        int[] array = new int[10];
        for (int i = 0; i < n; i++)
        {
            System.out.println(" element - : " + i);
            array[i] = Integer.parseInt(sc.next());
        }
        
        		System.out.print("Input the value to be inserted : ");
        		x =Integer.parseInt(sc.next());
        		System.out.print("Input the Position, where the value to be inserted : ");
        		y = Integer.parseInt(sc.next());

        		System.out.println("The current list of the array :");
        		for(int i = 0; i < n; i++) 
        		{
        			System.out.print( array[i]+" ");
        		}
        		
        		for(int i = n; i >= y; i--) 
        		{
        			array[i] = array[i - 1];
        		}
        	     array[y - 1] = x;
                
        	     System.out.println("\nAfter Insert the element the new list is : ");
        		for(int i = 0; i <= n; i++)
        		{
        			System.out.print( array[i]+" ");
        		}
        		System.out.println("\n");
        	}

    }  
    
