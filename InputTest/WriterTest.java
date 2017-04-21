package InputTest;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by jiangning on 2017/4/20.
 */
public class WriterTest {
    public static void main(String[] args) {
        Writer writer = null;
        try {
            writer = new FileWriter("new");
            writer.write(Integer.parseInt("4e00", 16));
            writer.write(Integer.parseInt("4e00",16));
            writer.flush();//这条代码可以不用写，后面用close可以实现
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (writer!=null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        }
}