package kaoshi;

/**
 * Created by jiangning on 2017/4/28.
 */
public class q1 {
    private static int counter;
    public static void main(String[] args) {
        String s1 = "1,3,5";
        String s2 = "2,4,1,7,5";
        if (s1.length() > s2.length()) {
            String temp = s2; // temporary 临时的
            s2 = s1;
            s1 = temp;
        }
        String[] strings1 = s1.split(",");
        String[] strings2 = s2.split(",");
        for (int i = 0; i <strings1.length ; i++) {
            if (strings1[strings1.length-1-i].equals(strings2[strings2.length-1-i])) {
                counter++;
            }
        }
        System.out.println(strings1.length-counter);
    }
}
