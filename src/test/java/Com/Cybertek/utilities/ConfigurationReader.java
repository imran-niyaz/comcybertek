package Com.Cybertek.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

    static {
        // this is the path to location of file
        String path = "configuration.properties";

        try {

            // java con not raed files directly , it needs inputstream to read file
            // inputstream takes the location of the file as a constructor
            FileInputStream fileInputStream = new FileInputStream(path);

            //properties is used to read specifically properties files, files with key value pairs
            properties = new Properties();

            //file contents are loaded to properties from inputstreams
            properties.load(fileInputStream);

            //all input streams must be closed.
            fileInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // returns the value of specific
    public static String getProperty(String property){
        return properties.getProperty(property);
    }
}
