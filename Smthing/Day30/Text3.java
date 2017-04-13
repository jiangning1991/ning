package Smthing.Day30;
import java.util.Arrays;
/**
 * Created by jiangning on 2017/3/30.
 */
public class Text3 {
    //复制数组
    //Arrarys 类的 copyOf()方法与 copyOfRange()方法可以实现对数组的复制。
    //copyOf()方法是复制数组至指定长度
    //copyOfRange()方法则将指定数组的指定长度复制到一个新数组中。
    //copyOf(arr,int newlength)
//arr：要进行复制的数组
    //newlength：int 型常量，指复制后的新数组的长度。
    public static void main(String[] args) {
        int arr[] = new int[]{23, 42, 12};//定义数组
        int newarr[] = Arrays.copyOf(arr, 5);//复制数组 arr
        for (int i = 0; i < newarr.length; i++) {//循环变量复制后的新数组
            System.out.println(newarr[i]);//将新数组输出
        }

    }
}
