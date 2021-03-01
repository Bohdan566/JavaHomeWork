package HomeWork_3.Exersise_1;

public enum Sizes {
    XXS(38),
    XS(40),
    S(42),
    M(44),
    L(46);

    int euroSize;

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    @Override
    public String toString() {
        return "Sizes{" +
                "euroSize=" + euroSize +
                "} " + super.toString();
    }

//    public abstract void getDescription();
}
