/**
 * Created by jiangning on 2017/4/8.
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");
        stringBuffer.append(" world"); //追加语句
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.delete(5,6)); //delete 删除
        System.out.println(stringBuffer.insert(5,'!')); //插入
        System.out.println(stringBuffer.reverse());// 倒序
        stringBuffer.reverse().setCharAt(0,'H');//变换
        System.out.println(stringBuffer);
    }
}
