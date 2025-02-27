package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class TestBaseCross {
    protected WebDriver driver;
// @Optional --> Parametreyi xml dosyasından her zaman sağlamak istemediğimizden, @Optional kullaniyoruz
// @Parameters -> browser türünü xml dosyasından nasıl alabiliriz ???
// @Parameters kullanarak: bu, testbasecross'in xml dosyasını okumasına yardımcı olacaktır.
// "browser'i" bulun ve değeri atayın

    @Parameters("browser")
    @BeforeMethod
    public void setUp(@Optional String browser) {
        driver = DriverCross.getDriver(browser);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown() {
        DriverCross.closeDriver();
    }
}

