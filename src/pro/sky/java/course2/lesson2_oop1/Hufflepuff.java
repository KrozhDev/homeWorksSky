package pro.sky.java.course2.lesson2_oop1;

public class Hufflepuff extends Hogwarts{
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, int sorcery, int transgression, int diligence, int loyalty, int honesty) {
        super(name, surname, sorcery,transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void studentsComparing(Hufflepuff hufflepuff){
        int sumThis = this.getSorcery() + this.getTransgression() + this.diligence + this.loyalty + this.honesty;
        int sumGryffindor = hufflepuff.getSorcery() + hufflepuff.getTransgression() + hufflepuff.diligence + hufflepuff.loyalty + hufflepuff.honesty;

        if (sumThis > sumGryffindor) {
            System.out.println(this.getName() + " is better Gryffindor student than " + hufflepuff.getName());
        } else {
            System.out.println(hufflepuff.getName() + " is better Gryffindor student than " + this.getName());
        }
    }
}
