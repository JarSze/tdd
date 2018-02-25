import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jszeligowski on 2018-02-24.
 */
public class CalcServiceTest
{
    private CalcService calcService;

    @Before
    public void init()
    {
        calcService = new CalcService();
    }

    @Test
    public void shouldAddDigitsStringAndProduceResult()
    {
        Assert.assertEquals( 9, calcService.calculate( "9" ) );
    }


}
