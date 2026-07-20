package ru.tianji.plugin;

import ru.tianji.logging.Logger;

public class PluginManager {

    private final PluginRegistry registry =
            new PluginRegistry();


    public void loadPlugins() {

        Logger.info("Loading plugins...");

        registry.discover();

        startPlugins();

    }


    private void startPlugins() {

        for (Plugin plugin : registry.getPlugins()) {

            plugin.start();

        }

    }


    public void stopPlugins() {

        for (Plugin plugin : registry.getPlugins()) {

            plugin.stop();

        }

        Logger.info("Plugins stopped.");

    }

}
