package ru.tianji.plugin;

public interface Plugin {

    String getName();

    String getVersion();

    void start();

    void stop();

}
