package BehavioralPatterns.Observer.ConcreteObserver;

import BehavioralPatterns.Observer.IObserver.Observer;

public class CurrentScore implements Observer {
    private int runs;
    private int wickets;
    private float overs;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        display();
    }

    private void display(){
        System.out.println("runs: " + runs);
        System.out.println("wickets: " + wickets);
        System.out.println("run rate: " + overs);
    }
}
