package StructuralPatterns.Facade.Restaurant;

import StructuralPatterns.Facade.Menu.Menus;
import StructuralPatterns.Facade.Menu.NonVegMenu;

public class NonVegRestaurant implements Restaurant {
    @Override
    public Menus getMenu() {
        NonVegMenu nonVegMenu = new NonVegMenu();
        return nonVegMenu;
    }
}
