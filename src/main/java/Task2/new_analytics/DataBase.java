package Task2.new_analytics;

import Task2.analytics.БазаДаних;

public class DataBase extends БазаДаних {
    public БазаДаних database;

    public DataBase(БазаДаних database){
        this.database = database;
    }

    public String getUserData(){
        return отриматиДаніКористувача();
    }
    public String getStatisticData(){
        return отриматиСтатистичніДані();
    }
}
