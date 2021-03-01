package HomeWork_2.Animals;

//    Створити клас Тварина з двома довільними полями. від класу Тварина створити ще два нащадки , кожен з яких має свій набір
//    додаткових полів, від кожного нащядка ще по 2 нащадки, кожен з яких має додатково по одній характеристиці. Створити
//    по одному елементу кожного типу. Створити масив кожного типу, пофасувати всі елементи по можливих масивах, які
//    підходять їм за типом

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Klinton", 12);
            Savage savage = new Savage("Pumba", 8, "Savanna");
                Kaban kaban = new Kaban("Pumba", 8, "Savanna", 46);
                Stew stew = new Stew("Timon", 6, "Savanna", 60);
            Pet pet = new Pet("Sifon", 3, "Yallikhovichi");
                Cet cet = new Cet("Sifon", 3, "Olesko", 56);
                Dog dog = new Dog("Rex", 12, "Lviv", 39);

//        System.out.println(animal);
//        System.out.println(savage);
//        System.out.println(pet);
//        System.out.println(kaban);
//        System.out.println(stew);
//        System.out.println(cet);
//        System.out.println(dog);

        Animal[] animals = {animal, savage, pet, kaban, stew, cet, dog};
        Savage[] savages = {savage, kaban, stew};
        Pet[] pets = {pet, cet, dog};
     }

}
