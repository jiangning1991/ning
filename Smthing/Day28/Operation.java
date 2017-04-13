package Smthing.Day28;

/**
 * Created by jiangning on 2017/3/27.
 */
public class Operation {
    public static void main(String[] args) {
        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y+"*"+x+"="+y*x+"\t");
            }
            System.out.println();
        }
    }
}
