package ru.tianji.core;

import ru.tianji.database.DatabaseManager;
import ru.tianji.logging.Logger;

public class Core {


    public void start() {

        Logger.info("Core initialization started.");

        initializeDatabase();

        Logger.info("Core initialization completed.");

    }


    private void initializeDatabase() {

        DatabaseManager.initialize();

    }

}
