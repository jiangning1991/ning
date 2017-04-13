package Smthing.Day22;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/22.
 */
public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入a");
        int a = input.nextInt();
        switch (a){
            case (1):
                System.out.println("拨爸爸的号");
                break;
            case (2):
                System.out.println("拨妈妈的号");
                break;
            case (3):
                System.out.println("拨爷爷的号");
                break;
                default:
                    System.out.println("拨奶奶的号");
        }



    }
}
