/**
 * Created by jszeligowski on 2018-02-24.
 */
public class Writersjs
{
    public String sayHello( String name )
    {
        String nameInMessage = name;
        if( nameInMessage == null || "".equals( nameInMessage ) )
        {
            nameInMessage = "my friend";
        }
        return "Hello " + nameInMessage;
    }
}
