import org.apache.commons.lang3.StringUtils;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by jszeligowski on 2018-02-24.
 */
public class WritersNames
{
    public String sayHello( String name )
    {
        String[] names = name != null ? name.split( "," ) : new String[ 1 ];
        String nameSection = names.length == 1 ? name : convertInputNames( names );
        String greetings = "Hello";

        if( StringUtils.isBlank( nameSection ) )
        {
            nameSection = "my friend";
        }
        if( StringUtils.isAllUpperCase( nameSection ) )
        {
            greetings = StringUtils.upperCase( greetings );
        }
        String output = greetings + ", " + nameSection;
        return isAllUpercase( names ) ? StringUtils.upperCase( output ) : output;
    }

    private String convertInputNames( String[] names )
    {
        StringBuilder stringBuilder = new StringBuilder();
        for( int i = 0; i < names.length; i++ )
        {
            stringBuilder.append( names[ i ] );
            if( i < names.length - 2 )
            {
                stringBuilder.append( ", " );
            }
            else if( i == names.length - 2 )
            {
                stringBuilder.append( " and " );
            }
        }
        return stringBuilder.toString();
    }

    private boolean isAllUpercase( String[] names )
    {
        return Stream.of( names ).allMatch( e -> StringUtils.isAllUpperCase( e ) );
    }

}
