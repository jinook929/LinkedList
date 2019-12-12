package academy.learnprogramming;

import java.util.*;

public class Demo_ArrayList {

    public static void main(String[] args) {
        ArrayList<String> placesToVisit = new ArrayList<>();
        addInOrder(placesToVisit, "_Sydney");
        addInOrder(placesToVisit, "_Melbourne");
        addInOrder(placesToVisit, "_Brisbane");
        addInOrder(placesToVisit, "_Perth");
//        placesToVisit.add("_Sydney");
//        placesToVisit.add("_Melbourne");
//        placesToVisit.add("_Brisbane");
//        placesToVisit.add("_Perth");
//        placesToVisit.add("_Canberra");
//        placesToVisit.add("_Adelaide");
//        placesToVisit.add("_Darwin");

        printList(placesToVisit);

        addInOrder(placesToVisit, "_Seoul");
//        placesToVisit.add(1, "_Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);

        visit(placesToVisit);

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

    private static void visit(ArrayList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No cities in the itinerary");
            return;
        } else {
//            System.out.println("Now visiting " + listIterator.next());
            System.out.println("Let's begin our journey!");
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    System.out.println(cities.toString());;
                    break;
                case 4:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println(
                "0 - to quit\n" +
                        "1 - go to next city\n" +
                        "2 - go to previous city\n" +
                        "3 - print cities in the itinerary\n" +
                        "4 - print menu options");
    }
}
