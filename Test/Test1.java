package Test;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by jiangning on 2017/4/11.
 */
public class Test1 {
    private Object add;

    /**
     * 使用 Map 接口的实现类完成员工工资(姓名→工资)的摸拟：
     * 添加几条信息
     * 列出所有的员工姓名
     * 列出所有员工姓名及其工资
     * 删除名叫 Tom 的员工信息
     * 输出 Jack 的工资，并将其工资改为 1500 元
     * 将所有工资低于 1000 元的员工的工资上涨 20%  感觉好难
     */
    public static void main(String[] args) {

        Map<String, Integer> hashtable = new LinkedHashMap<>();
        hashtable.put("Tom", 700);
        hashtable.put("张三", 1200);
        hashtable.put("李四", 800);
        hashtable.put("赵武", 2900);
        hashtable.put("王六", 902);
        hashtable.put("Jack",3002);

        for (String s : hashtable.keySet()) {
            System.out.println(s);//输出所有员工姓名
        }

        for (Map.Entry<String, Integer> integerStringEntry : hashtable.entrySet()) {
            System.out.println(integerStringEntry.getKey() + "->" + integerStringEntry.getValue());
        }//输出姓名与工资
        hashtable.remove("Tom",700);
        System.out.println(hashtable);
        System.out.println("-----");

        System.out.println(hashtable.get("Jack"));
        hashtable.put("Jack", 1500);
        for (Map.Entry<String, Integer> integerStringEntry : hashtable.entrySet()) {
            System.out.println(integerStringEntry.getKey() + "->" + integerStringEntry.getValue());
        }
        System.out.println("----------");
        for (String s : hashtable.keySet()) {
            if (hashtable.get(s)<1000){
                double b = 0.0;
                b= hashtable.get(s)*1.2;
                hashtable.put(s, (int) b);
                System.out.println(b);
            }
        }
        System.out.println(hashtable);
        //这种方法保留精度 工资加上百分之二十，可能会出现小数
        //要求严谨的话用这个

       //for (String integer : hashtable.keySet()) {
       //    if(hashtable.get(integer)<1000){
       //        hashtable.put(integer, (int) (hashtable.get(integer)*1.2));
       //        System.out.println(integer+"涨完工资为"+hashtable.get(integer));

       //    }
       //}
       //System.out.println(hashtable);

    }



    }
