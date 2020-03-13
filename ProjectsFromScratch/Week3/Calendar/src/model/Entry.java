package model;

public abstract class Entry {

    private Date date;
    private Time time;
    private String label;
    private boolean repeat;
    private Time interval;


    //REQUIRE: date and time to be in the future
    //MODIFY: this
    //EFFECT: instantiate
    public Entry(Date date, Time time, String label){
        this.date = date;
        this.time = time;
        this.label = label;
    }

    //getters

    public Date getDate(){
        return date;
    }

    public Time getTime(){
        return time;
    }

    public String getLabel(){
        return label;
    }

    public boolean getRepeat(){
        return repeat;
    }

    public Time getInterval(){
        return interval;
    }

    //setters

    public void setInterval(Time in){
        this.interval = in;
        this.repeat = true;
    }
}
