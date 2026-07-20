package ru.tianji.plugin.plugins;

import ru.tianji.logging.Logger;
import ru.tianji.plugin.Plugin;
import ru.tianji.plugin.metadata.PluginMetadata;

public class HelloPlugin implements Plugin {


    private final PluginMetadata metadata =
            new PluginMetadata(
                    "HelloPlugin",
                    "1.0",
                    "TianJi Team",
                    "First test plugin"
            );


    @Override
    public PluginMetadata getMetadata() {

        return metadata;

    }


    @Override
    public void start() {

        Logger.info(
                metadata.getName()
                + " started."
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
