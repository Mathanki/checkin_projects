import java.util.List;

public class GenericMethodDemo {

    public GenericMethodDemo() {
    }

    public <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }
}
