package HomeWork_5_1;

//Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Person, List <Pet>> club;
// В мейн методі створити меню, яке буде реалізовувати наступні функції:
//1) додати учасника в клуб;
//2) додати тваринку до учасника клубу.
//3) видалити тваринку з власника.
//4) видалити учасника клубу.
//5) видалити конкретну тваринку з усіх власників.
//6) вивести на екран зооклуб.

import java.util.*;
import java.util.function.BiConsumer;

public class Main {

    public static void main(String[] args) {
        Person bohdan = new Person(1,"Bohdan", 26);
        Person ivan = new Person(2,"Ivan", 23);
        Person vova = new Person(3,"Vova", 20);
        Person serhiy = new Person(4,"Serhiy", 21);

        Pet monkey = new Pet("Monkey", 3);
        Pet bull = new Pet("Bull", 13);
        Pet dog = new Pet("Dog", 9);
        Pet cat = new Pet("Cat", 4);
        Pet snake = new Pet("Snake", 3);
        Pet rabbit = new Pet("Rabbit", 3);

        Map <Person, List <Pet>> club = new LinkedHashMap<>();


        //1) додати учасника в клуб;

        System.out.println("_________________________________додати учасника в клуб__________________________________");

        club.put(bohdan, new ArrayList<>());
        club.put(ivan, new ArrayList<>());
        club.put(vova, new ArrayList<>());
        club.put(serhiy, new ArrayList<>());

        System.out.println(club);

        //2) додати тваринку до учасника клубу

        System.out.println("_______________________________додати тваринку до учасника клубу__________________________");

        club.get(bohdan).add(monkey);
        club.get(bohdan).add(dog);
        club.get(ivan).add(snake);
        club.get(vova).add(cat);
        club.get(vova).add(dog);
        club.get(serhiy).add(rabbit);
        club.get(serhiy).add(bull);
        club.get(serhiy).add(cat);

        System.out.println(club);

//      видалити тваринку з власника

        System.out.println("____________________________видалити тваринку з власника_____________________________");

        club.get(vova).remove(cat);

        System.out.println(club);


//      видалити учасника клубу

        System.out.println("____________________________видалити учасника клубу_____________________________");


        club.remove(vova);

        System.out.println(club);

//        видалити конкретну тваринку з усіх власників
//        ????????????????????????????????????????????????????????????????????????????????????????????????????????????

        System.out.println("______________________видалити конкретну тваринку з усіх власників__________________________");

        Set<Map.Entry<Person, List<Pet>>> entries = club.entrySet();

        Iterator<Map.Entry<Person, List<Pet>>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Person, List<Pet>> next =  iterator.next();
            next.getValue().remove(dog);
            System.out.println(next.getValue());
        }


//        вивести на екран зооклуб

        System.out.println("______________________________вивести на екран зооклуб___________________________");

        Iterator<Map.Entry<Person, List<Pet>>> iterator1 = entries.iterator();

        while (iterator1.hasNext()) {
            Map.Entry<Person, List<Pet>> next =  iterator1.next();
            System.out.println(next.getValue());
        }





    }
}
