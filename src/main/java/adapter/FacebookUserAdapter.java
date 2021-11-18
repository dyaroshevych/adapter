package adapter;

import user.FacebookUser;
import user.User;

import java.util.Date;

public class FacebookUserAdapter extends FacebookUser implements User {
    private FacebookUser user;

    public FacebookUserAdapter(FacebookUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public String getCountry() {
        return user.getUserCountry();
    }

    @Override
    public Date getLastActiveTime() {
        return user.getUserActiveTime();
    }
}