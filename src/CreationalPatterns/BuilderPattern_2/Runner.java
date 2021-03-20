package CreationalPatterns.BuilderPattern_2;

import CreationalPatterns.BuilderPattern_2.Components.*;
import CreationalPatterns.BuilderPattern_2.Product.CarWithBuilder;

public class Runner {

    public static void main(String[] args){
        final AirBags airBags = new AirBags();
        final Engine engine = new Engine();
        final Roof roof = new Roof();
        final Steering steering = new Steering();
        final SmartControl smartControl = new SmartControl();

        CarWithBuilder car = CarWithBuilder.builder()
                .setAirBags(airBags)
                .setEngine(engine)
                .setSteering(steering)
                .setFuel(Fuel.PETROl)
                .build();
        System.out.println(car);
    }
}
