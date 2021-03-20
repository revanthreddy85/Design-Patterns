package CreationalPatterns.BuilderPattern_2.Product;

import CreationalPatterns.BuilderPattern_2.Components.*;

public class CarWithBuilder {
    //Required Properties
    private Engine engine;
    private Steering steering;
    private Fuel fuel;

    //Optional properties
    private Roof roof;
    private AirBags airBags;
    private SmartControl smartControl;

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        //Required Properties
        private Engine engine;
        private Steering steering;
        private Fuel fuel;

        //Optional properties
        private Roof roof;
        private AirBags airBags;
        private SmartControl smartControl;

        public Builder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public Builder setSteering(Steering steering) {
            this.steering = steering;
            return this;
        }

        public Builder setFuel(Fuel fuel) {
            this.fuel = fuel;
            return this;
        }

        public Builder setRoof(Roof roof) {
            this.roof = roof;
            return this;
        }

        public Builder setAirBags(AirBags airBags) {
            this.airBags = airBags;
            return this;
        }

        public Builder setSmartControl(SmartControl smartControl) {
            this.smartControl = smartControl;
            return this;
        }

        public CarWithBuilder build(){
            if(this.engine == null || this.fuel == null || this.steering == null)
                throw  new RuntimeException("Required properties missing..");
            CarWithBuilder car = new CarWithBuilder();
            car.airBags = airBags;
            car.engine = engine;
            car.fuel = fuel;
            car.roof = roof;
            car.smartControl = smartControl;
            car.steering = steering;
            return  car;
        }
    }

}
