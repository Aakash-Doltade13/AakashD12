package AakashD12.OopsAssignment;

class setAccountDetails
{
    private int accountNo;
    private String accountType;
    private int accountBalance, withDrawnBal, depositBal, DepositAmount, WithdrawAmount;

    public setAccountDetails(int accountNo, String accountType, int accountBalance, int depositAmount, int withdrawAmount)
    {
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
        WithdrawAmount = withdrawAmount;
        DepositAmount = depositAmount;
    }

    void withdrawn()
    {
        withDrawnBal = accountBalance - WithdrawAmount;
    }
    void deposit()
    {
        depositBal = accountBalance + DepositAmount;
    }
    void dispAccountDetails(){
        System.out.println("Account Number: " +accountNo);
        System.out.println("Account Type : " +accountType);
        System.out.println("Account Balance : "+accountBalance);
        System.out.println("Withdraw Amount : "+withDrawnBal);
        System.out.println("Deposited Balance : "+depositBal);
    }
}
public class AccountConstructor
{
    public static void main(String[] args)
    {
        setAccountDetails bankAccount = new setAccountDetails(121212121 , "Saving",
                50000 , 3000 , 5000);
        bankAccount.withdrawn();
        bankAccount.deposit();
        bankAccount.dispAccountDetails();
    }
}