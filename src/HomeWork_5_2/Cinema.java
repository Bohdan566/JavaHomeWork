package HomeWork_5_2;

import lombok.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Cinema {

    private TreeMap<Days, Schedule> week;
    private Time open;
    private Time close;



//    addSeances (String day, Seance...seance) (додає набір сеансів в конкретний день)

    public void addSeances(Days day, Set<Seance> seances){
        this.week.put(day, new Schedule(seances));
    }




//    addSeance (Seance, String) (додає один сеанс в конкретний день)

    public void addSeance(Days day, Seance seance){
        Set<Map.Entry<Days, Schedule>> entries = this.week.entrySet();
        Iterator<Map.Entry<Days, Schedule>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Days, Schedule> next =  iterator.next();
            Schedule value = next.getValue();
            value.addSeance(seance);
        }
    }

//    removeMovie(Movie) (повністю видаляє усі сеанси вказаного фільму з розкладу)

//    public void removeMovie(Movie movie){
//        Set<Map.Entry<Days, Schedule>> entries = this.week.entrySet();
//        Iterator<Map.Entry<Days, Schedule>> iterator = entries.iterator();
//
//        while (iterator.hasNext()) {
//            Map.Entry<Days, Schedule> next =  iterator.next();
//            Schedule schedule = next.getValue();
//            Iterator<Seance> iterator1 = schedule.getSeances().iterator();
//            while (iterator1.hasNext()) {
//                Seance seance =  iterator1.next();
//                if(seance.getMovie() == movie){
//                    schedule.removeSeance(seance);
//                }
//
//                System.out.println(seance);
//                toDo there is a problem (method find seances but can't remove)
//            }
//        }
//    }




//    removeSeance (Seance, String)(видаляє конкретний сеанс фільму в конкретний день, який задається параметром String)

    public void removeSeance (Seance seance, Days day) {
        this.week.get(day).removeSeance(seance);
    }



        public String toString() {
             return "Cinema{" +
                "week=" + week +
                ", open=" + open +
                ", close=" + close +
                '}';
        }
}
