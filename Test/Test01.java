package Test;

import java.util.Scanner;
import java.util.stream.BaseStream;

/**
 * Created by jiangning on 2017/5/6.
 */
/*
利用 switch 语句将学生成绩分级,当从键盘中输入学生成绩在 100~90 范围时,输出“优 秀”,在 89~80 范围时输出“良好”,在 79~70 范围时输出“中等”,在 69~60 范围时输出 “及格”,在 59~0 范围时输出“不及格”,在其他范围时输出“成绩输入有误!”
*/
public class Test01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入学生成绩");
        int result = input.nextInt();
        if (result == 100) {
            System.out.println("优秀");
        } else {
            result = result / 10;
            switch (result) {
                case (9):
                    System.out.println("优 秀");
                    break;
                case (8):
                    System.out.println("良好");
                    break;
                case (7):
                    System.out.println("中等");
                    break;
                case (6):
                    System.out.println("及格");
                default:
                    if (result < 6) {
                        System.out.println("不及格");
                    } else {
                        System.out.println("成绩输入有误");
                    }


            }
        }
    }
}

