package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.US_01_Page;
import pages.US_04_Page;
import utilities.Driver;
import utilities.TestBase;


    public class US_04_Test extends TestBase {

        US_04_Page us04Page = new US_04_Page();

        //APP funktioniert ohne Internet verbindung
        @Test
        public void testStartWithoutInternet() {
            System.out.println("Bitte vorher die Internetverbindung deaktivieren!");
            //Prüfen, ob die Anwendung geladen wurde
            WebElement header = us04Page.title; // Überschrift auf der Seite
            Assert.assertNotNull(header, "Die Anwendung konnte nicht ohne Internetverbindung gestartet werden.");
        }





    }


