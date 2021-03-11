package HomeWork_5_2;


import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

public class Time {

    private int hour;
    private int min;

    // constructor
//    constructor Hour
    public Time(int hour, int min) {
        int maxHour = 23;
        int minHour = 0;
        if (hour > maxHour) {
            this.hour = hour - 24;
            if (this.hour > maxHour) {
                this.hour = maxHour;
            }
//  toDo          next Day
        } else if (hour < minHour) {
            this.hour = minHour;
        } else {
            this.hour = hour;
        }
//    constructor Minute

        int maxMin = 59;
        int minMin = 0;
        if (min > maxMin) {
            this.min = min - 60;
            this.hour = hour + 1;
            if (this.min > maxMin) {
                this.min = maxMin;
            }
        } else if (min < minMin) {
            this.min = minMin;
        } else {
            this.min = min;
        }

    }

    @Override
    public String toString() {
        return "{ " + hour + " : " + min + " }";
    }
}
