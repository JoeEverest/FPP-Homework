package lesson3.problem3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Question3 {
    private static final DateTimeFormatter DISPLAY_FORMAT = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy @ HH:mm (VV)");

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter event name:");
        String eventName = input.nextLine();

        LocalDate eventDate = null;
        while (eventDate == null) {
            System.out.println("Enter event date (yyyy-mm-dd):");
            String date = input.nextLine();

            try {
                eventDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please enter the date in yyyy-mm-dd format.");
            }
        }

        LocalTime eventTime = null;
        while (eventTime == null) {
            System.out.println("Enter event date (HH:mm):");
            String time = input.nextLine();

            try {
                eventTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm"));
            } catch (DateTimeParseException e) {
                System.out.println("Invalid time format. Please enter the time in HH:mm format.");
            }
        }

        Event event = new Event(eventName, eventDate, eventTime);

        System.out.println("\nYou've created an event");
        System.out.println("Event name: "+ event.getEventName());

        ZonedDateTime eventDateTime = ZonedDateTime.of(event.getEventDate(), event.getEventTime(), ZoneId.systemDefault());
        System.out.println();

        System.out.println(formatEventDetails(eventDateTime));
        System.out.println();

        System.out.println("Is leap year? "+ (event.isLeapYear() ? "Yes":"No"));


        long daysUntilEvent = event.calculateDays();
        System.out.println("Days until event: " + daysUntilEvent);

        // Time Zone Conversion
        System.out.println("\nEnter a time zone to convert to (e.g., America/Chicago):");
        String targetTimeZone = input.nextLine();
        convertTimeZone(eventDateTime, targetTimeZone);


        input.close();
    }

    private static String formatEventDetails(ZonedDateTime eventDateTime) {
        return eventDateTime.format(DISPLAY_FORMAT);
    }

    private static void convertTimeZone(ZonedDateTime eventDateTime, String targetTimeZone) {
        try {
            ZoneId targetZone = ZoneId.of(targetTimeZone);
            ZonedDateTime convertedDateTime = eventDateTime.withZoneSameInstant(targetZone);
            System.out.println("Converted Time: " + formatEventDetails(convertedDateTime));
        } catch (Exception e) {
            System.out.println("Invalid Time Zone. Please try again.");
        }
    }
}
