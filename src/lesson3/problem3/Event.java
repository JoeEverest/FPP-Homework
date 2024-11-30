package lesson3.problem3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;

public class Event {
    private String eventName;
    private LocalDate eventDate;
    private LocalTime eventTime;

    private static final DateTimeFormatter DISPLAY_FORMAT = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy @ HH:mm z");


    public Event(String eventName, LocalDate eventDate, LocalTime eventTime) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public LocalTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(LocalTime eventTime) {
        this.eventTime = eventTime;
    }

    public int calculateDays() {
        LocalDate today = LocalDate.now();

        return Period.between(eventDate, today).getDays();
    }

    public boolean isLeapYear() {
        int year = this.eventDate.getYear();

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }

    public String getWeekDay(){
        return eventDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }

    public String getFormattedDate(){
        ZonedDateTime eventDateTime = ZonedDateTime.of(eventDate, eventTime, ZoneId.systemDefault());

        return eventDateTime.format(DISPLAY_FORMAT);
    }
}
