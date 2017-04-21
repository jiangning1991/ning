package InputTest;

import java.io.*;

/**
 * Created by jiangning on 2017/4/21.
 */
public class BufferedTest {
    public static void main(String[] args) {
        // buffer 缓冲\ ['bʌfə]
        try (
                BufferedInputStream in = new BufferedInputStream(new FileInputStream("new"));//提取
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("text"))//导入
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
