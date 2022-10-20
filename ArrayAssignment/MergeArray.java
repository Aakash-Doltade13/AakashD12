
package Arrays2Assign;

import java.util.Scanner;

public class MergeArray 
{
	public static void main(String[] args) 
	{          
		        int n;
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Input the number of elements to be stored in the array :");
		        n = Integer.parseInt(sc.next());
		        int[] a = new int[10]; 
		        int[] b = new int[10]; 
		        int[] c = new int[20]; 
		    
		        int a1 = a.length; 
		    
		        int b1 = b.length; 
		  
		   
		        int c1 = a1 + b1; 
		  
		        System.out.println("First Array Elements : ");
		        for(int i=0; i<n; i++)
		        {
		            System.out.println(" element - : "+i);
		            a[i]=Integer.parseInt(sc.next()) ;
		        }
		        System.out.println("Second Array Elements : ");
		        for(int i=0; i<n; i++)
		        {
		            System.out.println(" element - : "+i);
		            b[i]=Integer.parseInt(sc.next()) ;
		        }
		  
		       
		        for (int i = 0; i < a1; i = i + 1)
		        { 
		           
		            c[i] = a[i]; 
		        } 
		  
		       
		        for (int i = 0; i < b1; i = i + 1) 
		        { 
		            c[a1 + i] = b[i]; 
		        } 
		        System.out.print(" Merge Elements : ");
		        for (int i = 0; i < c1; i = i + 1)
		        {
		            System.out.print(+c[i]+" "); 
		        } 
		    }
		}
		
	


