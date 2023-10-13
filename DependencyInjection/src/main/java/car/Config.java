package car;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Car getCar(){
        Car car = new Car();
        car.setEngine(getEngine());
        return car;
    }

    @Bean
    public Engine getEngine(){
        return new Engine();
    }
}
