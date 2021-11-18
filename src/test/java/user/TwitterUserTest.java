package user;

import adapter.TwitterUserAdapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwitterUserTest {
    TwitterUser twitterUser;
    TwitterUserAdapter user;

    @BeforeEach
    void setUp() {
        twitterUser = new TwitterUser("dyaroshevych@gmail.com", "Ukraine", new Date());
        user = new TwitterUserAdapter(twitterUser);
    }

    @Test
    void getEmail(){
        assertEquals(user.getEmail(), "dyaroshevych@gmail.com");
        assertEquals(user.getEmail(), twitterUser.getUserMail());
    }

    @Test
    void getCountry(){
        assertEquals(user.getCountry(), "Ukraine");
        assertEquals(user.getCountry(), twitterUser.getCountry());
    }

    @Test
    void getLastActiveTime(){
        assertEquals(user.getLastActiveTime(), twitterUser.getLastActiveTime());
    }
}