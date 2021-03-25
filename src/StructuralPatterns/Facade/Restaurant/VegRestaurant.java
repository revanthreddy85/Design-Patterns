package StructuralPatterns.Facade.Restaurant;

import StructuralPatterns.Facade.Menu.Menus;
import StructuralPatterns.Facade.Menu.VegMenu;

public class VegRestaurant implements Restaurant {
    @Override
    public Menus getMenu() {
        return new VegMenu();
    }
}
