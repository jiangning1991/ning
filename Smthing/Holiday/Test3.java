package Smthing.Holiday;

/**
 * Created by jiangning on 2017/4/8.
 */
public class Test3 {
    // （1）声明一个String类的变量并初始化值“Hello World”。
    //  　　（2）用字符串类的一个方法将上面变量的值拆分成” Hello” 和“World”两个字符串并打印输出。
    //  　　（3）将” Hello”这个变量转换成大写、“World”转换成 小写并打印输出。
    //  　　（4）声明一个String类的变量并初始化值“20100110”。
    //  　　（5）将上面变量的值转换成2010年1月10日的形式打印输出。
    public static void main(String[] args) {
        String string = "Hello World";
        String[]  arr=string.split("");
        System.out.println(arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+"    "+arr[6]+arr[7]+arr[8]+arr[9]+arr[10]);
        System.out.println((arr[0]+arr[1]+arr[2]+arr[3]+arr[4]).toUpperCase()+(arr[6]+arr[7]+arr[8]+arr[9]+arr[10]).toLowerCase());
        String num = "20100110";
        System.out.println(num.substring(0,4)+"年"+num.substring(4,6)+"月"+num.substring(6,8)+"日");


    }
}
