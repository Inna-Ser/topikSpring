package pro.sky.topicspring.transport;

public class Car extends Transport {

    public Car(String model) {
        super(model);
    }

    @Override
     public void readyForWork() {
        System.out.println(getModel() + " готов к работе.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + getModel() + '\'' +
                '}';
    }
}
