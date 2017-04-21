package IteratorTest;

import java.util.*;

/**
 * Created by jiangning on 2017/4/12.
 */
public class ArraysTest {
    public static void main(String[] args) {
      // String[] strings = {"a", "g", "c", "f", "d"};
      // System.out.println(Arrays.toString(strings));//以数组方式输出
      // System.out.println(Arrays.binarySearch(strings, "c"));//输出元素下标值
      // String[] strings1 = Arrays.copyOf(strings, 6);//复制上一个数组到新数组中，长度不够用数据类型的默认值来补
      // System.out.println(Arrays.toString(strings1));//因为长度不够所以用null来补位
      // System.out.println(Arrays.toString(Arrays.copyOfRange(strings, 1, 3)));//截取数组下标1开始3-1结束的元素
      // Arrays.sort(strings);//对数组元素按元素值排序
      // System.out.println(Arrays.toString(strings));//输出方式为数组类型


        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("a");
        strings.add("1");
        strings.add("c");


        List<String> strings1 = new ArrayList<>();
        strings1.addAll(strings);
        System.out.println(strings1);//顺序输出
        Collections.reverse(strings1);//reverse 倒序输出
        System.out.println(strings1);
       //System.out.println("---------------------");
       //LinkedList<String>strings = new LinkedList<>();
       //strings.add("a");
       //strings.add("1");
       //strings.add("c");

       //Iterator<String> iterator = strings.descendingIterator();
       //while (iterator.hasNext()) {
       //    String next = iterator.next();//倒序输出
       //    System.out.println(next);
       //}


    }
}
