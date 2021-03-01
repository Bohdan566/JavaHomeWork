package HomeWork_2.Books;

public class Magazine extends Book{
    private String forWhom;

    public String getForWhom() {
        return forWhom;
    }

    public void setForWhom(String forWhom) {
        this.forWhom = forWhom;
    }

    public Magazine() {
    }

    public Magazine(int age, String area, int pages, String forWhom) {
        super(age, area, pages);
        this.forWhom = forWhom;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "forWhom='" + forWhom + '\'' +
                "} " + super.toString();
    }
}
