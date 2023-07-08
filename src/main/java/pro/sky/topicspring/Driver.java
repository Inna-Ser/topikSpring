package pro.sky.topicspring;
import pro.sky.topicspring.transport.Transport;

public class Driver {

    private String name;
    private Transport transport;

    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public Driver(String name) {
        this.name = name;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setDriverOfTransport() {
        System.out.println("Водитель " + name + " сел в машину " + transport.getModel());
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", transport=" + transport +
                '}';
    }
}
