package StructuralPatterns.Bridge.Location;

import StructuralPatterns.Bridge.Implementation.CorollaImp;

public class Corolla_US implements CorollaImp {
    @Override
    public void safety() {
        System.out.println("High Safety");
    }

    @Override
    public boolean isCarRightHanded() {
        return false;
    }
}
