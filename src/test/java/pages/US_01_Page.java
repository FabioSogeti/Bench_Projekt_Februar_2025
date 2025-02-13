package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_01_Page {

    public US_01_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


   // This locator is just an example. it must be changed to run any tests
    @FindBy(xpath = "//div[@class='card-up']")
    public WebElement elementsCard;
}
