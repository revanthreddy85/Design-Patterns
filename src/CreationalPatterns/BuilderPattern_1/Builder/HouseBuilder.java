package CreationalPatterns.BuilderPattern_1.Builder;

import CreationalPatterns.BuilderPattern_1.Product.House;

public interface HouseBuilder {

    public void buildBasement();

    public void buildInterior();

    public void buildStructure();

    public void buildRoof();

    public House getHouse();
}
