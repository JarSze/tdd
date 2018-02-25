import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jszeligowski on 2018-02-24.
 */
public class CalculatorTest
{
    private Calculator calculator;

    @Before
    public void init()
    {
        calculator = new Calculator();
    }

    @Test
    public void addTest()
    {
        Assert.assertEquals( 4, calculator.add( 2, 2 ) );
    }

    @Test
    public void minusTest()
    {
        Assert.assertEquals( 4, calculator.minus( 5, 1 ) );
    }
}
