package in.bala.collection.app;

import in.bala.collection.model.Product;
import in.bala.collection.model.SortByName;
import in.bala.collection.model.SortByQuantity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Product> plist=new ArrayList<>();

        plist.add(new Product(101,"apple",199d,103));
        plist.add(new Product(102,"Mango-Alphonza",119d,103));
        plist.add(new Product(106,"Mango-Banaza",79d,143));
        plist.add(new Product(104,"Mango-Parrot",29d,173));


        System.out.println("Before Sort ");

        for (Product p:plist ) {
            System.out.println(p.toString());
        }
//       List<Integer> testCollection=new ArrayList<>();
//        testCollection.add(99);
//        testCollection.add(91);
//        testCollection.add(19);
//        testCollection.add(49);
//        testCollection.add(29);
//        testCollection.add(89);
//        System.out.println("Before Sort "+testCollection);
//        System.out.println(testCollection);


       // Collections.sort(plist);

        Collections.sort(plist,new SortByName());
        System.out.println("After Sort ");

        for (Product p:plist ) {
            System.out.println(p.toString());
        }


    }
}
