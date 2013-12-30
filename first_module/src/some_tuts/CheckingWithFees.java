package some_tuts;

/**
 * Created with IntelliJ IDEA.
 * User: benholdstock
 * Date: 14/05/2013
 * Time: 20:37
 * To change this template use File | Settings | File Templates.
 */
public class CheckingWithFees extends CheckingAccount {

    private final double FEES = 20.00;

    public CheckingWithFees()
    {
        super();
    }

    public CheckingWithFees(String owner, double initialBalance, int initialCheckAccount)
    {
        super(owner, initialBalance, initialCheckAccount);
    }

    public void DeductFees()
    {
        this.withdraw(FEES);
    }

}
