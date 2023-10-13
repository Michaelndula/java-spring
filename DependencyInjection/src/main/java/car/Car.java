package car;

public class Car {
    private Engine engine;

    // without DI
//    public Car(){
//        engine = new Engine();
//    }

//     with DI
//    public Car(Engine engine){
//        this.engine = engine;
//    }

    public Car(){

    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String showEngineHp() {
        return "Hp: "+ engine.getHp();
    }
}
