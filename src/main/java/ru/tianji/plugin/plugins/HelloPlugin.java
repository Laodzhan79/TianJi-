package ru.tianji.plugin.plugins;

import ru.tianji.logging.Logger;
import ru.tianji.plugin.Plugin;

public class HelloPlugin implements Plugin {


    @Override
    public String getName() {

        return "HelloPlugin";

    }


    @Override
    public String getVersion() {

        return "1.0";

    }


    @Override
    public void start() {

        Logger.info("HelloPlugin started.");

    }


    @Override
    public void stop() {

        Logger.info("HelloPlugin stopped.");

    }

}
