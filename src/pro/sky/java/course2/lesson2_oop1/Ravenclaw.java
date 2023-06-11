package pro.sky.java.course2.lesson2_oop1;

public class Ravenclaw extends Hogwarts{
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, String surname, int sorcery, int transgression, int wisdom, int wit, int creativity) {
        super(name, surname, sorcery,transgression);
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public void studentsComparing(Ravenclaw ravenclaw){
        int sumThis = this.getSorcery() + this.getTransgression() + this.wisdom + this.wit + this.creativity;
        int sumOtherStudent = ravenclaw.getSorcery() + ravenclaw.getTransgression() + ravenclaw.wisdom + ravenclaw.wit + ravenclaw.creativity;

        if (sumThis > sumOtherStudent) {
            System.out.println(this.getName() + " is better Gryffindor student than " + ravenclaw.getName());
        } else {
            System.out.println(ravenclaw.getName() + " is better Gryffindor student than " + this.getName());
        }
    }
}
