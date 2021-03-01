package HomeWork_3.Exersise_2;

public enum Gender {
    MEN("male"), WOMEN("female");


    String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "gender='" + gender + '\'' +
                "} " + super.toString();
    }
}
