package model;

import java.util.ArrayList;
import java.util.List;

public class Calendar {

    Date currentDate;
    ArrayList<Entry> entries;
    String email;

    public Calendar(Date currentDate){
        this.currentDate = currentDate;
        this.entries = new ArrayList<>();
    }

    //getters

    public List<Entry> getEntries() {
        return entries;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public String getEmail() {
        return email;
    }

    //setters

    public void setEmail(String e){
        this.email = e;
    }

    //functions

    //REQUIRES: e not null
    //MODIFY: this
    //EFFECTS: adds the entry to list
    public void addEntry(Entry e){
        entries.add(e);
    }

    //REQUIRES: entry not null, entry in entries
    //MODIFY: this
    //EFFECTS: remove the entry from entries
    public void removeEntry(Entry e){
        if(entries.contains(e)) {
            entries.remove(e);
        }
    }


    //EFFECTS: return the entry that's coming up soonest
    public Entry soonestEntry() {
        int lowestDate = 0;
        Date tdate = new Date(12, 12, 12);
        Time ttime = new Time(12, 12);
        Entry soonestEntry = new Event(tdate, ttime, "ok");
        for (Entry e : entries) {
            Date d = e.getDate();
            if (entries.get(0) == e) {
                lowestDate = d.getSum();
                soonestEntry = e;
            }
            if (d.getSum() < lowestDate) {
                lowestDate = d.getSum();
                soonestEntry = e;
            }
        }
        return soonestEntry;
    }

    //EFFECTS: return a list of meetings
    public ArrayList<Entry> getAllMeetings(){
        return entries;
    }
}
