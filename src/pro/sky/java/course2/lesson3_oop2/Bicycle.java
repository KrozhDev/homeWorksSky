package pro.sky.java.course2.lesson3_oop2;

public class Bicycle implements Vehicle{

    private String modelName;
    private int wheelsCount;

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }


    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

}