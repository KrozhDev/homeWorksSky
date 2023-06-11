package pro.sky.java.course2.lesson2_oop1;

public class Hogwarts {

    private String name;
    private String surname;
    private int sorcery;
    private int transgression;

    public Hogwarts(String name, String surname, int sorcery, int transgression) {
        this.name = name;
        this.surname = surname;
        this.sorcery = sorcery;
        this.transgression = transgression;
    }

    @Override
    public String toString(){
        return "name " + name + " surname " + surname + " sorcery " + sorcery + " transgression " + transgression + " ";
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSorcery() {
        return sorcery;
    }

    public int getTransgression() {
        return transgression;
    }
}
