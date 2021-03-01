package HomeWork_2.Books;

public class Comics extends Book{
    private String forWhom;

    public String getForWhom() {
        return forWhom;
    }

    public void setForWhom(String forWhom) {
        this.forWhom = forWhom;
    }

    public Comics() {
    }

    public Comics(int age, String area, int pages, String forWhom) {
        super(age, area, pages);
        this.forWhom = forWhom;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "forWhom='" + forWhom + '\'' +
                "} " + super.toString();
    }
}
