package exception;

/**
 * Created by jiangning on 2017/4/17.
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            System.out.println("hello".charAt(4));

            System.out.println((new int[]{1, 2, 3})[-1]);

            System.out.println(1 / 1);

            System.out.println(Integer.valueOf("123"));
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        String s = "hi";
        //s = null;
        System.out.println(s.toUpperCase());

        System.out.println("test....");

    }
}
