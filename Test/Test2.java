package Test;

import com.sun.javafx.collections.MappingChange;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by jiangning on 2017/4/12.
 */
public class Test2 {
    public static void main(String[] args) {


    /**
     * 使用 Map 接口的实现类完成员工工资(姓名→工资)的摸拟：
     * 添加几条信息
     * 列出所有的员工姓名
     * 列出所有员工姓名及其工资
     * 删除名叫 Tom 的员工信息
     * 输出 Jack 的工资，并将其工资改为 1500 元
     * 将所有工资低于 1000 元的员工的工资上涨 20%  感觉好难
     */
    Map<String,Double> map1 = new LinkedHashMap<>();
    map1.put("张三",123.0);
    map1.put("张si",979.0);
    map1.put("张wu",700.0);
    map1.put("Tom",444.0);
    map1.put("张liu",2900.0);
    map1.put("张qi",1900.0);
    map1.put("Jack",666.0);
        for (String s : map1.keySet()) {
            System.out.println(s);
        }
        System.out.println(map1);
        map1.remove("Tom");

        map1.get("Jack");
        map1.put("Jack",1500.0);
        System.out.println();
        for (Map.Entry<String, Double> entry : map1.entrySet()) {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
        for (String s : map1.keySet()) {
            if(map1.get(s)<1000){
                map1.put(s,(map1.get(s)*1.2));
                System.out.println(s+"涨完工资为"+map1.get(s));
            }
        }
        System.out.println(map1);


}
 }