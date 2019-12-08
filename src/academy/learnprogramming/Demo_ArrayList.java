package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo_ArrayList {

    public static void main(String[] args) {
        ArrayList<String> placesToVisit = new ArrayList<>();
        placesToVisit.add("_Sydney");
        placesToVisit.add("_Melbourne");
        placesToVisit.add("_Brisbane");
        placesToVisit.add("_Perth");
        placesToVisit.add("_Canberra");
        placesToVisit.add("_Adelaide");
        placesToVisit.add("_Darwin");

        printList(placesToVisit);

        placesToVisit.add(1, "_Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);

    }

    private static void printList(ArrayList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=========================");
    }

    private static boolean addInOrder(ArrayList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0) {
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if(comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                System.out.println(newCity + " has been successfully added as a new destination");
                return true;
            }
        }

        stringListIterator.add(newCity);
        System.out.println(newCity + " has been successfully added as a new destination");
        return true;
    }
}
