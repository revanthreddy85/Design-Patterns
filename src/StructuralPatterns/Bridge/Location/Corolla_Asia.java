package StructuralPatterns.Bridge.Location;

import StructuralPatterns.Bridge.Implementation.CorollaImp;

public class Corolla_Asia implements CorollaImp {
    @Override
    public void safety() {
        System.out.println("Moderate Safety");
    }

    @Override
    public boolean isCarRightHanded() {
        return true;
    }
}
