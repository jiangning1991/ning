package Examination;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/26.
 */
public class ss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int x=1;//定义一个变量
       int y=0;//
       while (x<=100){
           if(x%6==0)
           y++;
           x++;
       }
        System.out.println(y);

    }
}
