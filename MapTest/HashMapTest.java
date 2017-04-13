package MapTest;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by jiangning on 2017/4/12.
 */
public class HashMapTest {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "a");//输入方式按照尖括号里面的顺序
        map.put(100, "bcd");
        map.put(1000, "efgh");
        map.put(null,null);
        //键和值可以为空也可以一起为空 只有Hashtable 不能为空
//              键  + + 值
        System.out.println(map.size());//键不可以重复 ，输出结果为3
        System.out.println(map.get(100));//用键取值，结果为{bcd}

        for (Integer integer : map.keySet()) {
            System.out.println(integer + ">" + map.get(integer));
        } //iter 循环输出  根据键取出值

        for (String s : map.values()) {
            System.out.println(s);
        } //iter 循环输出 所有的值

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ">" + entry.getValue());
        } //iter 循环输出
    }
}
