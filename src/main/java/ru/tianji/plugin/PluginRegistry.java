package ru.tianji.plugin;

import ru.tianji.logging.Logger;

import java.util.ArrayList;
import java.util.List;

public class PluginRegistry {

    private final List<Plugin> plugins = new ArrayList<>();


    public void discover() {

        Logger.info("Discovering plugins...");

        Logger.info("No external plugins loaded yet.");
        Logger.info(
                "Plugins discovered: "
                        + plugins.size()
        );

    }


    private void register(Plugin plugin) {

        plugins.add(plugin);

        Logger.info(
                "Plugin added to registry: "
                        + plugin.getMetadata().getName()
        );

    }


    public List<Plugin> getPlugins() {

        return plugins;

    }

}
