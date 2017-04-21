package generic;

/**
 * Created by jiangning on 2017/4/13.
 */
public class SuperClass<T> {
    public void method(T t){
        System.out.println("method....");
    }
}
class SubClass<T> extends SuperClass<T>{
    public static void main(String[] args) {
        SuperClass<String>stringSuperClass = new SuperClass<>();
        stringSuperClass.method("test");

        SubClass<String>subClass = new SubClass<>();

    }

}
