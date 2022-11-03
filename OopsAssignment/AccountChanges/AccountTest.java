package AakashD12.OopsAssignment.AccountChanges;
import java.util.Scanner;

public class AccountTest 
{
	    public static void main(String[] args) 
	    {
	        int choose,counter=0,select;
	        int accountNo, accountBalance;
	        String accountType=null;
	        
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter your Details below :- ");
	        System.out.println("Enter Account Number:");
	        accountNo = sc.nextInt();
	        
	        System.out.println("Select Account Type:");
	        System.out.println("Press 1 for Saving Account");
	        System.out.println("Press 2 for Current Account");
	        select = sc.nextInt();

	        switch  (select) 
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

	        BankAccount Bankaccount = new BankAccount(accountNo,accountBalance,accountType);

	        while (counter==0) 
	        {
	            System.out.println("\nPlease select the services You Want ");
	            System.out.println("Press 1 for Deposit Amount ");
	            System.out.println("Press 2 for WithDraw Amount ");
	            System.out.println("Press 3 for Display Account Details ");
	            System.out.println("Press 4 for Check Your Account Balance ");
	            System.out.println("Press 5 for exit");
	            choose = sc.nextInt();
	            switch (choose)
	            {
	                case 1:
	                    System.out.println("Enter amount to be deposit");
	                    Bankaccount.deposit(sc.nextInt());
	                    break;
	                case 2:
	                    System.out.println("Enter amount to be withdraw");
	                    Bankaccount.withdraw(sc.nextInt());
	                    break;
	                case 3:
	                    System.out.println(Bankaccount.displayAccountDetails());
	                    break;
	                case 4:
	                    System.out.println("Your Account Balance is :"+ Bankaccount.getAccountBalance());
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
