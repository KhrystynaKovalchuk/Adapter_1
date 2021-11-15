package Task1.twitter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TwitterUserAdapterTest {
    TwitterUser user;
    TwitterUserAdapter userAdapter;

    @BeforeEach
    void setUp() {
        Date date = new Date();
        user = new TwitterUser("cat@gmail.com", "Australia", date);
        userAdapter = new TwitterUserAdapter(user);
    }

    @Test
    void getEmail() {
        assertEquals(userAdapter.getEmail(), "cat@gmail.com");
    }

    @Test
    void getCountry() {
        assertEquals(userAdapter.getCountry(), "Australia");
    }

    @Test
    void getLastActiveTime() {
        assertEquals(userAdapter.getLastActiveTime(), user.getLastActiveTime());
    }
}