package Smthing.Day28;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/27.
 */
public class Noob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i <3; i++){
            double sum = 0.0;
            System.out.println("请输入第" + (i+1) + "个班级的成绩");
            for(int j = 0; j < 4; j++){
                System.out.print("第" + (j+1) + "个学员的成绩：");
                int score = input.nextInt();
                sum = sum + score;
            }
            double aver = sum / 4;	        //计算平均分
            System.out.println("第"+(i+1)+"个班级平均分" + aver );
        }

    }
}
