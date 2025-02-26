package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBase;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginCheckTest extends TestBase {

    //This Test is just an example. It needs to be changed to properly run the tests.
    @Test
    public void TC_01() {
        us01Page.elementsCard.click();
        ReusableMethods.waitFor(2);
        us01Page.loginCard.click();
        ReusableMethods.waitFor(2);
        us01Page.numItems.click();
        ReusableMethods.waitFor(2);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].value='';", us01Page.numItems);
        String num = "5";
        us01Page.numItems.clear();
        us01Page.numItems.sendKeys(num);
        ReusableMethods.waitFor(2);
        us01Page.generateData.click();
        ReusableMethods.waitFor(2);
        String successmsg = us01Page.datasuccess.getText();
        System.out.println(successmsg);
        assert successmsg.contains(num) : num + "Datensätze nicht gefunden!";
        ReusableMethods.waitFor(2);
        js.executeScript("window.scrollBy(0, 1000)");
        ReusableMethods.waitFor(2);
        us01Page.exportdata.click();
        ReusableMethods.waitFor(2);
        us01Page.downloadjson.click();
        ReusableMethods.waitFor(2);
        boolean fileExists = checkfileexists();
        Assert.assertTrue(fileExists,"Daten Export Fehlgeschlagen!");
    }

    public boolean checkfileexists(){
        String filePath = "C:\\Users\\fabmarqu\\Downloads";
        File directory = new File(filePath);
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            // Define the regex pattern to match filenames like data(n).csv
            String regex = "data\\((\\d+)\\)\\.json";
            Pattern pattern = Pattern.compile(regex);
            // Variables to store the latest file and highest number
            File latestFile = null;
            int highestNumber = -1;
            // Check each file
            for (File file : files) {
                Matcher matcher = pattern.matcher(file.getName());
                if (matcher.matches()) {
                    int number = Integer.parseInt(matcher.group(1));
                    if (number > highestNumber) {
                        highestNumber = number;
                        latestFile = file;
                    }
                }
            }
            // Check for data.csv without a number
            File dataFile = new File(directory, "data.json");
            if (dataFile.exists() && (highestNumber == -1 || latestFile == null)) {
                latestFile = dataFile;
            }
            if (latestFile != null) {
                System.out.println("Daten erfolgreich exportiert " + latestFile.getName());
                return true;
            } else {
                System.out.println("No file matching the pattern was found.");
                return false;
            }
        } else {
            System.out.println("Directory does not exist.");
            return false;
        }
    }
}

