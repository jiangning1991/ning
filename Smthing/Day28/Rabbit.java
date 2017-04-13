package Smthing.Day28;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/28.
 */
public class Rabbit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   
        int[]array = new int[40];
        array[0]=1;
        array[1]=1;
        for (int num=2;num<37;num++){
            array[num]=array[num-1]+array[num-2];
            if (array[num]==233){
                System.out.println("233在该数组的"+num+"位");
            }

        }
        System.out.println(array[36]);



    }
}
