package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_01_Page {

    public US_01_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


   // This locator is just an example. it must be changed to run any tests
    @FindBy(xpath = "//div[@class='stSelectbox']")
    public WebElement elementsCard;


    // Dropdown-Feld für die Datensatzauswahl
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section/div[1]/div/div/div/div[3]/div/div/div/div[1]")
    public WebElement dropdown_datentypauswahl;

    // Dropdown-Feld für das Dateiformat für den Export
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section/div[1]/div/div/div/div[10]/div/div/div/div[1]")
    public WebElement dropdown_export_dateiformat;


    // Auswählbare Optionen des dropdownfelds für die Datensatzauswahl
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div/div/div/div/ul/div/div/li[1]")
    public WebElement datentypauswahl_registrierung;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div/div/div/div/ul/div/div/li[2]")
       public WebElement datentypauswahl_login;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div/div/div/div/ul/div/div/li[3]")
       public WebElement datentypauswahl_profil;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div/div/div/div/ul/div/div/li[4]")
       public WebElement datentypauswahl_bestellung;


    // Auswählbare Optionen des dropdownfelds für das Dateiformat für Export
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div/div/div/ul/div/div/li[1]")
    public WebElement dropdown_option_export_json;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div/div/div/div/ul/div/div/li[2]")
    public WebElement dropdown_option_export_csv;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div/div/div/div/ul/div/div/li[3]")
    public WebElement dropdown_option_export_xlsx;


    // Eingabefeld der gewünschten Datensatzanzahl
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section/div[1]/div/div/div/div[4]/div/div/div[1]/div/input")
    public WebElement inputfeld_anzahl_datensaetze;



    // Button zum generieren der Datensätze
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section/div[1]/div/div/div/div[5]/div/button")
    public WebElement button_daten_generieren;

    // Button zum exportieren einer Datei
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section/div[1]/div/div/div/div[8]/div/button")
    public WebElement button_datei_exportieren;

    // Button zum downloaden einer Datei
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section/div[1]/div/div/div/div[9]/div/button")
    public WebElement button_datei_downloaden;



    // Tabelle, welche die Ergebnisse der Datensatzgenerierung anzeigt
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section/div[1]/div/div/div/div[8]/div/div/div[2]/div[1]/div/div/div[1]/canvas[1]/table")
    public WebElement table_generierte_daten;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section/div[1]/div/div/div/div[8]/div/div/div[2]/div[1]/div/div/div[2]")
    public WebElement table_generierte_daten_scrollbalken;




    //Tabellenheader für den Datensatz "registrierung" und "login"
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section/div[1]/div/div/div/div[8]/div/div/div[2]/div[1]/div/div/div[1]/canvas[1]/table/thead/tr/th[2]")
    public WebElement table_generierte_daten_header_benutzername;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section/div[1]/div/div/div/div[8]/div/div/div[2]/div[1]/div/div/div[1]/canvas[1]/table/thead/tr/th[3]")
    public WebElement table_generierte_daten_header_passwort;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section/div[1]/div/div/div/div[8]/div/div/div[2]/div[1]/div/div/div[1]/canvas[1]/table/thead/tr/th[4]")
    public WebElement table_generierte_daten_header_passwort_wiederholen;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section/div[1]/div/div/div/div[8]/div/div/div[2]/div[1]/div/div/div[1]/canvas[1]/table/thead/tr/th[5]")
    public WebElement table_generierte_daten_header_agb_akzeptieren;


    //Tabellenheader für den Datensatz "registrierung"
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section/div[1]/div/div/div/div[8]/div/div/div[2]/div[1]/div/div/div[1]/canvas[1]/table/thead/tr/th[2]")
    public WebElement table_generierte_daten_header_nachname;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section/div[1]/div/div/div/div[8]/div/div/div[2]/div[1]/div/div/div[1]/canvas[1]/table/thead/tr/th[3]")
    public WebElement table_generierte_daten_header_vorname;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section/div[1]/div/div/div/div[8]/div/div/div[2]/div[1]/div/div/div[1]/canvas[1]/table/thead/tr/th[4]")
    public WebElement table_generierte_daten_header_strasse;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section/div[1]/div/div/div/div[8]/div/div/div[2]/div[1]/div/div/div[1]/canvas[1]/table/thead/tr/th[5]")
    public WebElement table_generierte_daten_header_stadt;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section/div[1]/div/div/div/div[8]/div/div/div[2]/div[1]/div/div/div[1]/canvas[1]/table/thead/tr/th[6]")
    public WebElement table_generierte_daten_header_postleitzahl;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section/div[1]/div/div/div/div[8]/div/div/div[2]/div[1]/div/div/div[1]/canvas[1]/table/thead/tr/th[7]")
    public WebElement table_generierte_daten_header_land;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section/div[1]/div/div/div/div[8]/div/div/div[2]/div[1]/div/div/div[1]/canvas[1]/table/thead/tr/th[8]")
    public WebElement table_generierte_daten_header_telefonnummer;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section/div[1]/div/div/div/div[8]/div/div/div[2]/div[1]/div/div/div[1]/canvas[1]/table/thead/tr/th[6]")
    public WebElement table_generierte_daten_header_alter;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section/div[1]/div/div/div/div[8]/div/div/div[2]/div[1]/div/div/div[1]/canvas[1]/table/thead/tr/th[7]")
    public WebElement table_generierte_daten_header_geschlecht;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section/div[1]/div/div/div/div[8]/div/div/div[2]/div[1]/div/div/div[1]/canvas[1]/table/thead/tr/th[8]")
    public WebElement table_generierte_daten_header_email;


    //Tabellenheader für den Datensatz "bestellung"
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section/div[1]/div/div/div/div[8]/div/div/div[2]/div[1]/div/div/div[1]/canvas[1]/table/thead/tr/th[2]")
    public WebElement table_generierte_daten_header_produkt;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section/div[1]/div/div/div/div[8]/div/div/div[2]/div[1]/div/div/div[1]/canvas[1]/table/thead/tr/th[3]")
    public WebElement table_generierte_daten_header_menge;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section/div[1]/div/div/div/div[8]/div/div/div[2]/div[1]/div/div/div[1]/canvas[1]/table/thead/tr/th[4]")
    public WebElement table_generierte_daten_header_preis;


}
