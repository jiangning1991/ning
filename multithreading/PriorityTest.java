package multithreading;

/**
 * Created by jiangning on 2017/5/9.
 */
public class PriorityTest implements Runnable {//priority  优先级 //输出方式，并不是绝对优先级
    public static void main(String[] args) {
Thread thread1 = new Thread(new PriorityTest(),"thread 1");
Thread thread2 = new Thread(new PriorityTest(),"thread 2");
Thread thread3 = new Thread(new PriorityTest(),"thread 3");
thread1.setPriority(5);
thread2.setPriority(5);
thread3.setPriority(10);
thread1.start();
thread2.start();
thread3.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {


            Thread currThread = Thread.currentThread();
            System.out.println(currThread.getName() + ":" + currThread.getPriority());
        }
    }
}