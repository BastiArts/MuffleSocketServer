package com.bastiarts.muffle.util;

import java.io.IOException;
import java.util.Properties;

/**
 * MuffleSocketServer
 *
 * @author: Sebastian Schiefermayr
 * Date: 14.02.2020
 * Time: 11:53
 * =====================================
 * Website: https://bastiarts.com
 * Email: basti@bastiarts.com
 * Github: https://github.com/BastiArts
 * =====================================
 */
public class PropertyUtil {
    private static PropertyUtil instance = null;
    private Properties props = new Properties();

    private PropertyUtil() {
    }

    /**
     * Singleton for easy access
     */
    public static PropertyUtil getInstance() {
        if (instance == null) {
            instance = new PropertyUtil();
        }
        return instance;
    }

    /**
     * Reads the configFile
     */
    public void init() {
        try {
            props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));
        } catch (
                IOException e) {
            System.err.println("Properties file could not be loaded!");
        }
    }

    public Properties getProps() {
        return props;
    }
}
