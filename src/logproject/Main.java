package logproject;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        List<String> allLogs = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("log.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            allLogs.add(line);
        }
        br.close();

        int mid = allLogs.size() / 2;

        List<String> part1 = allLogs.subList(0, mid);
        List<String> part2 = allLogs.subList(mid, allLogs.size());

        LogProcessor t1 = new LogProcessor(part1);
        LogProcessor t2 = new LogProcessor(part2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        int totalInfo = t1.infoCount + t2.infoCount;
        int totalError = t1.errorCount + t2.errorCount;
        int totalWarning = t1.warningCount + t2.warningCount;

        System.out.println("INFO Count: " + totalInfo);
        System.out.println("ERROR Count: " + totalError);
        System.out.println("WARNING Count: " + totalWarning);
    }
}