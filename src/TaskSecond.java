import java.util.ArrayList;
import java.util.LinkedList;

public class TaskSecond extends Random {
    int i = 0;

    public void array() {
        ArrayList<Integer> arr = new ArrayList<>();
        while (i <= 100000) {
            arr.add(randomizer());
            i++;
        }

        i = 0;
        while (i <= 10000) {
            System.out.print(arr.get(randomHunT()));
            i++;
        }
    }

    public void linked() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        while (i <= 100000) {
            linkedList.add(randomizer());
            i++;
        }

        i = 0;
        while (i <= 10000) {
            System.out.print(linkedList.get(randomHunT()));
            i++;
        }
    }
}
