package utilities;

import java.io.FileInputStream;
import java.util.Properties;

    public class ConfigReader {

        // We are creating the ConfigReader class to read the .properties file.
        public static Properties properties;
        // We made it static because we want to access it directly without creating an object.
        static {

            String path = "configuration.properties";

            try {
                FileInputStream fileInputStream = new FileInputStream(path);
                properties = new Properties();
                properties.load(fileInputStream);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        public static String getProperty(String key){
            return properties.getProperty(key);
            //  properties.getProperty("browser")
        }
    }

