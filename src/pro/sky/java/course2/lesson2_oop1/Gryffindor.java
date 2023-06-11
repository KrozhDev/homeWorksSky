package pro.sky.java.course2.lesson2_oop1;

public class Gryffindor extends Hogwarts{

    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, String surname, int sorcery, int transgression, int nobility, int honor, int courage) {
        super(name, surname, sorcery,transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    @Override
    public String toString(){
        return super.toString() + "nobility " + nobility + " honor " + honor + " courage " + courage;
    }

    public void studentsComparing(Gryffindor gryffindor){
        int sumThis = this.getSorcery() + this.getTransgression() + this.nobility + this.honor + this.courage;
        int sumOtherStudent = gryffindor.getSorcery() + gryffindor.getTransgression() + gryffindor.nobility + gryffindor.honor + gryffindor.courage;

        if (sumThis > sumOtherStudent) {
            System.out.println(this.getName() + " is better Gryffindor student than " + gryffindor.getName());
        } else {
            System.out.println(gryffindor.getName() + " is better Gryffindor student than " + this.getName());
        }
    }
}
