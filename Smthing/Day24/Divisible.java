package Smthing.Day24;

/**
 * Created by jiangning on 2017/3/24.
 */
public class Divisible {
    public static void main(String[] args) {
        int x = 0; //赋予变量
        int count = 0;  //其中有几次
       do{
           count+=x;
           x+=7;
       }while (x<=1000);
        System.out.println("整数和为="+(count));
    }

}
