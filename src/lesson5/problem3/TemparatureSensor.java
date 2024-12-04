package lesson5.problem3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TemparatureSensor implements Sensor{
    String location;
    LocalTime lastUpdated;
    double temperature;

    public TemparatureSensor(String location, LocalTime lastUpdated, double temperature) {
        this.location = location;
        this.lastUpdated = lastUpdated;
        this.temperature = temperature;
    }

    @Override
    public String getSensorType() {
        return "Temperature";
    }

    @Override
    public double getReading() {
        return temperature;
    }

    @Override
    public String getLocation() {
        return "";
    }

    @Override
    public String getLastUpdated() {
        lastUpdated = LocalTime.now();
        return lastUpdated.format(DateTimeFormatter.ofPattern("hh:mm a"));
    }

    @Override
    public String performAction() {
        if(temperature > 30){
            return "Turn on the AC";
        }
        if(temperature < 18){
            return "Turn on the Heater";
        }
        return "Temperature is in normal range";
    }

    @Override
    public String toString() {
        return "Sensor type: " + getSensorType() + "\nReading: " + getReading() + "\nLocation: " + getLocation() + "\nLast Updated: " + getLastUpdated() + "\nAction: " + performAction() + "\n ";
    }
}
