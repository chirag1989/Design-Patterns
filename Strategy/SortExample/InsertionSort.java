package DesignPatterns.Strategy.SortExample;

public class InsertionSort extends Sort {

    public InsertionSort() {
        super();
        sortAlgorithm = new InsertionSortImplementation();
    }
}