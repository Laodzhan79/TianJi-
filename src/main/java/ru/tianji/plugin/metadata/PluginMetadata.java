package ru.tianji.plugin.metadata;

public class PluginMetadata {

    private final String name;
    private final String version;
    private final String author;
    private final String description;
    private boolean enabled;


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
        this.enabled = true;

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


    public boolean isEnabled() {
        return enabled;
    }


    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

}
