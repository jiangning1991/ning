package InputTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by jiangning on 2017/4/21.
 */
public class BufferedReaderTest {
    private static final String FILE = "src/main/java/InputTest/BufferedReaderTest.java";

    public static void main(String[] args) {// 输出指定文本
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
