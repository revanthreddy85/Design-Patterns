package BehavioralPatterns.Observer.ISubject;

import BehavioralPatterns.Observer.IObserver.Observer;

import java.util.ArrayList;
import java.util.List;

public class CricketAdmin implements ISubject {
    private int runs;
    private int wickets;
    private float overs;
    private List<Observer> list;

    public CricketAdmin(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        list = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        list.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer obj: list)
            obj.update(runs,wickets,overs);
    }
}
