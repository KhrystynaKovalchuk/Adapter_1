package Task1.facebook;

import Task1.sender.User;
import lombok.AllArgsConstructor;

import java.util.Date;


public class FacebookUserAdapter extends FacebookUser implements User {
    private final FacebookUser facebookUser;

    public FacebookUserAdapter(FacebookUser user){
        this.facebookUser = user;
    }

    @Override
    public String getEmail() {
        return facebookUser.getEmail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getUserCountry();
    }

    @Override
    public Date getLastActiveTime() {
        return facebookUser.getUserActiveTime();
    }
}
