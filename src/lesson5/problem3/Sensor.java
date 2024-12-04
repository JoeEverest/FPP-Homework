package lesson5.problem3;

public interface Sensor {
    String getSensorType();
    double getReading();
    String getLocation();
    String getLastUpdated();
    String performAction();
    String toString();
}
