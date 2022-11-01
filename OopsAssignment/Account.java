package OopsTasks;

import java.util.Scanner;

public class Account {
    int accountno;
    String accounttype;
    int accountbal, withdrawbal,depositebal,withamount,depamount;

    void setAccountDetails() {
        Scanner sc =new Scanner(System.in);

        System.out.println("Acoount Number : ");
         accountno= sc.nextInt();

        System.out.println("Acoount Type : ");
         accounttype= sc.next();

        System.out.println("Acoount Balance : ");
         accountbal= sc.nextInt();

        System.out.println("Amount Withdraw : ");
        int withamount= sc.nextInt();

        System.out.println("Amount Deposite : ");
        int depamount= sc.nextInt();


    }
    int  withdraw() {

          withdrawbal = accountbal - withamount;
                 return withdrawbal;
    }

    int deposit() {

         depositebal = accountbal + depamount;
        return depositebal ;
    }

    void dispAccountDetails() {

        System.out.println("Account Number : "+ accountno);
        System.out.println("Account Type : "+accounttype);
        System.out.println("Account Balance : "+ accountbal);
        System.out.println("Withdraw Amount : "+ withdrawbal);
        System.out.println("Deposite Balance : "+ depositebal);

    }

    class Main1 {
        public static void main(String[] args) {

            Account account =new Account();

            account.setAccountDetails();
            account.withdraw();
            account.deposit();
            account.dispAccountDetails();

        }
    }
}