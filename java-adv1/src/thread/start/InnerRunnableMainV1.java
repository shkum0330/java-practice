package thread.start;

import static util.MyLogger.log;

public class InnerRunnableMainV1 {
    public static void main(String[] args) {
        log("main() start");
//        Runnable runnable = new MyRunnable();
//        Runnable runnable=new Runnable() {
//            @Override
//            public void run() {
//                log("run()");
//            }
//        };
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                log("run()");
//            }
//        });
        Thread thread = new Thread(()->log("run()"));
        thread.start();
        log("main() end");
    }
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            log("run()");
        }
    }
}
