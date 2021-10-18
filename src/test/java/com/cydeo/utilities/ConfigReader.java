package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static final Properties properties = new Properties();

    static {
        try {
            FileInputStream in = new FileInputStream("configuration.properties");
            properties.load(in);
        }catch (IOException e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }

    public String getProperty(String key){
        return properties.getProperty(key);
    }

}
