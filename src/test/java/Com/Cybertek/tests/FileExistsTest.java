package Com.Cybertek.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileExistsTest {

    @Test
    public void test(){
        String current = System.getProperty("user.dir");

        System.out.println(current);

        //get the user folder
        String userFolder = System.getProperty("user.home");
        System.out.println(userFolder);

        String path = userFolder + "/downloads/some-file.txt";

        System.out.println(path);

        Assert.assertTrue(Files.exists(Paths.get(path)));

        String driversPath = userFolder + "/Documents/Cybertek/dependencies/WebDrivers/chromedriver";

        System.out.println(driversPath);

        Assert.assertTrue(Files.exists(Paths.get(driversPath)));

    }
}
