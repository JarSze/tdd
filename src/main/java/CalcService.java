import org.apache.commons.lang3.StringUtils;

/**
 * Created by jszeligowski on 2018-02-24.
 */
public class CalcService
{
    public int calculate( String text )
    {
        //text = text != null ? text.replaceAll( "[^\\d;]", "" ) : "";
        String[] array = StringUtils.isBlank( text) ? new String[ 0 ] : text.replaceAll( "[^\\d;]",""  ).split( ";" );
        int sum = 0;

        for( int i = 0; i < array.length; i++ )
        {
            sum += Integer.valueOf( array[ i ] );
        }

        return sum;
    }
}
