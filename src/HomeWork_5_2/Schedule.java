package HomeWork_5_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@NoArgsConstructor
@Data
public class Schedule{

    private Set<Seance> seances;

    public Schedule(Set<Seance> seances) {
        this.seances = seances;
    }

    public void addSeance(Seance seance){
        seances.add(seance);
    }

    public void removeSeance(Seance seance){
        this.seances.remove(seance);
    }

//  toDo Put Seances into TreeSet

//  toDo Make sort with startTime

// ???? Не можу додати два сианси tree set напевно бачить їх однаковими
}
