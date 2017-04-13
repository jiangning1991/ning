package Smthing.Day29;
import java.util.Arrays;


/**
 * Created by jiangning on 2017/3/29.
 */
public class Bubble {
    //对数组内的文字进行排序 也叫冒泡排序
    public static void main(String[] args) {//主方法
        int arr[] = new int[] { 23, 42, 12, 8 };//声明数组
        /*Arrays.sort(arr);*///将数组进行进行排序
//        for (int i = 0; i < arr.length; i++) {//循环遍历排序后的数组
//            System.out.println(arr[i]);//将排序后数组中的各个元素输出
//        }

       for (int i=0;i<arr.length-1;i++) {//每一趟
           for (int j = 0; j < arr.length - i - 1; j++) {
               int num = 0;//创建一个第三方变量
               if (arr[j] > arr[j + 1]) {
                   num = arr[j];//使用第三方变量，交换属性
                   arr[j] = arr[j + 1];
                   arr[j + 1] = num;

               }
           }
       }
//输出排序后的数组值

        //System.out.println(Arrays.toString(arr));//Arrays.toString 意思是把数组以字符串方式输出

       }}
