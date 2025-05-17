package encapsulation;

class BankAccount
{
    private double balance;    //private variable (data hiding)

    // public getter method
    public double getBalance()
    {
        return  balance;
    }

    // public setter method
    public void Deposit(double amount)
    {
        if(amount > 0)
        {
            balance += amount;
        }
    }
}

public class Main
{
    public static void main(String[]args)
    {
        BankAccount bankAccount = new BankAccount();  // create the object
        bankAccount.Deposit(1000);
        System.out.println("balance" + bankAccount.getBalance());// getting balance
    }
}
