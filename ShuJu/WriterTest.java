package ShuJu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by jiangning on 2017/4/18.
 */
public class WriterTest {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("new");
            writer.write("中文");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
