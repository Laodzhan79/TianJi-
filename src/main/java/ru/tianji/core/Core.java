package ru.tianji.core;

import ru.tianji.database.DatabaseManager;

public class Core {

    public void start() {

        System.out.println("Core initialization started.");

        initializeDatabase();

        System.out.println("Core initialization completed.");

    }


    private void initializeDatabase() {

        DatabaseManager.initialize();

    }

}
