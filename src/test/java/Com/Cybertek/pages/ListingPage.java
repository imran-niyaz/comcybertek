package Com.Cybertek.pages;

import Com.Cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListingPage {

    public ListingPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "fwqdwcsdav")
    public WebElement address;

    @FindBy(xpath = "fwqdwcsdav")
    public WebElement agent;

    @FindBy(xpath = "fwqdwcsdav")
    public WebElement map;

}
