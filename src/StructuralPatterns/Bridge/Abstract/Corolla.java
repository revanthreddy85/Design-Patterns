package StructuralPatterns.Bridge.Abstract;

import StructuralPatterns.Bridge.Implementation.CorollaImp;

public abstract class Corolla {
    protected CorollaImp corollaImp;

    public Corolla(CorollaImp corollaImp){
        this.corollaImp=corollaImp;
    }

    public abstract void safety();

    public abstract boolean isCarRightHanded();
}
