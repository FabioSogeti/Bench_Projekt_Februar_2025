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
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section[2]/div[1]/div/div/div/div[4]/div/div/div/div[1]")
    public WebElement dropdown_datentypauswahl;


    // Auswählbare Optionen des dropdownfelds für die Datensatzauswahl
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div/div/div/div/ul/div/div/li[1]")
    public WebElement datentypauswahl_registrierung;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div/div/div/div/ul/div/div/li[2]")
    public WebElement datentypauswahl_login;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div/div/div/div/ul/div/div/li[3]")
    public WebElement datentypauswahl_profil;


    // Eingabefeld der gewünschten Datensatzanzahl
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section[2]/div[1]/div/div/div/div[5]/div/div/div[1]/div/input")
    public WebElement inputfeld_anzahl_datensaetze;


    // Button zum generieren der Datensätze
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section[2]/div[1]/div/div/div/div[6]/div/button")
    public WebElement button_daten_generieren;


    // Tabelle, welche die Ergebnisse der Datensatzgenerierung anzeigt
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/section[2]/div[1]/div/div/div/div[8]/div/div/div[2]/div[1]/div/div/div[1]/canvas[1]/table")
    public WebElement table_generierte_daten;


}
