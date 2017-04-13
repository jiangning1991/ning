package MySex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by jiangning on 2017/4/10.
 */
public class StudentTest {
    //编写一个学生类，将学生的姓名年龄性别保存在ArrayList中 利用迭代器Iterator,将姓名年龄性别打印出来
    public static void main(String[] args) {//while 循环快捷键 itit
       List<String> list = new ArrayList<>();
       list.add("name");
       list.add("age");
       list.add("sex");
       Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();

        }
       }
    }

