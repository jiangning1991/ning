package Smthing.Holiday;
import java.util.Arrays;

/**
 * Created by jiangning on 2017/4/8.
 */
public class Test2 {
    public static void main(String[] args) {
        int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int newArr[]=new int[oldArr.length-4];// 因为旧数组有4个零，而新数组不要零所以要减去
        int k=0;
        for(int i=0;i<oldArr.length;i++){
            if(oldArr[i]!=0){ //假如他不为零，就把数值赋予新数组
                newArr[k]=oldArr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(newArr));

    }
    }

