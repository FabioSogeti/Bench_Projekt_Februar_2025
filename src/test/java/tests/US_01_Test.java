package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBase;

public class US_01_Test extends TestBase {

    //This Test is just an example. It needs to be changed to properly run the tests.
    @Test
    public void TC_01() {
        us01Page.elementsCard.click();
        ReusableMethods.waitFor(2);
        Assert.assertFalse(us01Page.elementsCard.isSelected());
    }
}
