package ru.tianji.config;

import ru.tianji.logging.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationManager {

    private static final Properties properties = new Properties();


    public static void load() {

        try (InputStream input =
                     ConfigurationManager.class
                             .getClassLoader()
                             .getResourceAsStream("config/tianji.properties")) {


            if (input == null) {

                Logger.error("Configuration file not found.");
                return;

            }


            properties.load(input);

            Logger.info("Configuration loaded.");

        } catch (IOException e) {

            Logger.error("Configuration loading failed.");
            e.printStackTrace();

        }

    }


    public static String get(String key) {

        return properties.getProperty(key);

    }


    public static String get(String key, String defaultValue) {

        return properties.getProperty(key, defaultValue);

    }

}
