package Smthing.Exam;
import java.util.Arrays;
/**
 * Created by jiangning on 2017/4/1.
 */
public class Order {
    //定义一个方法，实现数组的转置输出（20 分）
    //例如： 源数组，1 2 3 4 5 6 转置之后的数组，6 5 4 3 2 1
    public static void main(String[] args) {
        int arr[]= new int[]{2,4,5,1,3,6};//声明数组
        Arrays.sort(arr);///将数组进行进行排序
       for (int i = 0; i < arr.length; i++) {//循环遍历排序后的数组
            System.out.print(arr[i]);//将排序后数组中的各个元素输出
       }
        System.out.println("/n数组逆序输出为：");

    }

}


