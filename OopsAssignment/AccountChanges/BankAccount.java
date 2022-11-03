package AakashD12.OopsAssignment.AccountChanges;

public class BankAccount 
{
	    private int accountNo;
	    private float accountBalance,  withdrawAmount, depositAmount;
	    private String accountType;
	    
	    BankAccount(int accNo, float accBalance, String accType) 
	    {
	        accountNo = accNo;
	        accountBalance = accBalance;
	        accountType = accType;
	    }

	    public void setAccountNo(int accountNo) {
	        this.accountNo = accountNo;
	    }

	    public void setAccountBalance(float accountBalance) {
	        this.accountBalance = accountBalance;
	    }

	    public void setWithdrawAmount(float withdrawAmount) {
	        this.withdrawAmount = withdrawAmount;
	    }

	    public void setDepositAmount(float depositAmount) {
	        this.depositAmount = depositAmount;
	    }

	    public void setAccountType(String accountType) {
	        this.accountType = accountType;
	    }

	    public int getAccountNo() {
	        return accountNo;
	    }
	    public float getAccountBalance() {
	        return accountBalance;
	    }

	    public float getWithdrawAmount() {
	        return withdrawAmount;
	    }
	    public float getDepositAmount() {
	        return depositAmount;
	    }
	    public String getAccountType() {
	        return accountType;
	    }
	    
	    public String displayAccountDetails() 
	    {
	        return "Account Number is : "+accountNo+"\n"+"Account Type : "+accountType+"\n"+"Account Balance is : "+accountBalance;
	    }
	    
	    public void withdraw(float depositAmount) 
	    {
	        withdrawAmount = depositAmount;
	        if(withdrawAmount<=0)
	        {
	            System.out.println("Invalid input...Please Enter valid input");
	        }
	        if (accountBalance >= withdrawAmount) 
	        {
	            accountBalance -= withdrawAmount;

	            System.out.println("Please collect your money :" + withdrawAmount);
	        } else 
	        {
	            System.out.println("Insufficient Balance");
	        }
	    }
	    
	    public void deposit(float depositAmount) 
	    {
	        this.depositAmount = depositAmount;
	        accountBalance += depositAmount;
	        System.out.println("Your Money has been successfully Deposited :" + accountBalance);
	    }
}
