package tests;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.US_07_Page;
import utilities.*;
import java.io.IOException;


import static utilities.Driver.driver;

public class US_07_Test extends TestBase {

    US_07_Page us07Page = new US_07_Page();

    /**
     * TC010 – Export der Testdaten im CSV-Format:
     * Das CSV-Dokument enthält alle Testdaten. Jede Zeile entspricht einem Testdatensatz, jede Spalte einem Attribut.
     * Es dürfen keine Daten fehlen oder fehlerhaft formatiert sein.
     */
    @Test
    public void testExportCSV() throws IOException, InterruptedException {


        //Datensatz input
        us07Page.datensatzInput.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = '';", us07Page.datensatzInput); // Değeri temizle
        us07Page.datensatzInput.sendKeys("1"); // Yeni değeri gir

        //click on Daten generieren
        us07Page.datenGenButton.click();
        //wähle dropdown
        us07Page.exportCSVDropdown.click();
        us07Page.csvOption.click();
        //click on Datenexpo
        us07Page.datenExpoButton.click();

        //Download
        //Man muss die alte datei im dem Rechner gelöst haben
        us07Page.downloadButton.click();


    }
}