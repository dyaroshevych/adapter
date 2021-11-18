package user;

import adapter.FacebookUserAdapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class FacebookUserTest {
    FacebookUser facebookUser;
    FacebookUserAdapter user;

    @BeforeEach
    void setUp() {
        facebookUser = new FacebookUser("dyaroshevych@gmail.com", "Ukraine", new Date());
        user = new FacebookUserAdapter(facebookUser);
    }

    @Test
    void getEmail(){
        assertEquals(user.getEmail(), "dyaroshevych@gmail.com");
        assertEquals(user.getEmail(), facebookUser.getEmail());
    }

    @Test
    void getCountry(){
        assertEquals(user.getCountry(), "Ukraine");
        assertEquals(user.getCountry(), facebookUser.getUserCountry());
    }

    @Test
    void getLastActiveTime(){
        assertEquals(user.getLastActiveTime(), facebookUser.getUserActiveTime());
    }
}