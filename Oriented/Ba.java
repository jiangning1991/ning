import com.sun.org.apache.bcel.internal.generic.IfInstruction;
import com.sun.xml.internal.bind.v2.runtime.output.ForkXmlOutput;
import sun.misc.JavaIOFileDescriptorAccess;

import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by jiangning on 2017/4/7.
 */
public class Ba {
    public static void main(String[] args) {
        /*int[][] ints = new int[3][5];
        for (int i = 0; i <ints.length ; i++) {
            for (int j = 0; j <ints[i].length ; j++) {
              ints[i][j]=j;

            }

        }
        System.out.println(ints[ints.length-1][ints[ints.length-1].length-1]);*/
        int[][]ints = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = 1;
        int a=0;
        for (int i = 0; i <ints.length ; i++) {
            for (int j = 0; j <ints[i].length ; j++) {
                a++;
                System.out.println("请输入第"+a+"个数字");
                ints[i][j]= scanner.nextInt();
                if (i==j){
                    sum+=ints[i][j];
                }
                if(i+j==ints.length-1){
                    num*=ints[i][j];
                }
            }
        }
        System.out.println(sum);
        System.out.println(num);

    }
}
