package some_tuts;

/**
 * Created with IntelliJ IDEA.
 * User: benholdstock
 * Date: 14/05/2013
 * Time: 19:13
 * To change this template use File | Settings | File Templates.
 */
public class CheckingAccount extends BankAccount {

    private int remainingChecks;

    public CheckingAccount()
    {
        //super();
        remainingChecks = 100;
    }

    public CheckingAccount(String owner, double initialBalance, int remainingChecks)
    {
        super(owner, initialBalance);
        this.remainingChecks = remainingChecks;
    }

    public  void UseCheck()
    {
        remainingChecks--;
    }

    public void GetCheck()
    {
        remainingChecks++;
    }

}
