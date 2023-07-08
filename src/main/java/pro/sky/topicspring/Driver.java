package pro.sky.topicspring;
import pro.sky.topicspring.transport.Transport;

public class Driver {

    private String name;
    private Class<Transport> transport;

    public Driver(String name, Class<Transport> transport) {
        this.name = name;
        this.transport = transport;
    }

    public Driver(String name) {
        this.name = name;
    }

    public Class<Transport> getTransport() {
        return transport;
    }

    public void setDriverOfTransport() {
        System.out.println("Водитель " + name + " сел в машину " + transport);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", transport=" + transport +
                '}';
    }
}
