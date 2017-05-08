package KaoShi4;

import java.io.*;

import static java.lang.System.in;

/**
 * Created by jiangning on 2017/4/22.
 */
public class E3 {
    public static void main(String[] args) {
        try {
            try (
                    InputStream inputStream = new FileInputStream("1.txt");
                    OutputStream outputStream = new FileOutputStream("3.txt");
                    InputStream inputStream1=new FileInputStream("2.txt");
            ) {
                int a;
                while ((a=inputStream.read())!=-1){
                    outputStream.write(a);
                }
                int b;
                while ((b=inputStream1.read())!=-1){
                    outputStream.write(b);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
