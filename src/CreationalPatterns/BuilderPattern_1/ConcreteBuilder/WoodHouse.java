package CreationalPatterns.BuilderPattern_1.ConcreteBuilder;

import CreationalPatterns.BuilderPattern_1.Builder.HouseBuilder;
import CreationalPatterns.BuilderPattern_1.Product.House;

public class WoodHouse implements HouseBuilder {
    private House house;

    public WoodHouse() {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("Wood Basement");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Wood Interior");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Wood Structure");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Wood Roof");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
