package Smthing.Day24;

/**
 * Created by jiangning on 2017/3/24.
 */
public class Question {
    public static void main(String[] args) {
        //计算1至50中是7的倍数的数值之和
        int x = 0; //赋予变量
        int count = 0;  //其中有几次
        do{

            count+=x;
            x+=7;
        }while (x<50);
        System.out.println("1至50中是7的倍数的数值之和为："+(count));


    }

}
