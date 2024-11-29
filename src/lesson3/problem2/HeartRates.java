package lesson3.problem2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HeartRates {
    private String firstName, lastName;
    private LocalDate dateOfBirth;

    public HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
    public int calculateCurrentAge() {
        LocalDate today = LocalDate.now();

        return Period.between(dateOfBirth, today).getYears();
    }


    private final int RHR = 70;
    private final float LB = 0.5f;
    private final float UB = 0.85f;

    public int getMaximumHeartRate(){
        int currentAge = calculateCurrentAge();

        return 220 - currentAge;
    }

    public void getTargetHRRange(){
        int averageHeartRate = getMaximumHeartRate() - RHR;

        int lowerBoundary = (int)((averageHeartRate*LB)+RHR);
        int upperBoundary = (int)((averageHeartRate*UB)+RHR);

        System.out.println("\nYour target heart rate range is between "+lowerBoundary+" and "+upperBoundary);
    }

    public String toString() {
        return String.format(
                "\nFirst Name: %s \nLast Name: %s \nAge: %d \nDate of Birth: %s \nMaximum Heart Rate: %d",
                firstName, lastName, calculateCurrentAge(), dateOfBirth, getMaximumHeartRate()
        );
    }
}
