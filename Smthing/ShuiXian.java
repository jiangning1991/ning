package Smthing;

/**
 * Created by jiangning on 2017/4/19.
 */
public class ShuiXian {
    public static void main(String[] args) {
        for (int i = 100; i <1000 ; i++) {
            //123 = 1*1*1  + 2*2*2 + 3*3*3
            int bai = i/100;//百位
            int shi = i/10%10;//十位
            int ge = i%10;//个位
            if(i==bai*bai*bai+shi*shi*shi+ge*ge*ge){
                System.out.println(i);
            }

        }
    }
}
