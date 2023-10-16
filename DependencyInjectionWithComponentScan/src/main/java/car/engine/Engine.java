package car.engine;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    private final int hp = 400;

    public int getHp() {
        return hp;
    }
}
