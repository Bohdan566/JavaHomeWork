package HomeWork_5_2;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public interface Write {
    public static void writeCinema(Cinema cinema){
        Set<Map.Entry<Days, Schedule>> entries = cinema.getWeek().entrySet();

        Iterator<Map.Entry<Days, Schedule>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Days, Schedule> next =  iterator.next();
            String day = next.getKey().getDay();
            System.out.println(day);
            Iterator<Seance> iteratorSeance = next.getValue().getSeances().iterator();
            while (iteratorSeance.hasNext()) {
                Seance seance =  iteratorSeance.next();
                System.out.println(seance);
            }
        }
    }
}
