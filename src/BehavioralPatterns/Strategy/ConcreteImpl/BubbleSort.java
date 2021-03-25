package BehavioralPatterns.Strategy.ConcreteImpl;

import BehavioralPatterns.Strategy.Interface.Sorting;

public class BubbleSort implements Sorting {
    @Override
    public void sort(int[] arr) {
        System.out.println("Bubble Sort");
    }
}
