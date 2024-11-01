package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
    private Properties properties;
    private final String propertyFilePath = ".//.//resources/configuration.properties";

    public ConfigFileReader() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration file not found at "+propertyFilePath);
        }
    }

    public String getUrl() {
        String url = properties.getProperty("URL");
        if(url != null) return url;
        else throw new RuntimeException("URL not specified in the configuration.properties file");
    }

    public int getImplicityWait() {
        int implicityWait = Integer.parseInt(properties.getProperty("implicityWait"));
        if(implicityWait != Integer.parseInt(null)) return implicityWait;
        else throw new RuntimeException("URL not specified in the configuration.properties file");
    }

}
