package HomeWork_2.Humane_Interfaces;

import HomeWork_2.Humane_Interfaces.Interfaces.MenClothes;
import HomeWork_2.Humane_Interfaces.Interfaces.WomenClothes;

//Створити інтерфейси "Чоловічий одяг" з методом "вдягнути чоловіка" і "Жіночий одяг" з методом "одягнути жінку".
// Реалізувати їх у відповідних класах реалізаторах


public class Main {
    public static void main(String[] args) {
        Human human = new Human("Boda", 26);
            Men men = new Men("Vova", 52, "Driver");
            Women women = new Women("Olena", 30, "Spain");

        System.out.println(human);
        System.out.println(men);
        System.out.println(women);

        CheckRules(men);
        CheckRules2(women);

    }

    public static void CheckRules(MenClothes menClothes) {
        menClothes.dressMen();
    }

    public static void CheckRules2(WomenClothes womenClothes){
        womenClothes.dressWomen();
    }

}
