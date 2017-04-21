package InputTest;

import java.io.File;
import java.io.IOException;

/**
 * Created by jiangning on 2017/4/21.
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("/Users/jiangning/IdeaProjects/ning/temp");
        System.out.println(file.isFile());//判断他是不是一个文件
        System.out.println(file.isDirectory());//判断他是不是一个文件夹
        System.out.println(file.canRead());//判断他是不是可读的
        System.out.println(file.canWrite());//判断他是不是可写
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //file.delete(); 删除创建的文件
        //file.deleteOnExit();
        System.out.println(file.getAbsoluteFile());//获取他的绝对路径形式
        System.out.println(file.getAbsolutePath());//获取他的绝对路径字符串
        System.out.println(file.getName());//获取文件名
        System.out.println(file.getParent());//假如上面是绝对路径的话，这段话取上一级,返回字符串类型
        System.out.println(file.getParentFile());//返回此抽象路径名父目录的抽象路径名；如果此路径名没有指定父目录，则返回 null

    }
}
