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

        /*
        Creating Objects using Builders
        -> Simple Construction code
        -> Readable
        -> Immutable Object
         */
        CarWithBuilder car1 = CarWithBuilder.builder()
                .setAirBags(airBags)
                .setEngine(engine)
                .setSteering(steering)
                .setFuel(Fuel.PETROl)
                .setRoof(roof)
                .setSmartControl(smartControl)
                .build();
        System.out.println(car1);

        CarWithBuilder car2 = CarWithBuilder.builder()
                .setAirBags(airBags)
                .setEngine(engine)
                .setFuel(Fuel.DIESEL)
                .setSmartControl(smartControl)
                .build();
        System.out.println(car2);
    }
}
