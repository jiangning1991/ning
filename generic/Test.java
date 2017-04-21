package generic;

import com.sun.org.apache.xpath.internal.SourceTree;
import sun.text.resources.cldr.ia.FormatData_ia;

/**
 * Created by jiangning on 2017/4/13.
 */
public class Test< T > {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.concat(1,2));
        System.out.println(test.concat(true,false));

    }
    String concat(T x, T y){
        return String.valueOf(x).concat(String.valueOf(y));
    }
}
