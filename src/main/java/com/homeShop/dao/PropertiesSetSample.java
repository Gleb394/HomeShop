package com.homeShop.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Gleb on 08.12.17.
 */
public class PropertiesSetSample {

    Properties properties = new Properties();

    final public static String PROPERTY_PATH = "/Users/imac/IdeaProjects/HomeShop/src/main/java/resources/SqlQueries.properties";

    public String setSample (String set) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(PROPERTY_PATH);
        properties.load(fileInputStream);

        return properties.getProperty(set);
    }
}
