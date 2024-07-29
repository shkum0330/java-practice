package exercise.ch1;

import util.MyLogger;

import static java.lang.Thread.sleep;

public class StartTest2Main {
    public static void main(String[] args) {
        Thread thread=new Thread(()->{
            for (int i = 1; i <= 5; i++) {
                MyLogger.log("value: "+i);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"counter");
        thread.start();
    }

}
