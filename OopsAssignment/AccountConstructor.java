package OopsTasks;

class setAccountDetails
{
    private int accountNo;
    private String accountType;
    private int accountBalance, withDrawnBal, depositedBal, DepAmount, WithAmount;

    public setAccountDetails(int accountNo, String accountType, int accountBalance, int depAmount, int withAmount)
    {
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
        WithAmount = withAmount;
        DepAmount = depAmount;
    }

    void withdrawn()
    {
        withDrawnBal = accountBalance - WithAmount;
    }
    void deposit()
    {
        depositedBal = accountBalance + DepAmount;
    }
    void dispAccountDetails(){
        System.out.println("Account Number: " +accountNo);
        System.out.println("Account Type : " +accountType);
        System.out.println("Account Balance : "+accountBalance);
        System.out.println("Withdraw Amount : "+withDrawnBal);
        System.out.println("Deposited Balance : "+depositedBal);
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