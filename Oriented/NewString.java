import com.sun.org.apache.xml.internal.security.utils.SignerOutputStream;
import oracle.jrockit.jfr.tools.ConCatRepository;

import java.util.Arrays;

/**
 * Created by jiangning on 2017/4/7.
 */
public class NewString {
    public static void main(String[] args) {
        String s = "hi";
        System.out.println(s);
        s = "hello";
        System.out.println(s);

        // GC Garbage Collection 垃圾回收机制
        byte[] bytes = new byte[10];
        String s1 = ""; // deprecated 弃用\ [ˈdeprəkeɪtɪd]
        System.out.println("-" + s1 + "-");
        String s2 = "test...";
        String s3 = "test...";
        //        String s3 = new String("test...");
        System.out.println(s2 == s3);

         /*
          String Pool 字符串池
          "test..."
           */
        System.out.println("hello".charAt(4));
        //concat
        System.out.println("test1".concat("test2"));
        //contains
        System.out.println("test".contains("1"));
        //endsWith
        System.out.println("test".endsWith("t2"));
        //equals
        System.out.println("test".equals("test1"));
        System.out.println("test".equalsIgnoreCase("test1"));
        //indexOF
        System.out.println("test".indexOf(1));
        //lastIndexOF
        System.out.println("test".lastIndexOf("t"));
        //length
        System.out.println("test".length());
        //replace
        System.out.println("test".replace("es","se"));
        //split
        System.out.println(Arrays.toString("test".split("t")));
        //startWith
        System.out.println("test".startsWith("test1"));
        //subString
        System.out.println("test".substring(1));
        //toCharArray
        System.out.println("test".toCharArray());
        //toLowerCase
        System.out.println();
        for (int i = 0; i < bytes.length; i++) {
            byte aByte = bytes[i];
            
        }
    }
}


