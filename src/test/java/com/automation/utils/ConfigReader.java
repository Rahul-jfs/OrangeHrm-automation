package com.automation.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties prop;

    public static void initConfig(){
        try {
            prop = new Properties();
            prop.load(new FileInputStream("src/test/resources/config/Config.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getConfigValue(String key){
        return prop.getProperty(key);
    }

}
