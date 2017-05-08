package kaoshi;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by jiangning on 2017/4/28.
 */
public class T2 {
    public static void main(String[] args) {
        String s = "aaaaasssssddddffff";
        Hashtable<Character,Integer> hashtable = new Hashtable<>();
        for (int i = 0; i <s.length() ; i++) {
            char c =s.charAt(i);
            hashtable.put(c,hashtable.get(c)==null?1:hashtable.get(c)+1);
        }
        int max =0;
        for (Map.Entry<Character, Integer> entry : hashtable.entrySet()) {
            if (max<entry.getValue()){
                max=entry.getValue();
            }
        }
      System.out.println(max);
        for (Map.Entry<Character, Integer> entry : hashtable.entrySet()) {
            if (max==entry.getValue()){
                System.out.println(entry.getKey());
            }
        }
//       int max =0;
//       char c = 0;
//       for (int i = 0; i <s.length() ; i++) {
//           int n = 0;
//           for (int j = 0; j <s.length() ; j++) {
//               if (s.charAt(i)==s.charAt(j)) {
//                   n++;
//               }
//           }
//           if (n>max) {
//               max=n;
//               c = s.charAt(i);
//           }
//       }
//       System.out.println(c+":"+max);//这种方法有点问题
    }
}
