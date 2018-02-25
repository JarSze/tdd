import org.apache.commons.lang3.StringUtils;

/**
 * Created by jszeligowski on 2018-02-24.
 */
public class Writersjs
{
    public String sayHello( String name )
    {
        String nameInMessage = name;
        String greetings = "Hello";


        if( StringUtils.isBlank( nameInMessage )  )
        {
            nameInMessage = "my friend";
        }
        if( StringUtils.isAllUpperCase( nameInMessage ) )
        {
            greetings = StringUtils.upperCase( greetings );
        }
        return greetings + " " + nameInMessage;
    }
}
