package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_01_Page;
import utilities.TestBase;

public class US_01_Test extends TestBase {

    //This Test generates 5 data sets of the "registrieren" type and checks if they are shown
    @Test
    public void TC_01() {

        US_01_Page us01Page = new US_01_Page();

        // Öffnet die dropdown-Liste zur Auswahl des Datensatzes.
        us01Page.dropdown_datentypauswahl.click();

        // Wählt die option "registrierung" in der Datensatz dropdown-Liste und bestätigt diese.
        us01Page.datentypauswahl_registrierung.click();
        Assert.assertEquals(us01Page.dropdown_datentypauswahl.getText(), "registrierung");

        //Setzt die Anzahl der generierte Datensetze auf 5 und bestätigt diese.
        //.clear() methode funktioniert aus irgendeinem Grund nicht und daher wird die Eingabe von einem "Backspace" simuliert. Gerne verbessern sofern möglich.
        us01Page.inputfeld_anzahl_datensaetze.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, "5", Keys.ENTER);
        Assert.assertEquals(us01Page.inputfeld_anzahl_datensaetze.getAttribute("value"), "5");

        //Generiert die Datensätze und überprüft deren Anzahl anhand der Anzahl an Reihen in der Tabelle
        //Die Tabelle checkt nach einer Reihe mehr aufgrund der ersten Reihe, die als Überschrift des Datentyps fungiert.
        us01Page.button_daten_generieren.click();
        Assert.assertEquals(us01Page.table_generierte_daten.getAttribute("aria-rowcount"), "6");
    }
}
