package car.engine;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SportEngine implements Engine{
    private final int hp = 400;

    @Override
    public int getHp() {
        return hp;
    }
}
