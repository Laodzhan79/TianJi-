package ru.tianji.plugin.plugins;

import ru.tianji.plugin.Plugin;
import ru.tianji.plugin.metadata.PluginMetadata;

public class HelloPlugin implements Plugin {

    private final PluginMetadata metadata =
            new PluginMetadata(
                    "HelloPlugin",
                    "1.0",
                    "TianJi Team",
                    "First configurable plugin"
            );


    @Override
    public PluginMetadata getMetadata() {

        return metadata;

    }


    @Override
    public void start() {

        System.out.println("HelloPlugin started");

    }


    @Override
    public void stop() {

        System.out.println("HelloPlugin stopped");

    }

}
