package pro.sky.java.course2.lesson2_oop1;

public class Main {
    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Harry", "Potter",100, 100, 50, 100, 100);
        Gryffindor hermionaGreinger = new Gryffindor("Hermiona", "Greinger",23,67,43,32,23);
        Gryffindor ronWizly = new Gryffindor("Ron","Wizly",44,4,30,5,6);

        Slytherin drakoMalfoy = new Slytherin("Drako", "Malfoy", 77,42,55,78,24, 43,34);
        Slytherin grehoMontegue = new Slytherin("Greho","Montegue",64,23,65,18,23,34,45);
        Slytherin gregoryGoyl = new Slytherin("Gregory", "Goyl", 91,48,45,73,23,43,56);

        Hufflepuff zahariyaSmith = new Hufflepuff("Zahariya","Smith",43, 24, 54, 52,23);
        Hufflepuff sedrickGiggory = new Hufflepuff("Sedrick","Giggory", 47,72,57, 54, 64);
        Hufflepuff justinFinchFlatchly = new Hufflepuff("Justin", "Finch-Flatchly", 13,62,33, 54, 43);

        Ravenclaw chzhouChang = new Ravenclaw("Chzhou", "Chang",34,52,62,32, 54);
        Ravenclaw padmaPatil = new Ravenclaw("Padma","Patil",23,57,44,32,75);
        Ravenclaw markusBelbi = new Ravenclaw("Markus", "Belbi",24,72,67,32,78);

        System.out.println(harryPotter.toString());

        harryPotter.studentsComparing(hermionaGreinger);

        zahariyaSmith.studentsComparing(sedrickGiggory);

        chzhouChang.studentsComparing(markusBelbi);

        drakoMalfoy.studentsComparing(gregoryGoyl);

        studentsMagicPowerComparing(chzhouChang, harryPotter);



    }



    public static void studentsMagicPowerComparing(Hogwarts hogwarts1, Hogwarts hogwarts2){

        int magicPoints1 = hogwarts1.getSorcery() + hogwarts1.getTransgression();
        int magicPoints2 = hogwarts2.getSorcery() + hogwarts2.getTransgression();

        if (magicPoints1 > magicPoints2) {
            System.out.println(hogwarts1.getName() + " " + hogwarts1.getSurname() +
                    " has more magic power than "
                    + hogwarts2.getName() + " " + hogwarts2.getSurname());
        } else {
            System.out.println(hogwarts2.getName() + " " + hogwarts2.getSurname() +
                    " has more magic power than "
                    + hogwarts1.getName() + " " + hogwarts1.getSurname());
        }
    }
}
