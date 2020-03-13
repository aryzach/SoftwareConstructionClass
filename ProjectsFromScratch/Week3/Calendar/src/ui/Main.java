package ui;

import model.*;

public class Main {

    public static void main(String[] args) {
        Time firstTime = new Time(1,10);
        Date firstDate = new Date(1,10,1990);
        Time secondTime = new Time(2,10);
        Date secondDate = new Date(2,10,1990);
        Time thirdTime = new Time(3,10);
        Date thirdDate = new Date(3,10,1990);

        System.out.println(firstDate.getLongDate());
        firstDate.getShortDate();
        firstTime.getTime();

        Reminder firstReminder = new Reminder(firstDate,firstTime ,"ok");
        Entry secondReminder = new Reminder(secondDate,secondTime,"ok2");
        System.out.println(firstReminder.getClass());
        System.out.println(secondReminder.getClass());



        Entry firstMeeting = new Meeting(firstDate,firstTime,"now");
        Entry secondMeeting = new Meeting(thirdDate,thirdTime,"now3");
        Meeting thirdMeeting = new Meeting(secondDate,secondTime,"now2");

        Event firstEvent = new Event(firstDate,firstTime,"yeah");
        Entry secondEvent = new Event(secondDate,secondTime,"yea2");
        firstEvent.setReminder(firstReminder);



        Calendar myCal = new Calendar(firstDate);

        System.out.println("get all meetings but none added");
        System.out.println(myCal.getAllMeetings());

        System.out.println("get email but no email added");
        System.out.println(myCal.getEmail());

        myCal.setEmail("email@amail.com");
        System.out.println(myCal.getEmail());

        myCal.addEntry(secondEvent);
        myCal.addEntry(secondMeeting);
        myCal.addEntry(firstReminder);
        myCal.addEntry(firstEvent);
        myCal.addEntry(thirdMeeting);
        myCal.addEntry(firstMeeting);
        myCal.addEntry(secondReminder);

        System.out.println(myCal.getAllMeetings());

        System.out.println(myCal.getEntries());

        myCal.removeEntry(secondMeeting);

        System.out.println(myCal.getAllMeetings());

        System.out.println(myCal.getEntries());



    }




}
