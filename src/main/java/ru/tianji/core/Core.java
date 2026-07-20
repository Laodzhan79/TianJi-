package ru.tianji.core;

import ru.tianji.config.ConfigurationManager;
import ru.tianji.database.DatabaseManager;
import ru.tianji.logging.Logger;

public class Core {


    public void start() {

        Logger.info("Core initialization started.");

        initializeConfiguration();

        initializeDatabase();

        Logger.info("Core initialization completed.");

    }


    private void initializeConfiguration() {

        ConfigurationManager.load();

    }


    private void initializeDatabase() {

        DatabaseManager.initialize();

    }

}
