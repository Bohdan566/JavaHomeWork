package HomeWork_1;

public class Prince extends Human{
    private int foundShoe;

    public int getFoundShoe() {
        return foundShoe;
    }

    public void setFoundShoe(int foundShoe) {
        this.foundShoe = foundShoe;
    }

    public Prince() {
    }

    public Prince(int age, String name, int foundShoe) {
        super(age, name);
        this.foundShoe = foundShoe;
    }

    public String findPrincess (Princess princess){
        if(foundShoe == princess.getShoeSize()){
            return "This is " + princess.getName();
        } else {
            return "Girl's foot isn't fit to shoe size "+ princess.getShoeSize();
        }
    }

    @Override
    public String toString() {
        return super.toString() + "HomeWork_1.Prince{" +  "foundShoe=" + foundShoe + "}";
    }
}
