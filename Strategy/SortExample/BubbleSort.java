package DesignPatterns.Strategy.SortExample;

public class BubbleSort extends Sort {

    public BubbleSort() {
        super();
        sortAlgorithm = new BubbleSortImplementation();
    }
}
