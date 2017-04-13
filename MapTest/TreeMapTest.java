package MapTest;

import java.security.KeyStore;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;

/**
 * Created by jiangning on 2017/4/12.
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(2,"a");
        treeMap.put(5,"b");
        treeMap.put(6,"q");
        treeMap.put(1,"f");
        treeMap.put(1,null);
        //键不能为空 值可以为空
        //按元素值顺序输出
        System.out.println(treeMap.size());
        System.out.println(treeMap.get(6));
        for (Map.Entry<Integer, String> integerStringEntry : treeMap.entrySet()) {
            System.out.println(integerStringEntry.getKey()+integerStringEntry.getValue());
        }
    }
}
