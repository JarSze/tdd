package post;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jszeligowski on 2018-02-25.
 */
public class SenderServiceTest {

    @Test
    public void shouldSendNewMessageSuccessfully() {
        //Given:
        SenderService senderService = new SenderService();
        String message = "Hello World";
        String from = "qwerty";
        String to = "asdf";

        //When:
        boolean result = senderService.sendMessage(from, to, message);

        //Then:
        Assert.assertTrue("Message was not sent", result);
    }
}