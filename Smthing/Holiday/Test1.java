package Smthing.Holiday;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/4/8.
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("输入一个字符串");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int sum = 0;
        for (int i = 0; i <string.length() ; i++) {
            sum = sum +string.charAt(i);
        }
        System.out.println(sum);
    }
}
