package Smthing.Day30;

/**
 * Created by jiangning on 2017/3/30.
 */
public class Fruit {//创建一个水果类
    String  species;//种类
    String color;//颜色
    String size;//大小
    public String Juice(String species ){
      //System.out.println(species+"可以榨汁");
       /*if (species.equals("苹果")){
           return "苹果汁";
       }else if (species.equals("西瓜")){
           return"西瓜汁";
       }else if (species.equals("橘子")){
           return "橘子汁";
       }else {
           return "乱七八糟的汁";
       }*/
       return species+"汁";


    }
}
