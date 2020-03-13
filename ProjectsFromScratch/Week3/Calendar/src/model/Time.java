package model;

public class Time {

    private int hour;
    private int minute;

    public Time(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }

    //getters

    public String getTime(){
        return hour + ":" + minute;
    }
}
