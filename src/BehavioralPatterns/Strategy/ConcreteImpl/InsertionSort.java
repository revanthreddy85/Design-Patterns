package BehavioralPatterns.Strategy.ConcreteImpl;

import BehavioralPatterns.Strategy.Interface.Sorting;

public class InsertionSort implements Sorting {
    @Override
    public void sort(int[] arr) {
        System.out.println("Insertion Sort");
    }
}
