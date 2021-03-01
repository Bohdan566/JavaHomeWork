package HomeWork_3.Exersise_1;

public class T_shirt extends Clothes implements MensClothes, WomensClothes{

    public T_shirt() {
    }

    public T_shirt(Sizes size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMen() {
        System.out.println("The men is dressed" + getColor() + "in T-Shirt");
    }

    @Override
    public void dressWomen() {
        System.out.println("The women is dressed" + getColor() + "id T-Shirt");
    }
}
