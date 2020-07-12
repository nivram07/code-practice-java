package code.practice.synchronization;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class SharedQueue {
  private volatile static SharedQueue sharedQueue;

  private BlockingQueue<Integer> queue;

  private SharedQueue() {
    queue = new LinkedBlockingQueue<>();
  }

  public SharedQueue getInstance() {
    SharedQueue instance = sharedQueue;
    if (instance == null) {
      synchronized (SharedQueue.class) {
        instance = sharedQueue;
        if (instance == null) {
          sharedQueue = new SharedQueue();
          instance = sharedQueue;
        }
      }
    }
    return instance;
  }

  public void add(Integer num) throws InterruptedException {
    if (num != null) queue.put(num);
  }

  public Integer take() throws InterruptedException {
    return queue.take();
  }

}
