package lesson5.problem3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor{
    String location;
    LocalTime lastUpdated;
    double lightLevel;

    public LightSensor(String location, LocalTime lastUpdated, double lightLevel) {
        this.location = location;
        this.lastUpdated = lastUpdated;
        this.lightLevel = lightLevel;
    }

    @Override
    public String getSensorType() {
        return "Light";
    }

    @Override
    public double getReading() {
        return lightLevel;
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
        if(lightLevel < 100){
            return "Turn on the light";
        }
        return "Light is sufficient";
    }

    @Override
    public String toString() {
        return "Sensor type: " + getSensorType() + "\nReading: " + getReading() + "\nLocation: " + getLocation() + "\nLast Updated: " + getLastUpdated() + "\nAction: " + performAction() + "\n ";
    }
}
