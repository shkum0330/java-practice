package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {

    Queue<Task> queue=new ArrayDeque<>();

    public void addTask(Task task) {
        queue.add(task);
    }

    public int getRemainingTasks() {
        return queue.size();
    }

    public void processNextTask() {
        Task task= queue.poll();;
        assert task != null;
        task.execute();
    }
}
