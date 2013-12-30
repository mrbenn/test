package some_tuts;
/**
 * Created with IntelliJ IDEA.
 * User: benholdstock
 * Date: 14/05/2013
 * Time: 19:12
 * To change this template use File | Settings | File Templates.
 */
public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(){
        owner = "mrbenn";
        balance = 0.00;
    }

    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }

    public void Deposit(double amount)
    {
        balance += amount;
        //balance = balance + amount
    }

    public void withdraw(double amount)
    {
        balance -= amount;
        // balance = balance - amount
    }

    public String GetOwner()
    {
        return this.owner;
    }

    public double GetBalance()
    {
        return this.balance;
    }
}

