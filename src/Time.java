/**
 * The Time class represents a time value in hours, minutes, and seconds.
 */
public class Time {
    private int second;
    private int minute;
    private int hour;

    /**
     * Constructs a Time object with hours, minutes, and seconds.
     * @param hours the hour component in Time object
     * @param minutes the hour component in Time object
     * @param seconds the hour component in Time object
     */
    public Time (int hours, int minutes, int seconds){
       hour = hours;
       minute = minutes;
       second =  seconds;
    }

    /**
     * Increase Time by 1 second
     */
    public void tick(){
        second ++;
        if (second == 60){
            minute ++;
            second = 0;
        }
        if (minute == 60){
            hour ++;
            minute = 0;
        }
        if (hour == 24){
            hour = 0;
        }
    }

    /**
     * Adds two Time objects together
     * @param added The Time object to add to current Time object
     */
    public void add (Time added){
        hour = (hour + added.hour) ;
        minute = (minute + added.minute);
        second = (second + added.second);

        if (second > 59){
            second = second - 60;
            minute ++;
        }
        if (minute > 60){
            minute = minute - 60;
            hour++;
        }
        if (hour > 23){
            hour = hour - 24;}
    }

    /**
     * Returns a string representation of the time in rge format "HH:MM:SS".
     *
     * @return a string representing the Time object
     */
    public String toString(){
        return  String.format("%02d", hour) +":"+String.format("%02d", minute)+":"+String.format("%02d", second);
    }
}
