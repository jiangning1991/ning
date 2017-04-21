package InputTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by jiangning on 2017/4/20.
 */
public class Download {
    private static final String IMAGE_URL = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1492751232497&di=2fa8dab41acc8a279171738f320f29db&imgtype=0&src=http%3A%2F%2Fatt.img.xiushuang.com%2Fallimg%2F140826%2F153H35446-0.jpg";

    public static void main(String[] args) {
        try {
            URL url = new URL(IMAGE_URL);
            try (
                    InputStream inputStream = url.openStream();
                    OutputStream outputStream = new FileOutputStream("test.jpg")//把图片下载到指定位置
            ) {
                System.out.println(inputStream.available());//运行时间
                int i;
                while ((i = inputStream.read()) != -1) {
                    outputStream.write(i);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}