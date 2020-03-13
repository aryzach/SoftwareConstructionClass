package model;

import java.util.List;

public class Meeting extends Event {

    List<String> attendees;

    public Meeting(Date date, Time time, String label) {
        super(date, time, label);
    }

    public void addAttendee(String at){
        attendees.add(at);
    }

    public void removeAttendee(String at){
        attendees.remove(at);
    }

    public void sendInvites(){
        for(String at : attendees){
            System.out.println(at + " you're invited!");
        }
    }

}
