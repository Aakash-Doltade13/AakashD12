package NewAssign;

import java.util.Scanner;

public class NumPattern
{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Row : ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = n; j <=n; j--)
            {
                System.out.print(j+" ");
            }
            for(int j = 1; j <=i; j++)
            {
                System.out.print(j+" ");
            }
            for(int k = i-1; k >= 1; k--)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}