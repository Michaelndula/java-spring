package car.car;

import car.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired
    private Engine engine;
    public Car(){
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String showEngineHp() {
        return "Hp: "+ engine.getHp();
    }
}
