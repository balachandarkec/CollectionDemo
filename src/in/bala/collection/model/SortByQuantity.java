package in.bala.collection.model;

import java.util.Comparator;

public class SortByQuantity implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return (p1.getQuantity()-p2.getQuantity());
    }
}
