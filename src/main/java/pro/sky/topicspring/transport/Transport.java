package pro.sky.topicspring.transport;

public abstract class Transport {

    private String model;

    public Transport(String model) {
        this.model = model;
    }

    public abstract void readyForWork();

    public String getModel() {
        return null;
    }
}
