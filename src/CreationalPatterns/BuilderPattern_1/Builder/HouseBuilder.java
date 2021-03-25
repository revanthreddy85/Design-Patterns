package CreationalPatterns.BuilderPattern_1.Builder;

import CreationalPatterns.BuilderPattern_1.Product.House;

public interface HouseBuilder {

    void buildBasement();

    void buildInterior();

    void buildStructure();

    void buildRoof();

    House getHouse();
}
