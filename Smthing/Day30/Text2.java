package Smthing.Day30;
import java.util.Arrays;
/**
 * Created by jiangning on 2017/3/30.
 */
public class Text2 {
    //填充及替换数组中的指定范围内的元素
    //fill(int[] a , int fromIndex , int toIndex , int value)
    //该方法将指定的 int 值分配给 int 型数组指定范围中的每个元素。填充的范围从索引 fromIndex（包
    //括）一直到索引 toIndex（不包括）。如果 fromIndex == toIndex，则填充范围为空。
    //a：要进行填充的数组。
    //fromIndex：要使用指定值填充的第一个元素的索引（包括）
    // toIndex：要使用指定值填充的最后一个元素的索引（不包括）。
    // value：要存储在数组所有元素中的值。
    public static void main(String[] args) {
        int arr[] = new int[]{45, 12, 2, 10};//定义并初始化 int 型数组 arr
        Arrays.fill(arr, 1, 2, 8);//使用 fill()方法对数组进行初始化
        for (int i = 0; i < arr.length; i++) {//循环遍历数组中的元素
            System.out.println("第" + i + "个元素是：" + arr[i]);//将数组中的每个元素输出
        }
    }
}
