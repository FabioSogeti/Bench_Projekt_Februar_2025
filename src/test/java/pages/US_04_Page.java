package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_04_Page {

    public US_04_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    // This locator is just an example. it must be changed to run any tests
    @FindBy(xpath = "//title[1]")
    public WebElement title;
}
