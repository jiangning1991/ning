package MySet;

import java.util.LinkedHashSet;

/**
 * Created by jiangning on 2017/4/11.
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String>linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("e");
        linkedHashSet.add("b");
        linkedHashSet.add("c");
        linkedHashSet.add("d");
        System.out.println(linkedHashSet.size());
        for (String s : linkedHashSet) {
            System.out.println(s);//按元素添加顺序输出
        }
    }
}
