package Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangning on 2017/5/6.
 */
class Animals {
    public int age;
    private double weight;

    public Animals() {
    }

    public Animals(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public int sleep(int hours) {
        return hours;
    }

    public void eat(String food) {
        System.out.println("eating " + food);
    }
}

public class Human extends Animals {
    public String name;
    private boolean married;

    Human() {
    }

    public Human(int age, double weight, String name, boolean married) {
        super(age, weight);
        this.name = name;
        this.married = married;
    }

    @Override
    public void eat(String food) {
        System.out.println(name + " is now eating " + food);
    }

    public void study(String course) {
        System.out.println(name + " is now studying " + course);
    }

    private void killAnimals(String animal) {
        System.out.println(name + " is now killing " + animal);
    }

}

class HumanTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Human human = new Human();
        Class clazz = human.getClass();
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        System.out.println("-- 构造方法都有 ---");//获取所有的构造方法
        for (Constructor constructor : declaredConstructors) {
            for (Parameter parameter : constructor.getParameters()) {//迭代输出
                System.out.println("\t" + parameter.getName());
            }
        }
        clazz = reflect.Human.class;

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

    }

}

