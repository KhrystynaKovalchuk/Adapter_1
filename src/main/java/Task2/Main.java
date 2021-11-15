package Task2;

import Task2.analytics.Авторизація;
import Task2.analytics.БазаДаних;
import Task2.new_analytics.Authorization;
import Task2.new_analytics.DataBase;
import Task2.reports.ReportBuilder;

public class Main {
    public static void main(String[] args) {
        БазаДаних db = new БазаДаних();
        DataBase database = new DataBase(db);
        Авторизація авторизація = new Авторизація();
        Authorization authorization = new Authorization(авторизація);
        if (authorization.authorize(database)) {
            ReportBuilder br = new ReportBuilder(database);
        }
    }
}
