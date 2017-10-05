public class Time{

    /**
- A no-arg constructor that creates a Time object for the current local time.
- A constructor that constructs a Time object with a specified elapse time since midnight, January 1, 1970 in milliseconds. (The data fields value will represent this time.).
- A method named setTime(long elapseTime) that sets a new time for the object using the elapsed time.
 
Write a test program TestTime.java that creates two Time objects (using new Time() and new Time(555550000)) and display their hour, minute, and second.
Note 1: The pseudocode to initialize times with the current time is:
public Time(){
  Calendar cal = Calendar.getInstance();
  hour = cal.get(Calendar.HOUR_OF_DAY);
  minute = cal.get(Calendar.MINUTE);
  second = cal.get(Calendar.SECOND);
}
Note 2: The pseudocode to compute times from the elapsed time in milliseconds in the second constructor is:
totalSeconds is the elapseTime / 1000
time_seconds is the reminder after you divide totalSeconds to 60
totalMinutes is the totalSeconds / 60
time_minutes is the reminder after you divide totalMinutes to 60
totalhours is the totalMinutes / 60
time_hour is the reminder after you divide totalhours to 24
The setTime method does exactly the same thing as the constructor above. It is a modifier method – it changes the data fields of an object that was already created.
    
    **/

    public int hour;
    public int minute;
    public int second;

    public Time( int hour, int minute, int second ){
	this.hour = hour;
	this.minute = minute;
	this.second = second;
    }


    public int getHour(){
	return hour;
    }
    public int getMinute(){
	return minute;
    }
    public int getSecond(){
	return second;
    }


}
