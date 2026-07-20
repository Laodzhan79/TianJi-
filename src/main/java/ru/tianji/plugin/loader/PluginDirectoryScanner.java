package ru.tianji.plugin.loader;

import ru.tianji.logging.Logger;

import java.io.File;

public class PluginDirectoryScanner {


    private final File pluginDirectory =
            new File("plugins");


    public void scan() {

        Logger.info("Scanning plugin directory...");


        if (!pluginDirectory.exists()) {

            Logger.info(
                    "Plugin directory not found."
            );

            return;
        }


        File[] files =
                pluginDirectory.listFiles();


        if (files == null) {

            Logger.info(
                    "Plugin directory is empty."
            );

            return;
        }


        for (File file : files) {

            Logger.info(
                    "Found plugin resource: "
                            + file.getName()
            );

        }

    }

}
