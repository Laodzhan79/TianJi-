package ru.tianji.plugin;

import ru.tianji.logging.Logger;
import ru.tianji.plugin.loader.PluginLoader;
public class PluginManager {

    private final PluginRegistry registry =
            new PluginRegistry();

	private final PluginLoader loader =
            new PluginLoader();

public void loadPlugins() {

    Logger.info("Loading plugins...");

    loader.load();

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
