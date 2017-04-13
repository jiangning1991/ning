package Smthing.Day29;

import java.util.Arrays;

/**
 * Created by jiangning on 2017/3/29.
 */
public class Array {
    public static void main(String[] args) {
        int[][] a = new int[3][];
        a[0] = new int[4];
        a[1] = new int[3];
        a[2] = new int[1];
        int num = 0;
        for (int i=0;i<3;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j]=num;
                num++;
            }
            System.out.println(Arrays.toString(a[i]));
        }

    }
}