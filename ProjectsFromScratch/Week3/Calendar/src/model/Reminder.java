package model;

public class Reminder extends Entry {

    private String note;

    public Reminder(Date date, Time time, String label) {
        super(date, time, label);
    }

    //getters
    public String getNote(){
        return note;
    }

    //setters
    public void setNote(String note){
        this.note = note;
    }
}
