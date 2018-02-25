package post;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jszeligowski on 2018-02-25.
 */
public class UserStorageTest
{
    @Test
    public void shouldCreateNewUserWithGivenNickname()
    {
        //Given:
        UserStorage userStorage = new UserStorage();
        String nickname = "qwerty";

        //When:Messagel
        boolean createNewUserResult = userStorage.createNewUser( nickname );

        //Then:
        Assert.assertTrue( "User was not created.", createNewUserResult );
        Assert.assertTrue( "User was not created.", userStorage.isUserPresent( nickname ) );
    }
}

