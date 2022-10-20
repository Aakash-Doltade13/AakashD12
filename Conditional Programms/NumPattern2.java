package NewAssign;

public class NumPattern2
{
     public static void main(String[] args) 
     {
    	 for (int i=0;i<=5;i++)
    	 {
    		 for(int j=0;j<=60-i;j++)
    		 {
    			 System.out.print(" ");
    		 }
    		 int a=1;
    		 for(int j=0;j<=i;j++)
    		 {
    			 System.out.print(a+" ");
    			 a=a*(i-j)/(j+1);
    		 }
    		 System.out.println();
    	 }
 }
}
