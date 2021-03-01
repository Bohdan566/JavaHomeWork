package HomeWork_3.Exersise_1;

public class Tie extends Clothes implements MensClothes{

    public Tie() {
    }

    public Tie(Sizes size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMen() {
        System.out.println("The men is dressed" + getColor() + "in tie");
    }
}
