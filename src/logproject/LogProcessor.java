package logproject;

import java.util.List;

public class LogProcessor extends Thread {

    private List<String> logs;
    public int infoCount = 0;
    public int errorCount = 0;
    public int warningCount = 0;

    public LogProcessor(List<String> logs) {
        this.logs = logs;
    }

    public void run() {
        for (String line : logs) {
            if (line.contains("INFO"))
                infoCount++;
            else if (line.contains("ERROR"))
                errorCount++;
            else if (line.contains("WARNING"))
                warningCount++;
        }
    }
}