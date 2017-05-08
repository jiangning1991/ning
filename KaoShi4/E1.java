package KaoShi4;

/**
 * Created by jiangning on 2017/4/22.
 */
public class E1 {
    public static void main(String[] args) {
        try {
            System.out.println((new int[]{1, 2, 3})[-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }
}
