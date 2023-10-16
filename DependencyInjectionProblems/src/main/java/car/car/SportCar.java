package car.car;

import car.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SportCar implements Car{
    @Autowired
    @Qualifier("sportEngine")
    private Engine engine;
    public SportCar(){
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String showEngineHp() {
        return "Hp: "+ engine.getHp();
    }
}
