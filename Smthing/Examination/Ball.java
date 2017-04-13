package Examination;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/25.
 */
public class Ball {
    public static void main(String[] args) {
        //一球从100米高度落下，每次落地后反跳回原高度的一半，再落下，求它在第10次的时候，反跳高度多少，反弹的高度共经过多少米？
       double x = 0,y = 0;
       double z=100;
       for (int i=0;i<10;i++){
           z=z/2;
           x = x+z;
           y = y+z;
       }
        System.out.println("第10次反弹高度为"+z);
        System.out.println("第10次落地时，经过"+(x+y+100)+"米");
}}
