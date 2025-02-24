package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CsvUtil extends TestBase {

    // Download-Verzeichnis im Projekt
    private static final String downloadPath = System.getProperty("user.dir") + "/downloads";
    public static File csvFile;

    public CsvUtil() throws InterruptedException {
    }

    // Warten auf Datei im Download-Ordner
    public static File waitForFile(String fileName, int timeoutSeconds) throws InterruptedException {
        File file = new File(downloadPath + "/" + fileName);
        int waited = 0;
        while (!file.exists() && waited < timeoutSeconds) {
            TimeUnit.SECONDS.sleep(1);
            waited++;
        }
        return file;
    }

    static {
        try {
            csvFile = CsvUtil.waitForFile("data.csv", 10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // Methode zum Herunterladen der CSV-Datei und Validierung
    public static void downloadCsvFile() throws InterruptedException, IOException {

        // 2. Wartezeit, damit der Download abgeschlossen wird
        File file = waitForFile("data.csv", 15); // Warten auf die Datei für max. 15 Sekunden

        // 3. Überprüfen, ob die Datei erfolgreich heruntergeladen wurde
        Assert.assertTrue(file.exists(), "CSV-Datei wurde nicht heruntergeladen");
        System.out.println(file.getAbsolutePath());
    }


    // CSV-Datei auf Leerheit überprüfen
    public static void csvIsNotEmpty() throws InterruptedException, IOException {
        List<String> lines = Files.readAllLines(csvFile.toPath());
        Assert.assertTrue(lines.size() > 1, "CSV-Datei ist leer oder enthält nur den Header");

        String header = lines.get(0);
        String[] columns = header.split(",");
        int columnCount = columns.length;
        Assert.assertTrue(columnCount > 0, "CSV-Header enthält keine Spalten");

    }

    // CSV-Datei auf Übereinstimmung der Spaltenzahl und leere Werte überprüfen
    public static boolean csvCompare(int columnCount, List<String> lines) throws InterruptedException, IOException {
        for (int i = 1; i < lines.size(); i++) {
            String[] values = lines.get(i).split(",");
            Assert.assertEquals(values.length, columnCount, "Zeile " + i + " entspricht nicht der erwarteten Spaltenanzahl");
            for (String value : values) {
                Assert.assertFalse(value.trim().isEmpty(), "Leerer Wert in Zeile " + i);
            }
        }
        return true;
    }
}
