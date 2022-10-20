package Assignment2;
import java.util.InputMismatchException;
import java.util.Scanner;

//10101012 = (1 * 2^6) + (0 * 2.5 ) + (1 * 2.4) + (0 * 2.3) + (1 * 2.2) + (0 * 2.1) + (1 * 2.0)
//= 64 + 0 + 16 + 0 + 4 + 0 + 1
//= 64 + 21
//0101012= 85 (Decimal form)
//then divide that number by 8 and take reverse value

public class BinaryToOctal {
    public static void main(String[] args) {
        int n, dec, r, res, p;
        String oct;
        Scanner sc = new Scanner(System.in);
        try {

            System.out.print("Input a Binary Number : ");
            n = Integer.parseInt(sc.next());

        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println(" Invalid Input ");

            System.out.print("Input a Binary Number : ");
            n = Integer.parseInt(sc.next());
        }
        dec = 0;
        oct = "";
        p = 0;
        while (n != 0) {
            int d = n % 10;


            dec = dec + d * power(2, p++);
            n = n / 10;
        }

        while (dec != 0) {
            r = dec % 8;
            oct = r + oct;
            dec = dec / 8;
        }

        System.out.println("The equivalent Octal Number : "+oct);

}
    public static int power(int n,int p)
    {
        int res=1;
        for(int i=1;i<=p;i++)
        {
            res=res*n;
        }
        return res;
    }


}
