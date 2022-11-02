package AakashD12.OopsAssignment.Account;
import java.util.Scanner;

public class AccountTest 
{
	    public static void main(String[] args) 
	    {
	        int count,counter=0,choose;
	        int accountNo, accountBalance;
	        String accountType=null;
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter your Details below :- ");
	        System.out.println("Enter Account Number:");
	        accountNo = sc.nextInt();
	        
	        System.out.println("Select Account Type:");
	        System.out.println("Press 1 for Saving Account");
	        System.out.println("Press 2 for Current Account");
	        choose = sc.nextInt();

	        switch  (choose) 
	        {
	            case 1:
	                accountType ="Saving Account";
	                break;
	            case 2:
	                accountType ="Current Account";
	                break;
	            default:
	                System.out.println("Invalid Input");
	        }
	        System.out.println("Enter Account balance:");
	        accountBalance = sc.nextInt();

	        BankAccount Bankacc = new BankAccount(accountNo,accountBalance,accountType);

	        while (counter==0) 
	        {
	            System.out.println("\nPlease select the services You Want ");
	            System.out.println("Press 1 for Deposit Amount ");
	            System.out.println("Press 2 for WithDraw Amount ");
	            System.out.println("Press 3 for Display Account Details ");
	            System.out.println("Press 4 for Check Your Account Balance ");
	            System.out.println("Press 5 for exit");
	            count = sc.nextInt();
	            switch (count) 
	            {
	                case 1:
	                    System.out.println("Enter amount to be deposit");
	                    Bankacc.deposit(sc.nextInt());
	                    break;
	                case 2:
	                    System.out.println("Enter amount to be withdraw");
	                    Bankacc.withdraw(sc.nextInt());
	                    break;
	                case 3:
	                    System.out.println(Bankacc.displayAccountDetails());
	                    break;
	                case 4:
	                    System.out.println("Your Account Balance is :"+Bankacc.getAccountBalance());
	                    break;
	                case 5:
	                    counter++;
	                    break;

	                default:
	                    System.out.println("please press valid input");
	                    break;
	            }
	        }
	    }
}
