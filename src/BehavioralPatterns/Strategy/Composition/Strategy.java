package BehavioralPatterns.Strategy.Composition;

import BehavioralPatterns.Strategy.Interface.Sorting;

public class Strategy {
    private Sorting sorting;

    public Strategy(Sorting sorting) {
        this.sorting = sorting;
    }

    public void sort(int[] arr){
        sorting.sort(arr);
    }

    public void setStrategy(Sorting sorting) {
        this.sorting = sorting;
    }
}
