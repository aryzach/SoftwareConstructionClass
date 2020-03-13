package model;


public class Event extends Entry{

    private Reminder reminder;

    public Event(Date date, Time time, String label) {
        super(date, time, label);
    }

    //getters
    public Reminder getReminder(){
        return reminder;
    }

    //setters
    public void setReminder(Reminder reminder){
        this.reminder = reminder;
    }
}
