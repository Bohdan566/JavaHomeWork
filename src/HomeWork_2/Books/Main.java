package HomeWork_2.Books;

//Cтворити клас ланцюг наслідування:
//Папірус-Кинга-Журнал
//Папірус-Книга-Комікс
//Кількість полів довільна.

public class Main {
    public static void main(String[] args) {
        Papirus papirus = new Papirus(2000, "Old Egipt");
            Book book = new Book(100, "England", 230);
                Magazine magazine = new Magazine(1, "Ukraine", 24, "women");
                Comics comics = new Comics(2, "USA", 30, "childrens");

//        System.out.println(papirus);
//        System.out.println(book);
//        System.out.println(magazine);
//        System.out.println(comics);
    }
}
