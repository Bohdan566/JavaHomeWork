package HomeWork_3.Exersise_2;

//Створити енум Стать.
// Створити клас Юзер з плоями : ід, ім'я , вік, Стать.
// Ствроити 10 об'єктів Юзера з відповідними ід (1-10)
// Свторити  arrayList , та покласти цих юзерів в arayList.
// - Проітерувати колекцію юзерів, вивевши тільки юзерів з парним значенням ід
//- Проітерувати колекцію юзерів, вивевши тільки юзерів з ім'ям , довжина якого більше ніж 5 символів
//- Проітерувати колекцію юзерів, вивевши тільки юзерів жінок

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Human men_1 = new Human(1, "Bohdan", 26, Gender.MEN);
        Human men_2 = new Human(2, "Vova", 21, Gender.MEN);
        Human women_1 = new Human(3, "Katie", 30, Gender.WOMEN);
        Human men_3 = new Human(4, "Dimon", 30, Gender.MEN);
        Human women_2 = new Human(5, "Olena", 36, Gender.WOMEN);
        Human women_3 = new Human(6, "Ivanka", 25, Gender.WOMEN);
        Human women_4 = new Human(7, "Julia", 27, Gender.WOMEN);
        Human men_4 = new Human(8, "OLeg", 16, Gender.MEN);
        Human women_5 = new Human(9, "Lilia", 22, Gender.WOMEN);
        Human women_6 = new Human(10, "Dana", 28, Gender.WOMEN);

        ArrayList<Human> arrayList = new ArrayList();
        arrayList.add(men_1);
        arrayList.add(men_2);
        arrayList.add(women_1);
        arrayList.add(men_3);
        arrayList.add(women_2);
        arrayList.add(women_3);
        arrayList.add(women_4);
        arrayList.add(men_4);
        arrayList.add(women_5);
        arrayList.add(women_6);

//        System.out.println(arrayList);

        for (Human human: arrayList) {
            if(human.getId() % 2 == 0){
                System.out.println(human);
            }
        }

        System.out.println("________________________________________________________________________");

        for (Human human1 : arrayList) {
            if(human1.getName().length() > 5){
                System.out.println(human1);
            }
        }

        System.out.println("________________________________________________________________________");

        for (Human human2 : arrayList) {
            if(human2.getGender() == Gender.WOMEN){
                System.out.println(human2);
            }
        }

    }
}
