package exercise.ch1;

import util.MyLogger;

import static java.lang.Thread.sleep;

public class StartTest3Main {
    public static void main(String[] args) {
        Thread thread1=new Thread(()->{
            while (true) {
                MyLogger.log("A");
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"Thread-A");
        thread1.start();

        Thread thread2=new Thread(()->{
            while (true) {
                MyLogger.log("B");
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"Thread-A");
        thread2.start();
    }
}
