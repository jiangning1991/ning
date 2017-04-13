package Smthing.Day30;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/30.
 */
public class Client {
    public static void main(String[] args) {
        boolean begin = true;
        CustomerBiz cb = new CustomerBiz();
        while (begin){
            System.out.println("请输入客户姓名：");
            Scanner key = new Scanner(System.in);
            String name = key.next();
            System.out.println(cb.addName(name));
            System.out.println("是否继续添加姓名？（Y/N）");
            String str = key.next();
            if (str.equals("N")) {
                begin = false;
            }
        }
        System.out.println("***************************************");
        System.out.println("            客户姓名列表");
        System.out.println("***************************************");
        cb.showNames();
        System.out.print("\n请输入要修改的客户姓名:");
        Scanner input = new Scanner(System.in);
        String oldName = input.next();
        System.out.print("请输入新的客户姓名:");
        String newName = input.next();
        System.out.println("\n------查找结果------");

    }

}