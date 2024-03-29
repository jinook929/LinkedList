package academy.learnprogramming;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorPractice {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Integer> array1 = new ArrayList<>();

        // Add elements to ArrayList
        array1.add(10);
        array1.add(20);
        array1.add(30);
        array1.add(40);
        array1.add(50);

        // Make ListIterator for list
        ListIterator<Integer> listIterator = array1.listIterator();

        // Print ArrayList in forward order
        System.out.println("array1 in forward order");
        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Print ArrayList in reverse order
        System.out.println("array1 in reverse order");
        while(listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
