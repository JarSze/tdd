package Bank;

import bank.Account;
import bank.Bank;
import bank.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jszeligowski on 2018-02-25.
 */
public class BankTest
{
    private User user;
    private Bank bank;
    private Account account;

    @Before
    public void init()
    {
        user = new User( "tom", "dwan" );
        this.bank = new Bank( "mBank" );
        account = new Account();
    }

    @Test
    public void addedUserToBank()
    {
        //Given:
        user = new User( "tom", "dwan" );
        //bank = new Bank( "mBank" );
        //When:
        boolean result = bank.addUserToBank( user );
        //Then:
        Assert.assertTrue( "Method returned false", result );
        Assert.assertEquals( "User is not present in bank list", 1, bank.getUserList().size() );
    }

    public void shouldNotAddNullUser()
    {
        //Given:
        User user=null;
        //When:
        boolean result=bank.addUserToBank( user );
        //Then:
        Assert.assertFalse( "Method returned true",result );
        Assert.assertEquals( "User is present in the bank list", 0,bank.getUserList().size() );
    }
}
