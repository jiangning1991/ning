package MapTest;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by jiangning on 2017/4/12.
 */
public class MyTreeMap<K,V>extends TreeMap<K,V> {
    @Override
    public V put(K key, V value) {

        if (value == null) {
            throw new NullPointerException();
        }
        return super.put(key, value);
    }

    public static void main(String[] args) {
        MyTreeMap<Integer, String> map = new MyTreeMap<>();
        map.put(null, "");
    }
}

