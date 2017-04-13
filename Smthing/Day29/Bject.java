package Smthing.Day29;

import java.rmi.StubNotFoundException;

/**
 * Created by jiangning on 2017/3/29.
 */
public class Bject {
    //name 姓名
    String name;
    //age 年龄
    int age;
    // grade年级
    int grade;
    // hobby爱好
    String hobby;
    public void show(){
        System.out.println("名字："+name+"\n"+"年龄："+age+"\n"+"年级:"+grade
                +"\n"+hobby);
    }
    public static void main(String[] args)
    {
        Bject zhanghao = new Bject();//创建学生对象
        //引用类的属性
        zhanghao.name = "张浩";
        zhanghao.age = 9;
        zhanghao.grade = 2;
        zhanghao.hobby = "打游戏";
        //引用类的方法
        zhanghao.show();

    }

}

