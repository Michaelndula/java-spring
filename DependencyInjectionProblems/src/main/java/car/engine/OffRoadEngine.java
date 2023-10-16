package car.engine;

import org.springframework.stereotype.Component;

@Component
public class OffRoadEngine implements Engine{
    private final int hp = 600;

    @Override
    public int getHp() {
        return hp;
    }
}
