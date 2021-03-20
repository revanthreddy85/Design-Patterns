package CreationalPatterns.BuilderPattern_1.Director;

import CreationalPatterns.BuilderPattern_1.Builder.HouseBuilder;
import CreationalPatterns.BuilderPattern_1.Product.House;

public class Director {
    private HouseBuilder builder = null;

    public Director(HouseBuilder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.buildBasement();
        builder.buildStructure();
        builder.buildInterior();
        builder.buildRoof();
    }

    public House getHouse(){
        return builder.getHouse();
    }
}
