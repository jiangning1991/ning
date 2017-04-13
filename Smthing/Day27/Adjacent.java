package Smthing.Day27;

/**
 * Created by jiangning on 2017/3/27.
 */
public class Adjacent {
    public static void main(String[] args) {
        //输出 10 - 99 之间所有“相邻”的值,如: 23, 54, 98
        for (int i = 10; i <100; i++) {
            int x = i / 10;//取十位数
            int z = (i -  10 * x);//取个位数
            if (x-z==1|z-x==1) {
                System.out.println(i);
            }
        }
    }
}
