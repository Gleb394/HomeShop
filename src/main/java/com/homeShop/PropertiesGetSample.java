package com.homeShop;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Gleb on 08.12.17.
 */
public class PropertiesGetSample {

    private Properties properties = new Properties();
    final private static String PROPERTY_PATH = "/Users/imac/IdeaProjects/HomeShop/src/main/webapp/WEB-INF/SqlQueries.properties";

    public String getSample(String set) throws IOException {
        properties.load(new FileInputStream(PROPERTY_PATH));
        return properties.getProperty(set);
    }
}
