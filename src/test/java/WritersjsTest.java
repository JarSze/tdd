import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Writer;

public class WriterjsTest
{
    private Writersjs writersjs;

    @Before
    public void init()
    {
        writersjs = new Writersjs();
    }

    @Test
    public void sayHelloTest()
    {
        //Writersjs writersjs = new Writersjs();

        String name = "tom";
        String result = writersjs.sayHello( name );
        Assert.assertEquals( "Expected hello message is invalid", "Hello tom", result );
    }

    @Test
    public void isTextUppercaseTest()
    {
        // Writersjs writersjs = new Writersjs();
        String name = "TOM";
        String result = writersjs.sayHello( name );

        StringUtils.isAllUpperCase( result );

        // Assert.assertTrue( isTextUpperCase );

        //System.out.println(isTextUpperCase);
    }

    @Test
    public void sayHelloWithCapitalizedNameSpecified()
    {
        String name = "TOM";
        String result = writersjs.sayHello( name );
        Assert.assertEquals( "HELLO TOM", result );
    }

}
