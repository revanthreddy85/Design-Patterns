package StructuralPatterns.Bridge.Model;

import StructuralPatterns.Bridge.Abstract.Corolla;
import StructuralPatterns.Bridge.Implementation.CorollaImp;

public class Corolla_xyz extends Corolla {
    public Corolla_xyz(CorollaImp corollaImp) {
        super(corollaImp);
    }

    @Override
    public void safety() {
        corollaImp.safety();
    }

    @Override
    public boolean isCarRightHanded() {
        return corollaImp.isCarRightHanded();
    }
}
