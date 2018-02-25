package bank;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jszeligowski on 2018-02-25.
 */
public class Bank
{
    private String name;
    List<User> userList;
    List<Account> accountList;
    private boolean addedUser;

    private static int idCounter = 0;

    public Bank( String name )
    {
        this.name = name;
        this.userList = new ArrayList<>();
        this.accountList = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public List<User> getUserList()
    {
        return userList;
    }

    public List<Account> getAcountList()
    {
        return accountList;
    }

    public boolean addUserToBank( User user )
    {
        boolean result = false;
        if( user != null )
        {
            user.setId( idCounter++ );
            userList.add( user );
            result = true;
        }
        return true;
    }

}
