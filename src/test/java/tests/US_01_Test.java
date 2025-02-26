package tests;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_01_Page;
import utilities.ReusableMethods;
import utilities.TestBase;

public class US_01_Test extends TestBase {


    //This Test generates 5 data sets of the "registrieren" type, checks if they are shown and exports those as a .json file
    @Test
    public void TC_01() {

        // In dieser Klasse sind die Selectoren der UI des Datengenerators zwischengelagert. Gerne für andere Tests verwenden und mit weiteren Selectoren erweitern.
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

        // Checkt, ob die tableheader richtig benannt sind
        Assert.assertEquals(us01Page.table_generierte_daten_header_benutzername.getAttribute("innerText"),"benutzername");
        Assert.assertEquals(us01Page.table_generierte_daten_header_passwort.getAttribute("innerText"),"passwort");
        Assert.assertEquals(us01Page.table_generierte_daten_header_passwort_wiederholen.getAttribute("innerText"),"passwort_wiederholen");
        Assert.assertEquals(us01Page.table_generierte_daten_header_agb_akzeptieren.getAttribute("innerText"),"AGB akzeptieren");

        // Wählt die option "registrierung" in der Datensatz dropdown-Liste und bestätigt diese.
        us01Page.dropdown_export_dateiformat.click();
        us01Page.dropdown_option_export_json.click();

        // Betätigt die Buttons Datei exportieren und Datei downloaden in folge.
        us01Page.button_datei_exportieren.click();
        us01Page.button_datei_downloaden.click();

        try {
            Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(5));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Checkt, ob sich die Datei in den übergebenen Dateipfad als den übergebenen Dateityp verfügbar ist
        Assert.assertTrue(ReusableMethods.checkfileexists("C:\\Users\\fabmarqu\\Downloads", "json"));

    }

    //This Test generates 5 data sets of the "registrieren" type, checks if they are shown and exports those as a .csv file
    @Test
    public void TC_02() {

        // In dieser Klasse sind die Selectoren der UI des Datengenerators zwischengelagert. Gerne für andere Tests verwenden und mit weiteren Selectoren erweitern.
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

        // Checkt, ob die tableheader richtig benannt sind
        Assert.assertEquals(us01Page.table_generierte_daten_header_benutzername.getAttribute("innerText"),"benutzername");
        Assert.assertEquals(us01Page.table_generierte_daten_header_passwort.getAttribute("innerText"),"passwort");
        Assert.assertEquals(us01Page.table_generierte_daten_header_passwort_wiederholen.getAttribute("innerText"),"passwort_wiederholen");
        Assert.assertEquals(us01Page.table_generierte_daten_header_agb_akzeptieren.getAttribute("innerText"),"AGB akzeptieren");

        // Wählt die option "registrierung" in der Datensatz dropdown-Liste und bestätigt diese.
        us01Page.dropdown_export_dateiformat.click();
        us01Page.dropdown_option_export_csv.click();

        // Betätigt die Buttons Datei exportieren und Datei downloaden in folge.
        us01Page.button_datei_exportieren.click();
        us01Page.button_datei_downloaden.click();

        try {
            Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(5));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Checkt, ob sich die Datei in den übergebenen Dateipfad als den übergebenen Dateityp verfügbar ist
        Assert.assertTrue(ReusableMethods.checkfileexists("C:\\Users\\fabmarqu\\Downloads", "csv"));

    }

    //This Test generates 5 data sets of the "registrieren" type, checks if they are shown and exports those as a .xlsx file
    @Test
    public void TC_03() {

        // In dieser Klasse sind die Selectoren der UI des Datengenerators zwischengelagert. Gerne für andere Tests verwenden und mit weiteren Selectoren erweitern.
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

        // Checkt, ob die tableheader richtig benannt sind
        Assert.assertEquals(us01Page.table_generierte_daten_header_benutzername.getAttribute("innerText"),"benutzername");
        Assert.assertEquals(us01Page.table_generierte_daten_header_passwort.getAttribute("innerText"),"passwort");
        Assert.assertEquals(us01Page.table_generierte_daten_header_passwort_wiederholen.getAttribute("innerText"),"passwort_wiederholen");
        Assert.assertEquals(us01Page.table_generierte_daten_header_agb_akzeptieren.getAttribute("innerText"),"AGB akzeptieren");

        // Wählt die option "registrierung" in der Datensatz dropdown-Liste und bestätigt diese.
        us01Page.dropdown_export_dateiformat.click();
        us01Page.dropdown_option_export_xlsx.click();

        // Betätigt die Buttons Datei exportieren und Datei downloaden in folge.
        us01Page.button_datei_exportieren.click();
        us01Page.button_datei_downloaden.click();

        try {
            Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(5));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Checkt, ob sich die Datei in den übergebenen Dateipfad als den übergebenen Dateityp verfügbar ist
        Assert.assertTrue(ReusableMethods.checkfileexists("C:\\Users\\fabmarqu\\Downloads", "xlsx"));
    }

    //This Test generates 5 data sets of the "login" type, checks if they are shown and exports those as a .json file
    @Test
    public void TC_04() {

        // In dieser Klasse sind die Selectoren der UI des Datengenerators zwischengelagert. Gerne für andere Tests verwenden und mit weiteren Selectoren erweitern.
        US_01_Page us01Page = new US_01_Page();


        // Öffnet die dropdown-Liste zur Auswahl des Datensatzes.
        us01Page.dropdown_datentypauswahl.click();


        // Wählt die option "registrierung" in der Datensatz dropdown-Liste und bestätigt diese.
        us01Page.datentypauswahl_login.click();
        Assert.assertEquals(us01Page.dropdown_datentypauswahl.getText(), "login");


        //Setzt die Anzahl der generierte Datensetze auf 5 und bestätigt diese.
        //.clear() methode funktioniert aus irgendeinem Grund nicht und daher wird die Eingabe von einem "Backspace" simuliert. Gerne verbessern sofern möglich.
        us01Page.inputfeld_anzahl_datensaetze.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, "5", Keys.ENTER);
        Assert.assertEquals(us01Page.inputfeld_anzahl_datensaetze.getAttribute("value"), "5");


        //Generiert die Datensätze und überprüft deren Anzahl anhand der Anzahl an Reihen in der Tabelle
        //Die Tabelle checkt nach einer Reihe mehr aufgrund der ersten Reihe, die als Überschrift des Datentyps fungiert.
        us01Page.button_daten_generieren.click();
        Assert.assertEquals(us01Page.table_generierte_daten.getAttribute("aria-rowcount"), "6");

        // Checkt, ob die tableheader richtig benannt sind
        Assert.assertEquals(us01Page.table_generierte_daten_header_benutzername.getAttribute("innerText"),"benutzername");
        Assert.assertEquals(us01Page.table_generierte_daten_header_passwort.getAttribute("innerText"),"passwort");


        // Wählt die option "registrierung" in der Datensatz dropdown-Liste und bestätigt diese.
        us01Page.dropdown_export_dateiformat.click();
        us01Page.dropdown_option_export_json.click();

        // Betätigt die Buttons Datei exportieren und Datei downloaden in folge.
        us01Page.button_datei_exportieren.click();
        us01Page.button_datei_downloaden.click();

        try {
            Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(5));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Checkt, ob sich die Datei in den übergebenen Dateipfad als den übergebenen Dateityp verfügbar ist
        Assert.assertTrue(ReusableMethods.checkfileexists("C:\\Users\\fabmarqu\\Downloads", "json"));
    }


    //This Test generates 5 data sets of the "profil" type, checks if they are shown and exports those as a .json file
    @Test
    public void TC_05() {

        // In dieser Klasse sind die Selectoren der UI des Datengenerators zwischengelagert. Gerne für andere Tests verwenden und mit weiteren Selectoren erweitern.
        US_01_Page us01Page = new US_01_Page();


        // Öffnet die dropdown-Liste zur Auswahl des Datensatzes.
        us01Page.dropdown_datentypauswahl.click();


        // Wählt die option "registrierung" in der Datensatz dropdown-Liste und bestätigt diese.
        us01Page.datentypauswahl_profil.click();
        Assert.assertEquals(us01Page.dropdown_datentypauswahl.getText(), "profil");


        //Setzt die Anzahl der generierte Datensetze auf 5 und bestätigt diese.
        //.clear() methode funktioniert aus irgendeinem Grund nicht und daher wird die Eingabe von einem "Backspace" simuliert. Gerne verbessern sofern möglich.
        us01Page.inputfeld_anzahl_datensaetze.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, "5", Keys.ENTER);
        Assert.assertEquals(us01Page.inputfeld_anzahl_datensaetze.getAttribute("value"), "5");


        //Generiert die Datensätze und überprüft deren Anzahl anhand der Anzahl an Reihen in der Tabelle
        //Die Tabelle checkt nach einer Reihe mehr aufgrund der ersten Reihe, die als Überschrift des Datentyps fungiert.
        us01Page.button_daten_generieren.click();
        Assert.assertEquals(us01Page.table_generierte_daten.getAttribute("aria-rowcount"), "6");

        // Checkt, ob die tableheader richtig benannt sind
        Assert.assertEquals(us01Page.table_generierte_daten_header_nachname.getAttribute("innerText"),"nachname");
        Assert.assertEquals(us01Page.table_generierte_daten_header_vorname.getAttribute("innerText"),"vorname");
        Assert.assertEquals(us01Page.table_generierte_daten_header_strasse.getAttribute("innerText"),"straße");
        Assert.assertEquals(us01Page.table_generierte_daten_header_stadt.getAttribute("innerText"),"stadt");
        Assert.assertEquals(us01Page.table_generierte_daten_header_postleitzahl.getAttribute("innerText"),"postleitzahl");
        Assert.assertEquals(us01Page.table_generierte_daten_header_land.getAttribute("innerText"),"land");
        Assert.assertEquals(us01Page.table_generierte_daten_header_telefonnummer.getAttribute("innerText"),"telefonnummer");
        Assert.assertEquals(us01Page.table_generierte_daten_header_alter.getAttribute("innerText"),"alter");
        Assert.assertEquals(us01Page.table_generierte_daten_header_geschlecht.getAttribute("innerText"),"geschlecht");
        Assert.assertEquals(us01Page.table_generierte_daten_header_email.getAttribute("innerText"),"email");


        // Wählt die option "registrierung" in der Datensatz dropdown-Liste und bestätigt diese.
        us01Page.dropdown_export_dateiformat.click();
        us01Page.dropdown_option_export_json.click();

        // Betätigt die Buttons Datei exportieren und Datei downloaden in folge.
        us01Page.button_datei_exportieren.click();
        us01Page.button_datei_downloaden.click();

        try {
            Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(5));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Checkt, ob sich die Datei in den übergebenen Dateipfad als den übergebenen Dateityp verfügbar ist
        Assert.assertTrue(ReusableMethods.checkfileexists("C:\\Users\\fabmarqu\\Downloads", "json"));
    }


    //This Test generates 5 data sets of the "bestellung" type, checks if they are shown and exports those as a .json file
    @Test
    public void TC_06() {

        // In dieser Klasse sind die Selectoren der UI des Datengenerators zwischengelagert. Gerne für andere Tests verwenden und mit weiteren Selectoren erweitern.
        US_01_Page us01Page = new US_01_Page();


        // Öffnet die dropdown-Liste zur Auswahl des Datensatzes.
        us01Page.dropdown_datentypauswahl.click();


        // Wählt die option "registrierung" in der Datensatz dropdown-Liste und bestätigt diese.
        us01Page.datentypauswahl_profil.click();
        Assert.assertEquals(us01Page.dropdown_datentypauswahl.getText(), "bestellung");


        //Setzt die Anzahl der generierte Datensetze auf 5 und bestätigt diese.
        //.clear() methode funktioniert aus irgendeinem Grund nicht und daher wird die Eingabe von einem "Backspace" simuliert. Gerne verbessern sofern möglich.
        us01Page.inputfeld_anzahl_datensaetze.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, "5", Keys.ENTER);
        Assert.assertEquals(us01Page.inputfeld_anzahl_datensaetze.getAttribute("value"), "5");


        //Generiert die Datensätze und überprüft deren Anzahl anhand der Anzahl an Reihen in der Tabelle
        //Die Tabelle checkt nach einer Reihe mehr aufgrund der ersten Reihe, die als Überschrift des Datentyps fungiert.
        us01Page.button_daten_generieren.click();
        Assert.assertEquals(us01Page.table_generierte_daten.getAttribute("aria-rowcount"), "6");


        // Checkt, ob die tableheader richtig benannt sind
        Assert.assertEquals(us01Page.table_generierte_daten_header_produkt.getAttribute("innerText"),"produkt");
        Assert.assertEquals(us01Page.table_generierte_daten_header_menge.getAttribute("innerText"),"menge");
        Assert.assertEquals(us01Page.table_generierte_daten_header_preis.getAttribute("innerText"),"preis");


        // Wählt die option "registrierung" in der Datensatz dropdown-Liste und bestätigt diese.
        us01Page.dropdown_export_dateiformat.click();
        us01Page.dropdown_option_export_json.click();

        // Betätigt die Buttons Datei exportieren und Datei downloaden in folge.
        us01Page.button_datei_exportieren.click();
        us01Page.button_datei_downloaden.click();

        try {
            Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(5));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Checkt, ob sich die Datei in den übergebenen Dateipfad als den übergebenen Dateityp verfügbar ist
        Assert.assertTrue(ReusableMethods.checkfileexists("C:\\Users\\fabmarqu\\Downloads", "json"));
    }
}
