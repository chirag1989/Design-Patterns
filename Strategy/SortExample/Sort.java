package DesignPatterns.Strategy.SortExample;

public class Sort {

    public SortAlgorithm sortAlgorithm;

    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public void sortTheArray(int[] arr) {
        sortAlgorithm.sortArray(arr);
    }
}