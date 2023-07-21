package pro.sky.topicspring.transport;

import pro.sky.topicspring.transport.Transport;

public class Pickup extends Transport {

    public Pickup(String model) {
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
