package Smthing.Day22;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/23.
 */
public class Moneyone {
    public static void main(String[] args) {
        System.out.println("**********************************\n" +
                "请选择购买的商品编号：\n" +"1.T恤   2.网球鞋  3.网球拍\n" +
                "***************************************" );
        Scanner input = new Scanner(System.in);
        char flag = 'y';
        int y=0;//消费金额
        System.out.println("");
        while (flag == 'y') {
            System.out.println("请输入商品编号");
            int num = input.nextInt();
            System.out.println("请选择要购买的数量");
            int sum = input.nextByte();
            switch (num) {
                case 1:
                    num=280;
                    System.out.println(num*sum);
                    y=y+ num*sum;
                    break;
                case 2:
                    num=330;
                    System.out.println(num*sum);
                   y=y+(num*sum);
                    break;
                case 3:
                    num=50;
                    System.out.println(num*sum);
                    y=y+(num*sum);
            }System.out.println("是否继续购买");
            flag = input.next().charAt(0);
        }System.out.println("应付金额"+y);
        System.out.println("折扣是0.8");
        System.out.println("打折以后"+y*0.8);
        System.out.println("实付金额");
        int v=input.nextInt();
        System.out.println("找零金额是"+(v-y*0.8));
        System.out.println();



       /* int sum=0;//和
        int mim=0;
        int num=0;
        while(num<=100){
            sum+=num;//sum=sum+num
            num=num+2;
        }
        System.out.println(sum);
    }*/
    }}


