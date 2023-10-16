package car.car;

import car.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class OffRoadCar implements Car{
    @Autowired
    @Qualifier("offRoadEngine")
    private Engine engine;

    @Autowired
    private Environment environment;
    public OffRoadCar(){
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String showEngineHp() {
        return "Hp: "+ engine.getHp();
    }

    @Override
    public void showInfo() {
        System.out.println("Transmission: " + environment.getProperty("car.transmission"));
    }
}
