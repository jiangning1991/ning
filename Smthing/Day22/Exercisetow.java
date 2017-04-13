package Smthing.Day22;

/**
 * Created by jiangning on 2017/3/22.
 */
public class Exercisetow {
    public static void main(String[] agrs) {
        int a=100;
        while(a<1000){
            int x=a%10;
            int y=(a/10)%10;
            int z=a/100;
            if(x*x*x+y*y*y+z*z*z==a){
                System.out.println(a);
            }
            a++;
        }
    }
}
