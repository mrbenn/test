package some_tuts;

/**
 * Created with IntelliJ IDEA.
 * User: benholdstock
 * Date: 14/05/2013
 * Time: 19:13
 * To change this template use File | Settings | File Templates.
 */
public class SavingsAccount extends BankAccount {
    private final double INTEREST_RATE = 0.05;

    public SavingsAccount()
    {
      super();
    }

    public SavingsAccount(String owner, double initialBalance)
    {
        super(owner, initialBalance);
    }

    public void AddInterest()
    {
        double increase = (this.GetBalance() * INTEREST_RATE);
        this.Deposit(increase);
    }
}
