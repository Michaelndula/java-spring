package car.application;

import car.car.Car;
import car.car.OffRoadCar;
import car.car.SportCar;
import car.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        Car sportCar = ctx.getBean(SportCar.class);
        Car offRoadcar = ctx.getBean(OffRoadCar.class);

        sportCar.showInfo();
        offRoadcar.showInfo();

        ((AnnotationConfigApplicationContext)ctx).close();
    }
}
