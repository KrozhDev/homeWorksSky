package pro.sky.java.course2.lesson3_oop2;

public class Car extends Bicycle{

    public Car(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

}
