package post;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jszeligowski on 2018-02-25.
 */
public class UserStorage
{
    private List<String> users;

    public UserStorage()
    {
        this.users = new ArrayList<>();
    }

    public boolean createNewUser( String nickname )
    {
        return users.add( nickname );
    }

    public boolean isUserPresent( String nickname )
    {
        return users.contains( nickname );
    }
}