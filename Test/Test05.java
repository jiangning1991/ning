package Test;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by jiangning on 2017/5/6.
 */
public class Test05 {
    private static final String Img_URL = "http://img1.imgtn.bdimg.com/it/u=1794894692,1423685501&fm=23&gp=0.jpg";

    public static void main(String[] args) {
        try {
                URL url = new URL(Img_URL);
                try(
                        InputStream inputStream = url .openStream();
                        OutputStream outputStream = new FileOutputStream("baidu.jpg")
                        ){
                    int line;
if((line = inputStream.read())!=-1){
    outputStream.write(line);
}
                }
        } catch (IOException e) {
            e.printStackTrace();
        }




        }
    }