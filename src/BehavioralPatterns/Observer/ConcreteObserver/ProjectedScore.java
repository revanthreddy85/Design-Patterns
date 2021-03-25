package BehavioralPatterns.Observer.ConcreteObserver;

import BehavioralPatterns.Observer.IObserver.Observer;

public class ProjectedScore implements Observer {
    private float run_rate;
    private int pro_score;
    @Override
    public void update(int runs, int wickets, float overs) {
        run_rate = (float)runs/overs;
        pro_score = (int)(run_rate * 50);
        display();
    }

    private void display() {
        System.out.println("Projected Score: " + pro_score + " at run rate: " + run_rate);
    }
}
