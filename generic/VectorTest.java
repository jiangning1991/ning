package generic;

import java.util.Vector;

/**
 * Created by jiangning on 2017/4/13.
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(); // 兼容
        vector.add("test...");
        vector.add("123");
        vector.add("true");
        vector.add("456"); //

        String s = vector.get(3); // Type safe
        System.out.println(s);
    }
}
