package Com.Cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class AmazonHelperclass_misran {


    WebDriver driver;

    private String chromeBrowser = "Chrome";
    private String firefoxBrowser = "Firefox";
    //private String safariBrowser = "Safari";
   // private String IEBrowser = "IE";


    private String browserType = chromeBrowser;


    @BeforeMethod
    public void beforeEachTest() {


        switch (browserType) {

            case "Chrome":
                driver = useChromeBrowser();
                break;
            case "Firefox":
                driver = useFirefoxBrowser();
                break;
          /*  case "Safari":
                driver = useSafariBrowser();
                break;*/
           /* case "IE":
                driver = useIEBrowser();
                break;*/
            default:
                driver = useChromeBrowser();
                break;

        }

        //max the window
        driver.manage().window().maximize();
        //wait for each element for 15 seconds
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //wait for the website to be loaded
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

    }

   /* private WebDriver useIEBrowser() {

        WebDriverManager.iedriver().setup();
        driver = new InternetExplorerDriver();
        return driver;

    }*/

   /* private WebDriver useSafariBrowser() {

        driver = new SafariDriver();
        return driver;
    }
    */

    private WebDriver useFirefoxBrowser() {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        return driver;
    }

    private WebDriver useChromeBrowser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;

    }

    @AfterMethod
    public void afterEachTest() {

        // after each test if there is any driver object(opened browsers), kill it.
        if (driver != null) {

            driver.quit();
        }
    }
}
