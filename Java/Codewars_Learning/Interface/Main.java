package Codewars_Learning.Interface;

public class Main {
    public static void main(String[] args) {
        SorterByName byName = new SorterByName();
        DeliveryDetailsPrinter printerSortedByName = new DeliveryDetailsPrinter(byName);
        printerSortedByName.printDetails();

        SorterByAddress byAddress = new SorterByAddress();
        DeliveryDetailsPrinter printerSortedByAddress = new DeliveryDetailsPrinter(byAddress);
        printerSortedByAddress.printDetails();
    }
}
