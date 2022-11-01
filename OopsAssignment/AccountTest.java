package OopsTasks;
class customer
{
    String custname,custAdd;
    int custid;

    customer(String name, int id,String Add )
     {
        custname = name;
        custid=custid;
        custAdd=custAdd;

    }
    void display()
    {
        System.out.println("Customer Name : " + custname);
        System.out.println("Customer Id : " + custid);
        System.out.println("Customer Address : " + custAdd);

    }
}
class CustomerAccount
{
     int acctid,acctBalance;
     String acctType;
    CustomerAccount(int Id ,String Type,int Balance)
    {
        acctid= Id;
        acctType= Type;
        acctBalance= Balance;
    }
    void display()
    {
        System.out.println("Account  ID : " + acctid);
        System.out.println("Account Type : " + acctType);
        System.out.println("Account Balance : " + acctBalance);

    }

}
public class AccountTest
{
    public static void main(String[] args)
    {
        customer customer=new customer("abc",123,"xyz");
        CustomerAccount customerAccount=new CustomerAccount(456,"Saving",5000);
        customer.display();
        customerAccount.display();

    }
}
