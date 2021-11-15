package Task1.twitter;

import Task1.sender.User;

import java.util.Date;

public class TwitterUserAdapter implements User {
    private TwitterUser twitterUser;

    public TwitterUserAdapter(TwitterUser user){
        this.twitterUser = user;
    }

    @Override
    public String getEmail() {
        return twitterUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }

    @Override
    public Date getLastActiveTime() {
        return twitterUser.getLastActiveTime();
    }
}
