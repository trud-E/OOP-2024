package Time;

public class Time implements Comparable<Time>{
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    public void setTime(int hour, int minute, int second){
        if(!isValidTime(hour, minute, second)){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
        System.out.println("Error validTime!");
    }

    public String universalFormat() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String standardFormat(){
        int standardHour = (hour == 0 || hour == 12) ? 12 : hour % 12;
        String period = (hour < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", standardHour, minute, second, period);
    }

    public static boolean isValidTime(int hour, int minute, int second) {
        return (hour >= 0 && hour < 24) && (minute >= 0 && minute < 60) && (second >= 0 && second < 60);
    }

    public static Time addTimes(Time t1, Time t2) {
        int hour = t1.hour + t2.hour;
        int minute = t1.minute + t2.minute;
        int second = t1.second + t2.second;

        if (second >= 60) {
            second -= 60;
            minute++;
        }
        if (minute >= 60) {
            minute -= 60;
            hour++;
        }
        hour %= 24;

        return new Time(hour, minute, second);
    }

    public Time add(Time other) {
        int hour = this.hour + other.hour;
        int minute = this.hour + other.hour;
        int second = this.second + other.second;
        if (second >= 60) {
            second -= 60;
            minute++;
        }
        if (minute >= 60) {
            minute -= 60;
            hour++;
        }
        hour %= 24;
        return new Time(hour, minute, second);
    }

    public String toString() {
        return universalFormat();
    }

    @Override
    public int compareTo(Time time) {
        if (this.hour != time.hour) {
            return this.hour - time.hour; // Сравниваем часы
        }
        if (this.minute != time.minute) {
            return this.minute - time.minute; // Сравниваем минуты
        }
        return this.second - time.second;
    }
}
