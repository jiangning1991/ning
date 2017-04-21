package generic;

import java.util.Date;

/**
 * Created by jiangning on 2017/4/13.
 */
public class Test1<S> {
    public static void main(String[] args) {
        Test<Integer> test = new Test<>();
        System.out.println(test.concat(1, 2));
        Test<Double> test1 = new Test<>();
        System.out.println(test1.concat(1.2, 3.4));
        Test<Date> test2 = new Test<>();
        System.out.println(test2.concat(new Date(), new Date()));
        Test<String> stringTest = new Test<>();
        System.out.println(stringTest.concat("hello", "hi"));
        Test<StringBuffer> stringBufferTest = new Test<>();
        System.out.println(stringBufferTest.concat(new StringBuffer("test1"), new StringBuffer("test2")));
    }

    private String concat(S x, S y) {
        return String.valueOf(x).concat(String.valueOf(y));
    }
}
