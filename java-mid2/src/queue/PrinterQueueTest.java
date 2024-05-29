package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class PrinterQueueTest {
    public static void main(String[] args) {
        Queue<String> printQueue = new ArrayDeque<>();
        // 코드 작성
        printQueue.add("doc1");
        printQueue.add("doc2");
        printQueue.add("doc3");

        while (!printQueue.isEmpty()){
            System.out.println("출력: "+printQueue.poll());
        }
    }
}
