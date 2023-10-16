package car.car;

import car.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SportCar implements Car{
    private Engine engine;

    @Value("${car.colour:red}")
    private String colour;
    public SportCar(@Qualifier("sportEngine") Engine engine){
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String showEngineHp() {
        return "Hp: "+ engine.getHp();
    }

    @Override
    public void showInfo(){
        System.out.println("Colour: " + colour);
    }
}
