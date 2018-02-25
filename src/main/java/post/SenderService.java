package post;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jszeligowski on 2018-02-25.
 */

public class SenderService
{
    private List<Message> messages;

    public SenderService()
    {
        this.messages = new ArrayList<>();
    }

    public boolean sendMessage( String from, String to, String message )
    {
        Message messageObject = new Message( from, to, message );
        return messages.add( messageObject );
    }
}
