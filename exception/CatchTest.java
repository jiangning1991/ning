package exception;

/**
 * Created by jiangning on 2017/4/17.
 */
public class CatchTest {
    public static void main(String[] args) {
        try {
            System.out.println(1/1);
            System.out.println("hello".charAt(6));
        } catch (ArithmeticException e) {
            //e.printStackTrace();
            System.err.println("异常处理...");
        }
        System.out.println("test");
    }
}
