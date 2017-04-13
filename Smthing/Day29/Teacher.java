package Smthing.Day29;

import Smthing.Day29.Student;

/**
 * Created by jiangning on 2017/3/29.
 */
public class Teacher {
    String name;
    //profession 专业
    String profession;
    //squad course 课程
    String course;
    //hobby 爱好
    String age;
    public void show(){
        System.out.println(""+name+"\n"+"专业方向："+profession+"\n"+"教授课程："+course+"\n"+"教龄："+age+"\n");
    }

    public static void main(String[] args) {
        Teacher wanglaoshi = new Teacher();//创建学生对象
        //引用的属性
        wanglaoshi.name="王老师";
        wanglaoshi.profession="计算机";
        wanglaoshi.course="使用java语言";
        wanglaoshi.age="5";
        wanglaoshi.show();

        Student zhanghao = new Student();//创建学生对象
        //引用的属性

        //引用的类型
        zhanghao.show();//输出张浩的属性
    }
}
