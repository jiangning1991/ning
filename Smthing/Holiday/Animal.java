package Smthing.Holiday;

/**
 * Created by jiangning on 2017/4/8.
 */
public interface Animal {
    //    (1) 编写 Animal 接口，接口中声明 eat() 方法
//(2) 定义Bird类和 Fish 类实现 Animal 接口,Bird 中还有 flying 方法，Fish 中还有 swimming 方法，分别实现这些方法
//            (3) 编写 Bird 类和 Fish 类的测试程序，并调用其中的各个方法
    public void eat();

    void swimming();

    void flying();
}

abstract class Bird implements Animal {
    public void flying() {
    }

    @Override
    public void eat() {
    }

}

abstract class Fish implements Animal {

    @Override
    public void swimming() {
    }

    @Override
    public void eat() {

    }
}

class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void eat() {
                System.out.println("吃饭");
            }

            @Override
            public void swimming() {
                System.out.println("游泳");
            }

            @Override
            public void flying() {
                System.out.println("飞翔");
            }
        };
        a.swimming();
        a.eat();
        a.flying();


    }

}


