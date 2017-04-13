package Smthing.Exam;

import java.util.Arrays;

/**
 * Created by jiangning on 2017/4/1.
 */
public class Text {
    public static void main(String[] args){
        int[] array = new int[]{5,6,3,23,7,8,};
        int[] newArray = new int[6];
        Arrays.sort(array);
        System.out.println("原数组为：");
        for(int i=0; i<array.length; i++){
            newArray[i] = array[i];
            System.out.print(array[i]+" ");
        }
        System.out.println("\n逆序并处理后的数组为：");
        for(int i=newArray.length-1; i>=0; i--){
            if(newArray[i]<0){
                newArray[i] = 0;
            }
            System.out.print(newArray[i]+" ");
        }
    }
}

