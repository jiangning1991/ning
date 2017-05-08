package multithreading;

/**
 * Created by jiangning on 2017/5/8.
 */
public class Test implements Runnable{
    public static void main(String[] args) {
        // 进程 process 过程\ ['prəʊses]
        // 线程 thread 线程\ [θred]

//        run();

        Test test = new Test();
        Thread thread = new Thread(test);
        thread.start();

//        test.run();

        System.out.println("test...1");
        System.out.println("test...2");
        System.out.println("test...3");
        System.out.println("test...4");
        System.out.println("test...5");
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }

//    private static void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//    }
}
