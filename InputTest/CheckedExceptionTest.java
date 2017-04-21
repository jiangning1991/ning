package InputTest;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;
import java.util.Scanner;

/**
 * Created by jiangning on 2017/4/18.
 */
public class CheckedExceptionTest {
    public static void main(String[] args) {

        test();
    }

    private static void test() {
        System.out.println("input a file name:");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "r");
        } catch (FileNotFoundException e) {
          // e.printStackTrace();
            System.err.println("file not found");
            test();//递归
        }
    }
}

