package lesson5.problem3;

import java.time.LocalTime;

public class SensorTest {
    public static void main(String[] args) {
        Sensor[] sensors = new Sensor[5];

        sensors[0] = new TemparatureSensor("Office", LocalTime.now(), 24);
        sensors[1] = new LightSensor("Bedroom", LocalTime.now(), 80);
        sensors[2] = new SoundSensor("Living room", LocalTime.now(), 90);
        sensors[3] = new TemparatureSensor("Kitchen", LocalTime.now(), 33);
        sensors[4] = new LightSensor("Office", LocalTime.now(), 100);

        for (Sensor s:sensors){
            System.out.println(s.toString());
        }
    }
}
