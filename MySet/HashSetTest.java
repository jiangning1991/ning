package MySet;

import java.util.HashSet;

/**
 * Created by jiangning on 2017/4/11.
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        hashSet.add("Three");
        System.out.println(hashSet.size());//同样的道理，无序输出元素总数，不可重复，区分大小写
        for (String s : hashSet) {
            System.out.println(s);
        }//迭代输出当前类中的所有元素，与ArrayList不同的是不能指定输出，只能输出所有
        //HashSet与LinkedSet和TreeSet相比 效率高，但是输出不排序
        //LinkedSet和TreeSet输出排序，一个是按元素添加顺序，一个是按元素值排序
        //具体用哪个，看情况而定
    }
}
