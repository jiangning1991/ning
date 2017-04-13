package MySex;

import java.util.LinkedList;

/**
 * Created by jiangning on 2017/4/11.
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();//创建LinkedList 接口
        strings.add("a");
        strings.add("b");

        System.out.println(strings.size());// size 当前元素数量为2
        System.out.println(strings.get(0));//get 当前数组下标为0的元素为a

        for (String string : strings) {
            System.out.println(string);
        }//循环输出当前类的所有元素

        System.out.println(strings.getFirst());//getFirst 输出当前类的 第一个元素
        System.out.println(strings.getLast());//getLast   输出当前类的最后一个元素
    }
}



