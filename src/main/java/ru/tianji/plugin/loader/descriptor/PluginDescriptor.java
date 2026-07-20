package ru.tianji.plugin.loader.descriptor;


public class PluginDescriptor {


    private final String name;
    private final String version;
    private final String mainClass;


    public PluginDescriptor(
            String name,
            String version,
            String mainClass
    ) {

        this.name = name;
        this.version = version;
        this.mainClass = mainClass;

    }


    public String getName() {

        return name;

    }


    public String getVersion() {

        return version;

    }


    public String getMainClass() {

        return mainClass;

    }

}
