package Functional_Interfaces;

public class CSVExporter implements Exporter {
    public void export(String data) {
        System.out.println("Exporting CSV: " + data);
    }
}
