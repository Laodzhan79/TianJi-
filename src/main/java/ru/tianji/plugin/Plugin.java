package ru.tianji.plugin;

import ru.tianji.plugin.metadata.PluginMetadata;

public interface Plugin {

    PluginMetadata getMetadata();

    void start();

    void stop();

}
