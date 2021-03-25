package StructuralPatterns.Adapter.Adapter;

import StructuralPatterns.Adapter.Aircraft.Aircraft;
import StructuralPatterns.Adapter.Helicopter.Helicopter;

public class Adapter implements Aircraft {

    private Helicopter helicopter;

    public Adapter(Helicopter helicopter){
        this.helicopter=helicopter;
    }
    @Override
    public void fly() {
        String company=helicopter.getCompany();
        helicopter.fly(company);
    }
}
