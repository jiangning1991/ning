package InputTest;

import java.io.RandomAccessFile;

/**
 * Created by jiangning on 2017/4/21.
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("raa", "rw")){
            for (int i = 0; i < 10; i++) {
                randomAccessFile.writeDouble(i * 0.5);
            }
            // EOFException End of File
            randomAccessFile.seek(32L); // seek 寻求\ [siːk]
            System.out.println(randomAccessFile.readDouble());
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
