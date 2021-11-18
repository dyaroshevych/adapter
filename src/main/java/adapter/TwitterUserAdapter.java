package adapter;

import user.TwitterUser;
import user.User;

import java.util.Date;

public class TwitterUserAdapter implements User {
    private TwitterUser user;

    public TwitterUserAdapter(TwitterUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public Date getLastActiveTime() {
        return user.getLastActiveTime();
    }
}