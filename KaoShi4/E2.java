package KaoShi4;

/**
 * Created by jiangning on 2017/4/22.
 */
public class E2 {
    public static void main(String[] args) {
        String s = "hi";
        s = null;
        try {
            System.out.println(s.toUpperCase());
        } catch (NullPointerException e) {
            System.err.println("空指针异常");
        }
    }
}
