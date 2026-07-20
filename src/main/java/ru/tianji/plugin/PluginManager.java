package ru.tianji.plugin;

import ru.tianji.logging.Logger;
import ru.tianji.plugin.plugins.HelloPlugin;

import java.util.ArrayList;
import java.util.List;

public class PluginManager {

    private final List<Plugin> plugins = new ArrayList<>();


    public void loadPlugins() {

        Logger.info("Loading plugins...");

        registerPlugin(new HelloPlugin());

        startPlugins();

    }


    private void registerPlugin(Plugin plugin) {

        plugins.add(plugin);

        Logger.info(
                "Plugin registered: "
                        + plugin.getName()
                        + " v"
                        + plugin.getVersion()
        );

    }


    private void startPlugins() {

        for (Plugin plugin : plugins) {

            plugin.start();

        }

    }


    public void stopPlugins() {

        for (Plugin plugin : plugins) {

            plugin.stop();

        }

        Logger.info("Plugins stopped.");

    }

}
