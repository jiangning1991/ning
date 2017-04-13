package MapTest;

import java.util.LinkedHashMap;

/**
 * Created by jiangning on 2017/4/12.
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("3",9);
        linkedHashMap.put("1",1);
        linkedHashMap.put("2",5);
        linkedHashMap.put("1",9);
        linkedHashMap.put("1",8);
        linkedHashMap.put("1",0);
        linkedHashMap.put("5",null);
        linkedHashMap.put(null,null);
        //按输入顺序输出
        //键和值可以都为空
        //键不可重复，重复的话，使用最后一个重复的键+值
        //键重复的话，输出键的顺序为按输入顺序，值用最后一个
        //最简单说法，键重复的话，键用第一个键的位置，值用最后一个
        System.out.println(linkedHashMap.size());
        System.out.println(linkedHashMap.get("1"));
        for (String s : linkedHashMap.keySet()) {
            System.out.println(s+">"+linkedHashMap.get(s));
        }
    }
}
