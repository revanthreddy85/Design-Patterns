package BehavioralPatterns.Observer;

import BehavioralPatterns.Observer.ConcreteObserver.CurrentScore;
import BehavioralPatterns.Observer.ConcreteObserver.ProjectedScore;
import BehavioralPatterns.Observer.ISubject.CricketAdmin;

public class Main {
    public static void main(String[] args) {
        CurrentScore currentScore = new CurrentScore();
        ProjectedScore projectedScore = new ProjectedScore();

        CricketAdmin admin = new CricketAdmin(50,1, (float) 12.5);

        admin.register(currentScore);
        admin.register(projectedScore);

        admin.notifyObservers();

        admin.unRegister(projectedScore);

        admin.notifyObservers();
    }
}
