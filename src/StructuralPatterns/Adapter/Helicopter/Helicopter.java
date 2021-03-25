package StructuralPatterns.Adapter.Helicopter;

public class Helicopter {

    public void fly(String company){
        System.out.println(company+" helicopter is flying");
    }

    public String getCompany() {
        return "xyz";
    }
}
