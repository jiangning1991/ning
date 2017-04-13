package Smthing.Day22;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/22.
 */
public class Cycle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("合格了吗？(yes/no)：");
        String answer = input.next();
        while(!"yes".equals(answer)){
            System.out.println("上午阅读教材！");
            System.out.println("下午上机编程！\no");
            System.out.println(" 合格了吗？(yes/no)：");
            answer = input.next();
        }
       /*System.out.println("完成学习任务！");
        System.out.println("我要写一千遍");
        int a=input.nextInt();
        int i=1;
        while (i<=10 ){

            System.out.println("第" +i+ "遍写：好好学习，天天向上！");
            i ++;
        */




    }
}
