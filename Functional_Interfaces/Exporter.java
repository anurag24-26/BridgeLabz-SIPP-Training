package Functional_Interfaces;

public interface Exporter {
    void export(String data);

    default void exportToJSON(String data) {
        System.out.println("Exporting to JSON: " + data);
    }
}
