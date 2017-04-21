package InputTest;

import jdk.nashorn.internal.scripts.JS;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by jiangning on 2017/4/18.
 */
public class InputStreamTest {
    public static void main(String[] args) {
        InputStream inputStream= null;
        try {// shift+ctrl+ 箭头 选取单词
             inputStream = new FileInputStream("text");
            //InputStream inputStream = new FileInputStream("D:/英雄时刻/图片切换/test.txt");
            int i;
            while ((i = inputStream.read()) != -1)
                System.out.print((char) i);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inputStream!=null) {
                try {
                    inputStream.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
