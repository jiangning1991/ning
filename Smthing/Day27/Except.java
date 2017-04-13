package Smthing.Day27;

/**
 * Created by jiangning on 2017/3/27.
 */
public class Except {
    public static void main(String[] args) {
        //输出 1 － 100之间能被5整除，但不能被3或8整除的值
        int b=0;
        for (int i=0;i<=100;i++){
            if (i%5==0&&i%3!=0&&i%8!=0){
                b+=i;
                System.out.println(i);
            }
        }

        System.out.println("1 － 100之间能被5整除，但不能被3或8整除的值为"+b);
    }
}
