package model;

public class Date {

    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    //getters
    public int getSum(){
        return month+day+year;
    }

    public String getShortDate(){
        String shortDate = month + "/" + day + "/" + year;
        return shortDate;
    }

    public String getLongDate() {
        String stringMonth;
        switch(month) {
            case 1:
                stringMonth = "Jan";
                break;
            case 2:
                stringMonth = "Feb";
                break;
            case 3:
                stringMonth = "Mar";
                break;
            default:
                stringMonth = "other month";
        }
        String longDate = stringMonth + day + "," + year;
        return longDate;
    }
}
