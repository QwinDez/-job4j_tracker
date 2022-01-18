package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private int inspection;

    public Dentist(String name, String surname, String education, String birthday, int practice, int inspection) {
        super(name, surname, education, birthday, practice);
        this.inspection = inspection;
    }

    public int wrest(int tooth) {
        return tooth;
    }
}
