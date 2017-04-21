package exception;

import java.io.FileNotFoundException;

/**
 * Created by jiangning on 2017/4/18.
 */
public class Test2 {
    private static void method()throws NullPointerException{
        try {
            System.out.println("e");
            throw new FileNotFoundException();
            //System.out.println("f");
        }catch (Exception e){
            System.out.println("g");
        }finally {
            System.out.println("h");
        }
        System.out.println("i");
    }

    public static void main(String[] args) {
        try {
            method();
            System.out.println("a");
        }catch (NullPointerException e){
            System.out.println("b");
        }finally {
            System.out.println("c");
        }
        System.out.println("d");
    }
}
