package HomeWork_1;

public class Princess extends Human{
    private int shoeSize;

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public Princess() {
    }

    public Princess(int age, String name, int shoeSize) {
        super(age, name);
        this.shoeSize = shoeSize;
    }

    @Override
    public String toString() {
        return super.toString() + "HomeWork_1.Princess{" +  "shoeSize=" + shoeSize + "}";
    }
}
