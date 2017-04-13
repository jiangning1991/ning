package Smthing.Day1;

/**
 * Created by jiangning on 2017/4/1.
 */
public class Human {
    private String name; //名字是字符型 用 “String” 类型
    private char gender;//性别 只有两个选择用 “char”类型
    private int age;   //年龄 用int
    private double height;//身高或体重会牵扯到小数，用“double”类型
    //private 修饰词
    //constructor  中间可以插入构造方法，并不是空白的
    //void 空的 的意思
   //构造器的快捷键为 alt + insert
    public Human(String name, char gender, int age, double height) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        Human human = new Human("chaochao",'M',16,155);//实际参数 实参
        System.out.println(human.name);
        System.out.println(human.gender);
        System.out.println(human.age);
        System.out.println(human.height);
    }

    public void work(boolean b){
       /* if (b) {
            //...
        } else {
            //
            //
            //

            //
            //
            //
        } */
       //可以用另一种整齐的方式
        //
        if (b){
            //.....
            return;
        }
        //...
        //.
        ///
        ///
        //
        //
        //


    }
    public void eat(String foods,double amount){//形式参数 也叫形参
        System.out.println(name+"吃了"+amount+foods);

    }
    public int sheep(boolean isPlayGame) {

        return  isPlayGame ? 1 : 8;














    }
}
