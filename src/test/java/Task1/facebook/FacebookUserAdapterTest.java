package Task1.facebook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class FacebookUserAdapterTest {
    FacebookUser user;
    FacebookUserAdapter userAdapter;

    @BeforeEach
    void setUp() {
        Date date = new Date();
        user = new FacebookUser("cat@gmail.com", "Australia", date);
        userAdapter = new FacebookUserAdapter(user);
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
        assertEquals(userAdapter.getLastActiveTime(), user.getUserActiveTime());
    }
}