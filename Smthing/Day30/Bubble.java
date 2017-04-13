package Smthing.Day30;

import java.util.Arrays;

/**
 * Created by jiangning on 2017/3/30.
 */
public class Bubble {
    public static void main(String[] args) {
        int arr[] = new int[]{22,13,66,44,33,};
            for (int i=0;i<arr.length;i++){
                for (int j=0;j<arr.length-i-1;j++){
                    int a =0;
                    if(arr[j]>arr[j+1]){
                        a = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = a;
                    }
                }
            }
        System.out.println(Arrays.toString(arr));
        }
    }

