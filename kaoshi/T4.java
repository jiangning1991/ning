package kaoshi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiangning on 2017/4/28.
 */
public class T4 {
    public static void main(String[] args) {
        String s = "abcbcd"; // bcbc
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.get(c) == null ? 1 : map.get(c) + 1);
        }
        int min = Collections.min(map.values());
        StringBuffer stringBuffer = new StringBuffer(s); // abcbcd
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == min) {
                for (int i = 0; i < stringBuffer.length(); i++) {
                    if (stringBuffer.charAt(i) == entry.getKey()) {
                        stringBuffer.deleteCharAt(i);
                    }
                }
            }
        }
        System.out.println(stringBuffer);
    }
}
