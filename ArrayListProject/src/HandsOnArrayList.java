import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class HandsOnArrayList {
    ArrayList<String> students = new ArrayList<>();

    public HandsOnArrayList(){

    }

    public ArrayList<String> addName() {
        students.add("Mathanki");
        students.add("Suren");
        students.add("Uruthira");
        students.add("Niro");
        students.add("Ane");
        return students;
    }

    public void printNames(ArrayList<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public ArrayList<String> removeName(ArrayList<String> names, String removeName) {
        for (String name : names) {
            if (name.equals(removeName)) {
                names.remove(name);
            }
        }
        return names;
    }

    public ArrayList<String> sortList(ArrayList<String> names) {
        Collections.sort(names);
        return names;
    }

}
