import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        System.out.println("Array List Pratice:");
        HandsOnArrayList handsOnArrayList = new HandsOnArrayList();
        System.out.println("Print added names in list:");
        ArrayList<String> students = handsOnArrayList.addName();
        handsOnArrayList.printNames(students);
        System.out.println();

        System.out.println("remove  Niro name from list:");
        students = handsOnArrayList.removeName(students,"Niro");
        handsOnArrayList.printNames(students);
        System.out.println();

        System.out.println("Print sorted names in list:");
        //sorts its elements based on their natural ordering
       // students = handsOnArrayList.sortList(students);
        // Sort the list using the external comparator
        Collections.sort(students, new NameComparator());
        handsOnArrayList.printNames(students);
        System.out.println();

    }
}