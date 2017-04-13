package Smthing.Day31;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/31.
 */
public class Client {
    public static void main(String[] args) {
        boolean con = true;
        CustomerBiz c = new CustomerBiz();
        Scanner input = new Scanner(System.in);
        while (con) {
            System.out.println("请输入客户姓名:");
            String newName = input.next();
            c.addName(newName);
            System.out.println("继续输入码?(y/n):");
            String choice = input.next();
            if (choice.equals("n")) {
                con = false;
            }
        }
        System.out.println("********************************************************");
        System.out.println("\t\t客户姓名列表:\t\t");
        System.out.println("********************************************************");
        c.showNames();
        System.out.print("\n请输入要修改的客户姓名:");
        String oldName = input.next();
        System.out.print("请输入新的客户姓名:");
        String newName = input.next();
        System.out.println("\n------查找结果------");
        if (c.editName(oldName, newName)) {
            System.out.println("找到并修改成功");
            System.out.println("***************************************************");
            System.out.println("\t\t客户姓名列表\t\t");
            System.out.println("***************************************************");
            c.showNames();
        } else {
            System.out.println("没找到该学生");
            c.showNames();
        }
    }
}

