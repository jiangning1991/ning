import java.util.Vector;
/**
 * Created by jiangning on 2017/4/8.
 */
public class VectorTest {


    public static void main(String[] args) {
     // cector 向量 矢量
     Vector<String> strings = new Vector<>(100);
     for (int i = 0; i <100 ; i++) {
         strings.add("hello");
     }
     //strings.clear(); // clear 删除前面的
     strings.add("hi");
     strings.remove(99);// 移除第99个元素
     System.out.println(strings.size());// size 已经用多少
     System.out.println(strings.capacity());//capacity 容量共多少，假如不设置的话，初始为10满了以后成倍增加
        System.out.println(strings.get(99));
    }
}
