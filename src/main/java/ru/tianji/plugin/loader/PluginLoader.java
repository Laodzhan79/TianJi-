package ru.tianji.plugin.loader;

import ru.tianji.logging.Logger;
import ru.tianji.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;

public class PluginLoader {

    private final List<Plugin> loadedPlugins = new ArrayList<>();


    public List<Plugin> load() {

        Logger.info("Plugin loader started.");

        Logger.info(
                "Loaded plugins: "
                        + loadedPlugins.size()
        );

        return loadedPlugins;

    }

}
