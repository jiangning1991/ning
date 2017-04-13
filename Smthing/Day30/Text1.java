package Smthing.Day30;
import java.util.Arrays;//导入 java.util.Arrays 类

/**
 * Created by jiangning on 2017/3/30.
 */
public class Text1 {
    //替换数组元素
    //语法如下：
    // fill(int[] a , int value)
    // a要进行替换的数组
    // value 要存储数组中所有元素的值
    // 实例
    public static void main(String[] args) {
        int arr[] = new int[5];//创建 int 型数组
        Arrays.fill(arr, 8);//使用同一个值对数组进行填充
        for (int i = 0; i < arr.length; i++) {//循环遍历数组
            //将数组中的元素依次输出
            System.out.println("第" + (i+1) + "个元素是：" + arr[i]);
        }
    }
}
