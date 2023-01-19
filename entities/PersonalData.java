package entities;

public class PersonalData {
    private char gender;
    private double height;

    public PersonalData(char gender, double height) {
        this.gender = gender;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public char getGender() {
        return gender;
    }
}
