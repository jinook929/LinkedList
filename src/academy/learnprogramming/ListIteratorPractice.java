package academy.learnprogramming;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorPractice {

    public static void main(String[] args) {

        ArrayList<Integer> array1 = new ArrayList<>();

        array1.add(10);
        array1.add(20);
        array1.add(30);
        array1.add(40);
        array1.add(50);

        // How to make ListIterator for list
        ListIterator<Integer> listIterator = array1.listIterator();

        System.out.println("array1 in forward order");
        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("array1 in reverse order");
        while(listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
