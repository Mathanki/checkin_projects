import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Array List Pratice:");        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
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
        students = handsOnArrayList.sortList(students);
        handsOnArrayList.printNames(students);
        System.out.println();

    }
}