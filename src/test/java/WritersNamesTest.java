import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jszeligowski on 2018-02-24.
 */
public class WritersNamesTest
{
    private WritersNames writersNames;

    @Before
    public void init()
    {
        writersNames = new WritersNames();
    }

    @Test
    public void sayHelloWithNamesAndCharts()
    {
        Assert.assertEquals( "Hello Jan, Tom and Steve", writersNames.sayHello( "Jan,Tom,Steve" ) );
    }
}
