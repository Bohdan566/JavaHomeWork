package HomeWork_3.Exersise_1;

public class User{
    private int age;
    private String name;
    private Sizes size;

    public User() {
    }

    public User(int age, String name, Sizes size) {
        this.age = age;
        this.name = name;
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
