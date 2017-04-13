package MySex;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangning on 2017/4/10.
 */
public class ArrayListTest<E> extends ArrayList<E> {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        List<String> strings = new ArrayList<>();//引入字符型
        strings.add("hi");//集合引入单个元素用add
        strings.add("hello");//集合引入单个元素用add
        strings.add("test1");//集合引入单个元素用add
        strings.add("test2");//集合引入单个元素用add

        strings.addAll(0, strings);//引入上面所有元素
//        strings.clear();//删除上面全部元素
        strings.remove(0);//删除数组下标0位置的元素
//        strings.removeRange()
        System.out.println(strings.size());//当前框架共多少元素
        System.out.println(strings.get(0));//当前下标位置元素值
        System.out.println("---");
        for (String string : strings) {// for循环快捷键iter
            System.out.println(string);
        }//循环输出所有元素

        System.out.println(strings.contains("test1"));//boolean类型判断里面有没有值是这个，结果为true
        System.out.println(strings.containsAll(strings));//boolean类型判断里面是不是字符类型，结果为true
        System.out.println(strings.indexOf("test1"));//当前元素在数组下标的位置
        System.out.println(strings.isEmpty());// 判断是否为空，结果为false
        System.out.println("---------");
        System.out.println(strings.lastIndexOf("test1"));//判断当前元素在数组下标中最后的数组下标为几
        //当前下标1为“test1”后面5也为“test1”所以输出结果为5

        ArrayListTest<Integer> integers = new ArrayListTest<>();//引入基本数据类型
        integers.add(1);
        integers.add(2);
        integers.add(3);


        integers.removeRange(1, 2);// 删除数组下标为1的元素，后面元素自动前移
        System.out.println(integers.set(1, 4)); // 输出当前数组下标为1的数据，输出完成后替换为4
        System.out.println("------");
        System.out.println(integers); // 输出当前数组内所有元素

        for (Object o : integers.toArray()) {//循环输出当前所有元素，与上面相同，只是上面是数组类型，下面是 数据类型
            System.out.println(o);
        }

        System.out.println(integers.size()); // 输出当前数组内元素的个数
        System.out.println("-------");

        /// capacity
        Field field = ArrayList.class.getDeclaredField("elementData"); // reflect vi.\ 反射，映现；深思
        field.setAccessible(true);
        System.out.println("capacity1: " + ((Object[]) field.get(integers)).length);//集合容量为默认值10
        ///

        integers.trimToSize(); //删除无用的地方让集合容量和当前元素个数相同// capacity = size
        System.out.println("capacity2: " + ((Object[]) field.get(integers)).length);//这里容量输出结果为2，容量==元素和
        System.out.println(integers.size()); // 当前元素共2个


        System.out.println("  hello hi   ".trim());//删除无用的空格之类的东西
    }
}
