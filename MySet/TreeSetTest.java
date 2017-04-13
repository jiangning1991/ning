package MySet;

import java.util.TreeSet;

/**
 * Created by jiangning on 2017/4/11.
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("a");
        treeSet.add("b");
        treeSet.add("c");
        treeSet.add("d");
        System.out.println(treeSet.size());
        for (String s :treeSet){
            System.out.println(s);//按元素值排序输出
        }
    }
}
