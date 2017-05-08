package InputTest;

import java.io.*;

/**
 * Created by jiangning on 2017/4/21.
 */
public class BufferedTest {
    public static void main(String[] args) {
        // buffer 缓冲\ ['bʌfə]
        try (
                BufferedInputStream in = new BufferedInputStream(new FileInputStream("1.txt"));//提取
                BufferedInputStream in2 = new BufferedInputStream(new FileInputStream("2.txt"));//提取
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("3.txt"))//导入
        ) {
            int i;
            while ((i = in.read()) != -1) {
                out.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
