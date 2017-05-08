package kaoshi;

import java.util.Arrays;

/**
 * Created by mingfei.net@gmail.com
 * 4/28/17 08:38
 * https://github.com/thu/JavaSE_20171
 */

/*
1.
输入字符串长度len1，字符串s1，字符串长度len2，字符串s2。从后向前比较，以最短字符串为标准，输出不同的元素的个数。
例如:
输入：s1=”1,3,5” len1=3 s2=”2,4,1,7,5” len2=5
输出：1
（20 分）
Choose File 文件名为 116.rar 或 116.zip
2.
找出字符串中出现次数最多的字母和出现的次数
（20 分）
Choose File 文件名为 117.rar 或 117.zip
3.
拆分字符串，字符串中含有逗号和数字，对数字排序并输出
例如：String s0=”123,45,25,85”;
输出：25 45 85 123
（20 分）
Choose File 文件名为 118.rar 或 118.zip
4.
输入一段字符串，字符串中只包含大小写字母。要求完成函数删除给定字符串中出现次数最少的字符。输出删除完的字符串。如果有多个出现次数一样的字符，都为最少时，一并删除。
例如：输入:abbccd，输出为bbcc
（20 分）
Choose File 文件名为 119.rar 或 119.zip
5.
写出一个程序，接受一个浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整
例如：
-4.5 四舍五入的结果是-4
4.4 四舍五入的结果是4
（20 分）
 */
public class T1 {

    private static int counter;

    public static void main(String[] args) {
        String s1 = "1,3,5,6,7,8";
        String s2 = "2,4,1,7,5";
        if (s1.length() > s2.length()) {
            String temp = s2; // temporary 临时的
            s2 = s1;
            s1 = temp;
        }
        String[] strings1 = s1.split(",");
        String[] strings2 = s2.split(",");
        for (String s : strings1) {
            for (String aStrings2 : strings2) {
                if (s.equals(aStrings2)) {
                    counter++;
                    break;
                }
            }
        }
        System.out.println(strings1.length - counter);
    }
}
