package Smthing.Day29;

/**
 * Created by jiangning on 2017/3/29.
 */
public class Student {
    //name
    String name;
    //age
    int age;
    //squad 班级
    String squad;
    //hobby 爱好
    String hobby;
    public void show(){
        System.out.println("姓名"+name+"\n"+"年龄："+age+"\n"+"就读于："+squad+"\n"+"爱好："+hobby+"\n");
    }

    public static void main(String[] args) {
        Student zhanghao = new Student();//创建学生对象
        //引用的属性


        zhanghao.name="张浩";
        zhanghao.age=10;
        zhanghao.squad="S1班";
        zhanghao.hobby="篮球";
        //引用的类型
        zhanghao.show();//输出张浩的属性
    }}


