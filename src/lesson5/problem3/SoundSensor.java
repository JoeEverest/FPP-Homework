package lesson5.problem3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements Sensor{
    String location;
    LocalTime lastUpdated;
    double soundLevel;

    public SoundSensor(String location, LocalTime lastUpdated, double soundLevel) {
        this.location = location;
        this.lastUpdated = lastUpdated;
        this.soundLevel = soundLevel;
    }

    @Override
    public String getSensorType() {
        return "Sound";
    }

    @Override
    public double getReading() {
        return soundLevel;
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
        if(soundLevel > 70){
            return "Turn on noise cancellation";
        }
        return "Sound is within normal range";
    }

    @Override
    public String toString() {
        return "Sensor type: " + getSensorType() + "\nReading: " + getReading() + "\nLocation: " + getLocation() + "\nLast Updated: " + getLastUpdated() + "\nAction: " + performAction() + "\n ";
    }
}
