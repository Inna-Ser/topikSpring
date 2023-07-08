package pro.sky.topicspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pro.sky.topicspring.transport.Bus;
import pro.sky.topicspring.transport.Car;
import pro.sky.topicspring.transport.Pickup;
import pro.sky.topicspring.transport.Transport;

@SpringBootApplication
public class TopicSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(TopicSpringApplication.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = context.getBean("car", Car.class);
        car.readyForWork();

        Bus bus = context.getBean("bus", Bus.class);
        bus.readyForWork();

        Driver driver1 = context.getBean("driver1", Driver.class);
        driver1.setDriverOfTransport();
    }


}
