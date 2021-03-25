package BehavioralPatterns.Strategy;

import BehavioralPatterns.Strategy.Composition.Strategy;
import BehavioralPatterns.Strategy.ConcreteImpl.BubbleSort;
import BehavioralPatterns.Strategy.ConcreteImpl.InsertionSort;

public class Main {
    public static void main(String[] args) {
        int[] arr=new int[100];

        BubbleSort bubbleSort = new BubbleSort();
        Strategy strategy = new Strategy(bubbleSort);
        strategy.sort(arr);

        InsertionSort insertionSort = new InsertionSort();
        strategy.setStrategy(insertionSort);
        strategy.sort(arr);
    }
}
