package StructuralPatterns.Bridge;

import StructuralPatterns.Bridge.Abstract.Corolla;
import StructuralPatterns.Bridge.Location.Corolla_Asia;
import StructuralPatterns.Bridge.Location.Corolla_US;
import StructuralPatterns.Bridge.Model.Corolla_abc;

public class Main {
    public static void main(String[] args) {
        Corolla corolla = new Corolla_abc(new Corolla_US());
        corolla.safety();
        System.out.println(corolla.isCarRightHanded());

        Corolla corolla_1 = new Corolla_abc(new Corolla_Asia());
        corolla_1.safety();
        System.out.println(corolla_1.isCarRightHanded());
    }
}
