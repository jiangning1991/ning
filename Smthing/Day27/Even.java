package Smthing.Day27;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/27.
 */
public class Even {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=0;
        int y=0;
        for (int i=1;i<=10;i++){
            if(i%2==0){
                x+=i;
            }else {
                y+=i;
            }


    }System.out.println("1~10之间的所有偶数和为："+x);
        System.out.println("1~10之间的所有奇数和为："+y);
}
}
