package pro.sky.java.course2.lesson2_oop1;

public class Slytherin extends Hogwarts{

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulnes;
    private int lustForPower;

    public Slytherin(String name, String surname, int sorcery, int transgression, int cunning, int determination, int ambition, int resourcefulnes, int lustForPower) {
        super(name, surname, sorcery,transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulnes = resourcefulnes;
        this.lustForPower = lustForPower;
    }

    public void studentsComparing(Slytherin slytherin){
        int sumThis = this.getSorcery() + this.getTransgression() + this.cunning + this.determination + this.ambition + this.resourcefulnes + this.lustForPower;
        int sumOtherStudent = slytherin.getSorcery() + slytherin.getTransgression() + slytherin.cunning + slytherin.determination + slytherin.ambition + slytherin.resourcefulnes + slytherin.lustForPower;

        if (sumThis > sumOtherStudent) {
            System.out.println(this.getName() + " is better Gryffindor student than " + slytherin.getName());
        } else {
            System.out.println(slytherin.getName() + " is better Gryffindor student than " + this.getName());
        }
    }
}
