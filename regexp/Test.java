package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jiangning on 2017/4/27.
 */
public class Test {
    // pattern 模式  matcher 匹配
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(?i)E");
//        Pattern pattern = Pattern.compile("E",Pattern.CASE_INSENSITIVE);// JS var pattern = /e/;
        //Pattern.CASE_INSENSITIVE 可以写2 ，但是为了代码含义更加明确，不建议用 数字2
        Matcher matcher = pattern.matcher("aesedef");
        /*System.out.println(matcher.find());*///他会占用一个，相当于 FONT SIZENext
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
