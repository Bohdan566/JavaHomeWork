package HomeWork_5_2;


import lombok.val;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        Time:
//    - int min, int hour;
//    - передбачити межі для цих полів (для min 0..59, для hour 0..23);


        Time time1 = new Time(232, 45);
        System.out.println(time1);






//      Movie:
//         - String title, Time duration (або ж можете забити на власний Time і використати java.time.Duration, як і тут, так і в інших класах.
//         це за власним бажанням)



        Movie XXX = new Movie("XXX", new Time(1, 50));
        Movie Bled = new Movie("Bled", new Time(2, 10));
        Movie Friends = new Movie("Friends", new Time(2, 05));
        Movie Friends_2 = new Movie("Friends_2", new Time(1, 50));
        Movie Hobbit = new Movie("Hobbit", new Time(3, 10));


        List<Movie> movies = new ArrayList<>();
        movies.add(XXX);
        movies.add(Bled);
        movies.add(Friends);
        movies.add(Friends_2);

//        movies.forEach(movie -> System.out.println(movie));








//        Seance:
//        - Movie movie, Time startTime, Time endTime;
//        - в конструктор має надходити параметрами значення для перших двох полів,
//        третє поле повинне обчислюватись (start + duration);


        Seance a = new Seance(XXX, new Time(13, 40));
        Seance b = new Seance(Bled, new Time(10, 55));
        Seance c = new Seance(Friends, new Time(23, 20));
        Seance d = new Seance(XXX, new Time(19, 00));
        Seance f = new Seance(Friends_2, new Time(23, 00));
        Seance g = new Seance(Hobbit, new Time(17, 00));

        Set<Seance> seances = new LinkedHashSet<>();
        seances.add(a);
        seances.add(b);
        seances.add(c);

        Set<Seance> seances2 = new LinkedHashSet<>();

        Set<Seance> seances3 = new LinkedHashSet<>();

        Set<Seance> seances4 = new LinkedHashSet<>();
        seances4.add(a);
        seances4.add(b);
        seances4.add(c);
        seances4.add(d);


//        Stream<Seance> stream = seances.stream();
//        stream.forEach(i -> System.out.println(i));







//        Schedule:
//   - TreeSet <Seance> (в полі пишемо Set <Seance>, а в конструкторі вже =new TreeSet <Seance>() );
//   - Сортування по startTime.  toDo this task
//   - методи: addSeance (Seance), removeSeance (Seance);

        Schedule a1 = new Schedule(seances);

        a1.addSeance(d);
        a1.removeSeance(a);

//        a1.getSeances().forEach(seance -> System.out.println(seance));

        System.out.println("__________________________________________________________________________");

        Schedule a2 = new Schedule(seances2);

        a2.addSeance(a);
        a2.addSeance(d);

//        a2.getSeances().forEach(seance -> System.out.println(seance));

        System.out.println("_____________________________________________________________________________");

        Schedule a3 = new Schedule(seances3);

        a3.addSeance(c);
        a3.addSeance(f);

//        a3.getSeances().forEach(seance -> System.out.println(seance));

        System.out.println("_____________________________________________________________________________");







//Cinema:
//   - TreeMap<Days, Schedule>, Time open, Time close;
//   - врахувати час відкриття і закриття при формуванні сеансів!
//   - методи:
//      addSeances (String day, Seance...seance) (додає набір сеансів в конкретний день),
//      addSeance (Seance, String) (додає один сеанс в конкретний день),
//      removeMovie(Movie) (повністю видаляє усі сеанси вказаного фільму з розкладу),
//      removeSeance (Seance, String) (видаляє конкретний сеанс фільму в конкретний день, який задається параметром String).




        TreeMap<Days, Schedule> september_1 = new TreeMap<>();
        september_1.put(Days.MONDAY, a1);
        september_1.put(Days.TUESDAY, a2);
        september_1.put(Days.WEDNESDAY, a3);


        Cinema lviv = new Cinema(september_1, new Time(9, 0), new Time(3, 0));

//      Це метод для виведення класу Cinema
        Write.writeCinema(lviv);






//      addSeances (String day, Seance...seance) (додає набір сеансів в конкретний день)

        lviv.addSeances(Days.THURSDAY, seances4);

        System.out.println("_______________________________________додає набір сеансів в конкретний день________________________________________________");

//      Це метод для виведення класу Cinema
        Write.writeCinema(lviv);







//     addSeance (Seance, String) (додає один сеанс в конкретний день)

        System.out.println("_________________________________додає один сеанс в конкретний день___________________________________");

        lviv.addSeance(Days.THURSDAY, f);
        lviv.addSeance(Days.THURSDAY, g);

//      Це метод для виведення класу Cinema
        Write.writeCinema(lviv);







//     removeMovie(Movie) (повністю видаляє усі сеанси вказаного фільму з розкладу)

        System.out.println("_________________________________(повністю видаляє усі сеанси вказаного фільму з розкладу)__________________________________");

//        lviv.removeMovie(XXX);  toDo recomment this line

//      Це метод для виведення класу Cinema
//        Write.writeCinema(lviv);  toDo recomment this line








//     removeSeance (Seance, String) (видаляє конкретний сеанс фільму в конкретний день, який задається параметром String)

        System.out.println("_____________________(видаляє конкретний сеанс фільму в конкретний день, який задається параметром String)______________________");

        lviv.removeSeance(g, Days.THURSDAY);
        lviv.removeSeance(f, Days.THURSDAY);
        lviv.removeSeance(f, Days.WEDNESDAY);

//    Це метод для виведення класу Cinema
        Write.writeCinema(lviv);


    }

}


