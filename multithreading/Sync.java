package multithreading;

import javax.sound.midi.Soundbank;

/**
 * Created by jiangning on 2017/5/12.
 */
 class Sync {
     synchronized void waitTest() {
//        synchronized (Sync.class) {
        System.out.println(Thread.currentThread().getName() + " start...");
        try {
            this.wait();//使 程序进入阻塞状态需要被 notify,或者 notifyAll 唤醒才能继续运行
//            Thread.sleep(1000);//使程序进入休眠状态 可以自己定义休眠时间，时间到自己继续运行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " end...");
//        }
    }
    synchronized void notifyTest(){
        System.out.println(Thread.currentThread().getName()+"notify  start....");
        this.notifyAll(); //唤醒所有程序 使所有程序继续运行
//        this.notify();//唤醒程序，使单个程序运行
        System.out.println(Thread.currentThread().getName()+"notify  end...");
    }
}

class SyncTest implements Runnable {
    private static Sync sync = new Sync();

    public void run() {
        if (Thread.currentThread().getName().endsWith("")) {
            sync.notifyTest();
            return;
        }
//        sync = new Sync();
        sync.waitTest();
    }

    public static void main(String[] args) {
//        SyncTest syncTest = new SyncTest();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new SyncTest(), "thread " + i);
            thread.start();
        }
    }
}