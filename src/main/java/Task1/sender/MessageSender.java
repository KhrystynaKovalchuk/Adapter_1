package Task1.sender;

import Task1.facebook.FacebookUser;
import Task1.twitter.TwitterUser;

import java.util.Objects;

public class MessageSender {
    public boolean send(String text, User user, String country) {
        return Objects.equals(user.getCountry(), country);
    }
}
