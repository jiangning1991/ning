package InputTest;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by jiangning on 2017/4/20.
 */
public class ReaderTest {
    public static void main(String[] args) {//可以简写到这个程度
        try(Reader reader = new FileReader("text");) {
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}