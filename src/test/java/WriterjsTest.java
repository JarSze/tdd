import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.Writer;

public class WriterjsTest
{
    @Test
    public void sayHelloTest()
    {
        Writersjs writersjs = new Writersjs();

        String name = "tom";
        String result = writersjs.sayHello( name );
        Assert.assertEquals( "Expected hello message is invalid", "Hello tom", result );
    }

}
