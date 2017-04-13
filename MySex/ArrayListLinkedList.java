package MySex;
import java.util.LinkedList;
import java.util.ArrayList;
/**
 * Created by jiangning on 2017/4/11.
 */
public class ArrayListLinkedList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 10000000; i++) {
            arrayList.add(i + "");
            linkedList.add(i + "");
        }

        long time1 = System.currentTimeMillis();
        System.out.println(arrayList.remove(10000000 - 1));
        long time2 = System.currentTimeMillis();
        System.out.println(linkedList.remove(10000000 - 1));
        long time3 = System.currentTimeMillis();

        System.out.println("arrayList: " + (time2 - time1)); // arrayList
        System.out.println("linkedList: " + (time3 - time2)); // linkedList
    }
}
