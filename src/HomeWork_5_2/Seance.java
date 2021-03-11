package HomeWork_5_2;


import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Seance implements Comparable{

    private Movie movie;
    private Time startTime;
    private Time endTime;

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = addEndTime(startTime);
    }

    public Time addEndTime(Time startTime){
        int endHour = startTime.getHour() + this.movie.getDuration().getHour();
        int endMin = startTime.getMin() + this.movie.getDuration().getMin();
        Time endTime = new Time(endHour,endMin);
        return endTime;
    }

    @Override
    public String toString() {
        return  "Seance {" + movie + ", startTime: " + startTime + ", endTime: " + endTime + "}";
    }

    @Override
    public int compareTo(Object object) {
        return 0;
    }
}
