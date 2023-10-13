package car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        Car car = ctx.getBean(Car.class);

        System.out.println("Car Engine " + car.showEngineHp());

        ((AnnotationConfigApplicationContext)ctx).close();
    }
}
