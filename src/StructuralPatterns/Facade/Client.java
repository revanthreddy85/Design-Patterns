package StructuralPatterns.Facade;

import StructuralPatterns.Facade.Menu.NonVegMenu;
import StructuralPatterns.Facade.Menu.VegMenu;
import StructuralPatterns.Facade.Reception.Receptionist;

public class Client {

    public static void main(String[] args) {
        // Receptionist acts as Facade.
        Receptionist receptionist = new Receptionist();
        VegMenu vegMenu = receptionist.getVegMenu();
        NonVegMenu nonVegMenu = receptionist.getNonVegMenu();

        System.out.println(vegMenu);

        System.out.println(nonVegMenu);
    }
}
