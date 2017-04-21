package exception;

/**
 * Created by jiangning on 2017/4/17.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("hello".charAt(4));// java.lang.StringIndexOutOfBoundsException  字符串下标越界
        System.out.println((new int []{1,2,3})[1]);// java.lang.ArrayIndexOutOfBoundsException 数组下标越界
        System.out.println(1/1);// java.lang.ArithmeticException 算术异常 不能除以0
        System.out.println(Integer.valueOf("123"));
        String s = "hi";
        //s = null;
        System.out.println(s.toUpperCase()); // java.lang.NullPointerException
        System.out.println("test....");
    }
}
