package utilities;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ExportFile {
    // Angenommener Download-Ordner im Projektverzeichnis
    private final String downloadPath = System.getProperty("user.dir") + "/downloads";

    // Hilfsmethode: Warten auf Datei im Download-Ordner
    private File waitForFile(String fileName, int timeoutSeconds) throws InterruptedException {
        File file = new File(downloadPath + "/" + fileName);
        int waited = 0;
        while (!file.exists() && waited < timeoutSeconds) {
            TimeUnit.SECONDS.sleep(1);
            waited++;
        }
        return file;
    }
}
