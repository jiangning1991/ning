package MySex;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangning on 2017/4/11.
 */
public class ArrayListTest1 {
    public static void main(String[] args) {
        List<String>strings = new ArrayList<>();
        strings.add("d");
        List<String> strings1 = new ArrayList<>();
        strings1.add("a");
        strings1.add("a");
        List<String> strings2 = new ArrayList<>();
        strings2.add("a");
        strings2.add("b");
        strings2.add("c");
        System.out.println(strings1.equals(strings1));// equals 意思是如果两个类元素值一样，并且顺序相同返回true反之false

        List<String> strings3 = strings2.subList(1, 3);//3为2的视图效果// subList 提取当前数组索引位置的起始为1，结束部位为3

        System.out.println(strings3);// 结果为（b,c）

        System.out.println(strings3.containsAll(strings1));// containsAll 表示是否全部包含里面的元素,是返回true反之false



        // retain 保留\ [rɪ'teɪn]
        strings3.retainAll(strings);//retainAll 保留两个列表的共有元素，
        System.out.println(strings3);
        // 列表3为列表2的视图元素，列表2发生改变列表3也要发生改变 removeAll 尽量放在retainAll后面
        //或者把3转换为列表   List<String> strings3 = new ArrayList<>( strings2.subList(1, 3));
        strings2.removeAll(strings3);// removeAll 将列表2中包含列表3的元素删除
        System.out.println(strings2);//输出结果为数组类型为【a】//
         }

}
