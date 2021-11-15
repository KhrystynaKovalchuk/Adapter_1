package Task2.new_analytics;

import Task2.analytics.Авторизація;
import Task2.analytics.БазаДаних;

public class Authorization extends Авторизація{
    public Авторизація authorization;

    public Authorization(Авторизація authorization){
        this.authorization = authorization;
    }

    public boolean authorize(БазаДаних database){
        return authorization.авторизуватися(database);
    }
}
