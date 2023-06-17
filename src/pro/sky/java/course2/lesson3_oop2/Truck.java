package pro.sky.java.course2.lesson3_oop2;

public class Truck extends Car{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre();
        }
        this.checkEngine();
        this.checkTrailer();
    }

}
