package StructuralPatterns.Bridge.Model;

import StructuralPatterns.Bridge.Abstract.Corolla;
import StructuralPatterns.Bridge.Implementation.CorollaImp;

public class Corolla_abc extends Corolla {
    public Corolla_abc(CorollaImp corollaImp) {
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
