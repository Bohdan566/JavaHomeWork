package HomeWork_7_1;

//Створити енум Стать.
// Створити клас Юзер з плоями : ід, ім'я , вік, Стать.
// Ствроити 10 об'єктів Юзера з відповідними ід (1-10)
// Свторити  arrayList , та покласти цих юзерів в arayList.
// - Проітерувати колекцію юзерів, вивевши тільки юзерів з парним значенням ід
//- Проітерувати колекцію юзерів, вивевши тільки юзерів з ім'ям , довжина якого більше ніж 5 символів
//- Проітерувати колекцію юзерів, вивевши тільки юзерів жінок

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        User user1 = new User(1, "Bohdan", 26, Gender.MALE);
        User user2 = new User(2, "Katie", 30, Gender.FEMALE);
        User user3 = new User(3, "Ivanko", 27, Gender.MALE);
        User user4 = new User(4, "Ivan", 26, Gender.MALE);
        User user5 = new User(5, "Vasya", 21, Gender.MALE);
        User user6 = new User(6, "Olenka", 20, Gender.FEMALE);
        User user7 = new User(7, "Olena", 34, Gender.FEMALE);
        User user8 = new User(8, "Ivanka", 25, Gender.FEMALE);
        User user9 = new User(9, "Igor", 29, Gender.MALE);
        User user10 = new User(10, "Lyna", 24, Gender.FEMALE);

        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);

        users.stream().forEach(user -> System.out.println(user));

//      - Проітерувати колекцію юзерів, вивевши тільки юзерів з парним значенням ід

        System.out.println("________________________- Проітерувати колекцію юзерів, вивевши тільки юзерів з парним значенням ід________________________");

        List<User> collect = users.stream()
                .filter(user -> (user.getId() % 2 == 0))
                .collect(Collectors.toList());
        collect.forEach(user -> System.out.println(user));
        
//      - Проітерувати колекцію юзерів, вивевши тільки юзерів з ім'ям , довжина якого більше ніж 5 символів

        System.out.println("______________________Проітерувати колекцію юзерів, вивевши тільки юзерів з ім'ям , довжина якого більше ніж 5 символів__________________");


        List<User> collect1 = users.stream()
                .filter(user -> (user.getName().length() > 5))
                .collect(Collectors.toList());

        collect1.forEach(user -> System.out.println(user));


//        - Проітерувати колекцію юзерів, вивевши тільки юзерів жінок

        System.out.println("___________________________________- Проітерувати колекцію юзерів, вивевши тільки юзерів жінок_________________________________");

        Set<User> collect2 = users.stream()
                .filter(user -> user.getGender() == Gender.FEMALE)
                .collect(Collectors.toSet());

        collect2.forEach(user -> System.out.println(user));


    }
}
