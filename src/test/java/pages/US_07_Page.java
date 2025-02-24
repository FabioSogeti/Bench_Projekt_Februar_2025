package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_07_Page {
    public US_07_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Angenommene Buttons – bitte IDs ggf. anpassen:
    @FindBy(xpath ="(//div[@data-baseweb='select'])[2]")
    public WebElement exportCSVDropdown;

    @FindBy(xpath = "//div[contains(@class, 'st') and @data-baseweb='input']//input")
    public WebElement datensatzInput;

    @FindBy(xpath = "//p[text()='🛠️ Daten generieren']")
    public WebElement datenGenButton;

    @FindBy(xpath = "//p[text()='💾 Daten exportieren']")
    public WebElement datenExpoButton;

    @FindBy(xpath = "//div[text()='csv']")
    public WebElement csvOption;

    @FindBy(xpath = "//p[text()='📥 Download CSV']")
    public WebElement downloadButton;

}


