package kaoshi;

/**
 * Created by jiangning on 2017/4/28.
 */
public class T5 {
    public static void main(String[] args) {
        double d1 = -4.01; // -5
        double d2 = 4.99; // 5
        System.out.println(Math.round(d1));
        System.out.println(Math.round(d2));

        int i1 = (int) d1;
        int i2 = (int) d2;

        if (Math.abs(d1 - i1) >= 0.5) {
            System.out.println(i1 - 1);
        } else {
            System.out.println(i1);
        }

        if (d2 - i2 >= 0.5) {
            System.out.println(i2 + 1);
        } else {
            System.out.println(i2);
        }

    }
}
