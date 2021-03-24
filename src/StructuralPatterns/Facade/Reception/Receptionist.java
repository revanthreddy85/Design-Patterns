package StructuralPatterns.Facade.Reception;

import StructuralPatterns.Facade.Menu.NonVegMenu;
import StructuralPatterns.Facade.Menu.VegMenu;
import StructuralPatterns.Facade.Restaurant.NonVegRestaurant;
import StructuralPatterns.Facade.Restaurant.VegRestaurant;

public class Receptionist {
    public VegMenu getVegMenu(){
        VegRestaurant vegRestaurant = new VegRestaurant();
        return (VegMenu)vegRestaurant.getMenu();
    }

    public NonVegMenu getNonVegMenu(){
        NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();
        return (NonVegMenu)nonVegRestaurant.getMenu();
    }
}
