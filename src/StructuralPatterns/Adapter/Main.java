package StructuralPatterns.Adapter;

import StructuralPatterns.Adapter.Adapter.Adapter;
import StructuralPatterns.Adapter.Helicopter.Helicopter;

public class Main {
    public static void main(String[] args){
        Helicopter helicopter=new Helicopter();
        Adapter adapter=new Adapter(helicopter);

        adapter.fly();
    }
}
