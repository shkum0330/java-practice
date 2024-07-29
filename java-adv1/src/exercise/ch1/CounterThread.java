package exercise.ch1;

import util.MyLogger;

public class CounterThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            MyLogger.log("value: "+i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
