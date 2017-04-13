package Smthing.Day27;

/**
 * Created by jiangning on 2017/3/27.
 */
public class Bit {
    public static void main(String[] args) {
        //输出　100 -- 999之间, 所有个位为7的数
        for (int i=100;i<1000;i++) {
            int x=i/100;//取百位数
            int y=(i-x*100)/10;//取十位数
            int z=(i-100*x-10*y);//取个位数
            if(z==7){
                System.out.println(i);
            }
        }
    }
}
