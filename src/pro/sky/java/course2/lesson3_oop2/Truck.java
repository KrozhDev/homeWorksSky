package pro.sky.java.course2.lesson3_oop2;

public class Truck extends Car{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}
