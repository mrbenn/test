package some_tuts;


/**
 * Created with IntelliJ IDEA.
 * User: benholdstock
 * Date: 15/05/2013
 * Time: 21:12
 * To change this template use File | Settings | File Templates.
 */
public class Tester
{
    public static void main(String[] args)
    {
      BankAccount ba = new BankAccount("theKeeper", 25.00);
        l(ba.GetBalance());
        l(ba.GetOwner());
        l("-----------------------------------------------");
        SavingsAccount sa = new SavingsAccount("ivorTheEngine",125.00);
        sa.Deposit(20.00);
        sa.AddInterest();
        l(sa.GetBalance());
        l(sa.GetOwner());
        l("------------------------------------------------");
        CheckingAccount ca = new CheckingAccount("chorton", 250.00,250);
        ca.withdraw(25.00);
        ca.UseCheck();
        l(ca.GetBalance());
        l(ca.GetOwner());
        l("-------------------------------------------------");
       //BankAccount caf new CheckingWithFees();

    }
    public static void l(Object s)
    {
        System.out.println(s);
    }

}
