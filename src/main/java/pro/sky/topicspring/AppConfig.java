package pro.sky.topicspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pro.sky.topicspring.transport.Bus;
import pro.sky.topicspring.transport.Car;
import pro.sky.topicspring.transport.Pickup;
import pro.sky.topicspring.transport.Transport;

@Configuration
public class AppConfig {

    @Bean(name = "car")
    @Scope("prototype")
    public Car getCarBean() {
        return new Car("Toyota");
    }

    @Bean(name = "bus")
    @Scope("prototype")
    public Bus getBusBean() {
        return new Bus("Honda");
    }

    @Bean(name = "pickup")
    @Scope("prototype")
    public Pickup getPickupBean() {
        return new Pickup("Ram");
    }

    @Bean(name = "driver1")
    public Driver getDriver1() {
        return new Driver("Kolya", );
    }

    @Bean(name = "driver2")
    public Driver getDriver2() {
        return new Driver("Dima");
    }

    @Bean(name = "driver3")
    public Driver getDriver3() {
        return new Driver("Oleg");
    }
}
