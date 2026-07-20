package ru.tianji.plugin.loader;

import ru.tianji.logging.Logger;
import ru.tianji.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;

public class PluginLoader {


    private final List<Plugin> loadedPlugins =
            new ArrayList<>();


    private final PluginDirectoryScanner scanner =
            new PluginDirectoryScanner();


    public List<Plugin> load() {

        Logger.info(
                "Plugin loader started."
        );


        scanner.scan();


        Logger.info(
                "Loaded plugins: "
                        + loadedPlugins.size()
        );


        return loadedPlugins;

    }

}
