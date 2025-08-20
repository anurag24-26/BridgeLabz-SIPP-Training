package Functional_Interfaces;

public class PatientData implements java.io.Serializable, Backupable, SensitiveData {
    private String name;
    private String diagnosis;

    public PatientData(String name, String diagnosis) {
        this.name = name;
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return name + " - " + diagnosis;
    }
}
