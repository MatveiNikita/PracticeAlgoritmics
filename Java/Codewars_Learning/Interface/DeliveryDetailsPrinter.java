package Codewars_Learning.Interface;

public class DeliveryDetailsPrinter {
    private final Sorter sorter;

    public DeliveryDetailsPrinter(Sorter sorter) {
        this.sorter = sorter;
    }
    void printDetails() {
        sorter.sortDetails();
        System.out.println("Some details already sorted ");
    }
}
