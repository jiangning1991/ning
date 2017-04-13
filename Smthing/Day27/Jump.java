package Smthing.Day27;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/27.
 */
public class Jump {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a=0;
        for (int i=0;i<=10;i++){
            a=a+i;
            if (a>20){
                break;
            }
        }
        System.out.println("累加值为："+a);
    }
}
