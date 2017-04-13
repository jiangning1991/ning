package Smthing.Day25;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/25.
 */
public class Text {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" 输入数值");
        double y = input.nextDouble();
        for (int x=0;x<1;x++){
            y*=(y*0.003);
        }System.out.println("y="+y);
    }
}
