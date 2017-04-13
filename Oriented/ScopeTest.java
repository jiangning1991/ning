
import com.sun.xml.internal.bind.v2.runtime.output.ForkXmlOutput;
import sun.text.resources.cldr.ia.FormatData_ia;

/**
 * Created by jiangning on 2017/4/6.
 */
public class ScopeTest {
    public void m(String s) {
        System.out.println(i);
        int j = 0;
        System.out.println(j);
        method();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int k = 0; k < 10; k++) {
            System.out.println(k);
        }
        int i = 1;
        System.out.println(ScopeTest.i);
    }


    public static void method() {
    }

    private static int i;

}
