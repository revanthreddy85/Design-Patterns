package BehavioralPatterns.Observer.ISubject;

import BehavioralPatterns.Observer.IObserver.Observer;

public interface ISubject {

    void register(Observer observer);

    void unRegister(Observer observer);

    void notifyObservers();
}
