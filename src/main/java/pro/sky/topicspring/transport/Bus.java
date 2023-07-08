package pro.sky.topicspring.transport;

public class Bus extends Transport {


    public Bus(String model) {
        super(model);
    }

    @Override
    public void readyForWork() {
        System.out.println(getModel() + " готов к работе.");
    }

    @Override
    public String toString() {
        return "Vehicle" +
                "model='" + getModel();
    }
}
