package ru.tianji.plugin.config;

import ru.tianji.logging.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PluginConfiguration {

    private final Properties properties = new Properties();


    public void load(String path) {

        try (InputStream input =
                     getClass()
                     .getClassLoader()
                     .getResourceAsStream(path)) {


            if (input == null) {

                Logger.error(
                        "Plugin configuration not found: "
                                + path
                );

                return;
            }


            properties.load(input);

            Logger.info(
                    "Plugin configuration loaded: "
                            + path
            );


        } catch (IOException e) {

            Logger.error(
                    "Plugin configuration loading failed."
            );

            e.printStackTrace();

        }

    }


    public String get(String key) {

        return properties.getProperty(key);

    }


    public String get(
            String key,
            String defaultValue
    ) {

        return properties.getProperty(
                key,
                defaultValue
        );

    }

}
