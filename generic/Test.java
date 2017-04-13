package generic;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by jiangning on 2017/4/13.
 */
public class Test<T> {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.concat(1,2));
        System.out.println(test.concat(true,false));

    }
    private String concat(T x,T y){
        return String.valueOf(x).concat(String.valueOf(y));
    }
}
