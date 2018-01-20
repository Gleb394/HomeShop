package com.homeShop;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Gleb on 08.12.17.
 */
public class PropertiesSetSample {

    private Properties properties = new Properties();

    final private static String PROPERTY_PATH = "src/main/java/resources/SqlQueries.properties";

    public String setSample (String set) throws IOException {
        properties.load(new FileInputStream(PROPERTY_PATH));

        return properties.getProperty(set);
    }
}
