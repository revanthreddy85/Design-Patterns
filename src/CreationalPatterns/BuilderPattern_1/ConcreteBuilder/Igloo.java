package CreationalPatterns.BuilderPattern_1.ConcreteBuilder;

import CreationalPatterns.BuilderPattern_1.Builder.HouseBuilder;
import CreationalPatterns.BuilderPattern_1.Product.House;

public class Igloo implements HouseBuilder {
    private House house;

    public Igloo() {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("Ice Basement");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Ice Interior");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Ice Structure");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Ice Roof");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
