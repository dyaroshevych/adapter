package user;

import adapter.FacebookUserAdapter;
import adapter.TwitterUserAdapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;


class MessageSenderTest {
    MessageSender messageSender;
    User user_1;
    User user_2;

    @BeforeEach
    void setUp() {
        messageSender = new MessageSender();
        FacebookUser facebookUser = new FacebookUser("artemloh@mail.ru", "Russia", new Date());
        TwitterUser twitterUser = new TwitterUser("lovevika@gmail.com", "Ukraine", new Date());
        user_1 = new FacebookUserAdapter(facebookUser);
        user_2 = new TwitterUserAdapter(twitterUser);
    }

    @Test
    void send() {
        assertFalse(messageSender.send("Hello USA!", user_1, "USA"));
        assertTrue(messageSender.send("Goodbye Ukraine!", user_2, "Ukraine"));
    }
}