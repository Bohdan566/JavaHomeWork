package HomeWork_2.Books;

public class Papirus {
    private int age;
    private String area;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Papirus() {
    }

    public Papirus(int age, String area) {
        this.age = age;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Papirus{" +
                "age=" + age +
                ", area='" + area + '\'' +
                '}';
    }
}
