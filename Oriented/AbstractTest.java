package Oriented;

/**
 * Created by jiangning on 2017/4/5.
 */
public abstract class AbstractTest { //抽象类
    // abstract 抽象的 深奥的
   private int i;

   public abstract void method1();
    public abstract void method2();
    public abstract String method3(int i,double b, boolean c);
    public  void method4(){

    }


    public static void main(String[] args) {
       // AbstractTest abstractTest = new AbstractTest();// 不能实例化需要用别的方法  //instantiated 实例化
    SubAbstractTest subAbstractTest = new SubAbstractTest();
        System.out.println(subAbstractTest); // java1702.javase.oop.SubAbstractTest@...
        subAbstractTest.method1();
        subAbstractTest.method4();
    }
}
class SubAbstractTest extends AbstractTest{
    public void method1() {

    }

    public void method2() {

    }

    public String method3(int i, double b, boolean c) {
        return null;
    } // implement 实现

}
/*
class SubAbstractTest extends AbstractTest {
    // implement 实现
    @Override
    public void method1() {
        System.out.println("in SubAbstractTest...");
    }

    @Override
    public void method2() {
    }

    @Override
    public String method3(int i, double d, boolean b) {
        return "test";
    }

    @Override
    public void method4() {
        super.method4();
    }
}*/
