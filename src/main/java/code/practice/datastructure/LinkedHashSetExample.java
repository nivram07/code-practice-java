package code.practice.datastructure;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        LinkedHashSet dset = new LinkedHashSet();
        dset.add(2);
        dset.add(1);
        dset.add(3);
        dset.add(5);
        dset.add(4);
        dset.add(5);
        Iterator iterator = dset.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
