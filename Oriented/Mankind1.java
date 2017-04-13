/**
 * Created by jiangning on 2017/4/6.
 */
public class Mankind1 {
    private static final int ONE_TWO_THREE = 123;//常量


    public Mankind1(String name){
        System.out.println(name + "constructor...");
    }
    static {
        System.out.println("static block...");
    }
    class A{}

}
