package ru.tianji.plugin.plugins;

import ru.tianji.logging.Logger;
import ru.tianji.plugin.Plugin;
import ru.tianji.plugin.config.PluginConfiguration;
import ru.tianji.plugin.metadata.PluginMetadata;

public class HelloPlugin implements Plugin {


    private final PluginMetadata metadata =
            new PluginMetadata(
                    "HelloPlugin",
                    "1.0",
                    "TianJi Team",
                    "First configurable plugin"
            );


    private final PluginConfiguration configuration =
            new PluginConfiguration();


    @Override
    public PluginMetadata getMetadata() {

        return metadata;

    }


    @Override
    public void start() {

        configuration.load(
                "plugins/hello/config.properties"
        );


        String message =
                configuration.get(
                        "plugin.message",
                        "Default message"
                );


        Logger.info(
                metadata.getName()
                + ": "
                + message
        );

    }


    @Override
    public void stop() {

        Logger.info(
                metadata.getName()
                + " stopped."
        );

    }

}
