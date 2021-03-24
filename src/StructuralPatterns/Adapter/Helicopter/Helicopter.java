package StructuralPatterns.Adapter.Helicopter;

public class Helicopter {
    private String company="xyz";

    public void fly(String company){
        System.out.println(company+" helicopter is flying");
    }

    public String getCompany() {
        return company;
    }
}
