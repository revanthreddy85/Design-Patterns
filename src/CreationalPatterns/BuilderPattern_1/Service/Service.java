package CreationalPatterns.BuilderPattern_1.Service;

import CreationalPatterns.BuilderPattern_1.ConcreteBuilder.WoodHouse;
import CreationalPatterns.BuilderPattern_1.Director.Director;
import CreationalPatterns.BuilderPattern_1.Product.House;

public class Service {

    public static void main(String[] args){
        Director director = new Director(new WoodHouse());
        director.construct();
        House house = director.getHouse();
        System.out.println(house.toString());
    }
}
