package MySex;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by jiangning on 2017/4/10.
 */
public class HashtableTest {
    public static void main(String[] args) {
       Hashtable<Integer,String> hashtable = new Hashtable<Integer, String>();
       //(k->V) 括号里面 K--key  键  V--value 值
        hashtable.put(1,"a");
        hashtable.put(2,"b");
        hashtable.put(3,"c");
        hashtable.put(4,"d");
        hashtable.put(5,"e");
        hashtable.put(6,"f");
        //键和值都不能为空
        System.out.println(hashtable.size());//size 计算里面有多少值
        System.out.println(hashtable.get(4));//get 求键位上的值
        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer+"->"+hashtable.get(integer));
        }//可以取两种值
        for (String s : hashtable.values()) {
            System.out.println(s);
        }//求值
        System.out.println("----");
        for (Map.Entry<Integer, String> integerStringEntry : hashtable.entrySet()) {
            System.out.println(integerStringEntry.getKey()+"->"+integerStringEntry.getValue());
        }//两种都可以取出来
        //循环快捷键为 Iter
        System.out.println(hashtable.toString());//toString 用逗号把所有值取出
        System.out.println(hashtable.containsKey(2));//三个方法取得都是boolean类型
        System.out.println(hashtable.containsValue("a"));//三个方法取得都是boolean类型，含义更加明确，建议使用
        System.out.println(hashtable.contains("b"));//三个方法取得都是boolean类型，尽量用containsValue!!!



    }
}
