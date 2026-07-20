package ru.tianji.plugin.metadata;

public class PluginMetadata {

    private final String name;
    private final String version;
    private final String author;
    private final String description;


    public PluginMetadata(
            String name,
            String version,
            String author,
            String description
    ) {

        this.name = name;
        this.version = version;
        this.author = author;
        this.description = description;

    }


    public String getName() {
        return name;
    }


    public String getVersion() {
        return version;
    }


    public String getAuthor() {
        return author;
    }


    public String getDescription() {
        return description;
    }

}
