package ru.tianji.core;

import ru.tianji.config.ConfigurationManager;
import ru.tianji.database.DatabaseManager;
import ru.tianji.logging.Logger;
import ru.tianji.plugin.PluginManager;

public class Core {


    private final PluginManager pluginManager = new PluginManager();


    public void start() {

        Logger.info("Core initialization started.");

        initializeConfiguration();

        initializeDatabase();

        initializePlugins();

        Logger.info("Core initialization completed.");

    }


    private void initializeConfiguration() {

        ConfigurationManager.load();

    }


    private void initializeDatabase() {

        DatabaseManager.initialize();

    }


    private void initializePlugins() {

        pluginManager.loadPlugins();

    }

}
