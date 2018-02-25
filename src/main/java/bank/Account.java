package bank;

/**
 * Created by jszeligowski on 2018-02-25.
 */
public class Account
{
    private int userId = 0;
    private int amount = 0;

    public Account()
    {
    }

    public Account( int userId, int amount )
    {
        this.userId = userId;
        this.amount = amount;
    }

    public int getUserId()
    {
        return userId;
    }

    public void setUserId( int userId )
    {
        this.userId = userId;
    }

    public int getAmount()
    {
        return amount;
    }

    public void setAmount( int amount )
    {
        this.amount = amount;
    }
}
