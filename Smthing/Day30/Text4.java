package Smthing.Day30;
import java.util.Arrays;
/**
 * Created by jiangning on 2017/3/30.
 */
public class Text4 {
    //copyOfRange()方法
    //copyOfRange(arr,int formIndex,int toIndex)
//arr：要进行复制的数组对象。
    //formIndex：指定开始复制数组的索引位置。formIndex 必须在 0 至整个数组的长度之间。新数
    //组包括索引是 formIndex 的元素。
    //toIndex：要复制范围的最后索引位置。可大于数组 arr 的长度。新数组不包括索引是 toIndex
    //的元素。
    public static void main(String[] args) {
        int arr[] = new int[] { 23, 42, 12, 84, 10 };//定义数组
        int newarr[] = Arrays.copyOfRange(arr, 0, 3);//复制数组
        for (int i = 0; i < newarr.length; i++) {//循环遍历复制后的新数组
            System.out.println(newarr[i]);//将新数组中的每个元素输出
        }
    }
}
