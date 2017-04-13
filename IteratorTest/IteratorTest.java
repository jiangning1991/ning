package IteratorTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by jiangning on 2017/4/12.
 */
public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        TreeSet<String> set = new TreeSet<>();
        set.add("b");
        set.add("a");

        Iterator<String> iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
//上面几种都可以直接调用iterator,而下面这个需要使用自己的方法来间接调用
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "bcd");
//HashMap 不能直接继承Iterator 但是他的方法keySet或者valuesSet可以间接继承iterator
        Iterator<Integer> iterator2 = map.keySet().iterator();
        while (iterator2.hasNext()) {
            int key = iterator2.next();
            System.out.println(key + ">" + map.get(key));
        }
    }
}
