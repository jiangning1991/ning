package reflect;

import java.lang.reflect.Field;

/**
 * Created by jiangning on 2017/5/4.
 */
public class AccessibleTest {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException {
        Person person = new Person(29);
        Field age = Class.forName("reflect.Person").getDeclaredField("age");
        age.setAccessible(true);//暴力访问
        System.out.println(age.get(person));
        age.setInt(person,age.getInt(person)+1);
        System.out.println(age.getInt(person));
    }
}

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }
}
