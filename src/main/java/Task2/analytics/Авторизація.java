package Task2.analytics;

import Task2.analytics.БазаДаних;

public class Авторизація {
    public boolean авторизуватися(БазаДаних db) {
        db.отриматиДаніКористувача();
        return true;
    }
}
