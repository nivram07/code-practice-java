package code.practice.synchronization;

import java.util.concurrent.atomic.AtomicLong;

public class ProperSingleton {

  private static volatile ProperSingleton properSingleton;
  private final AtomicLong count = new AtomicLong(0);

  public static ProperSingleton getInstance() {
    ProperSingleton instance = properSingleton;
    if (instance == null) {
      synchronized (ProperSingleton.class) {
        instance = properSingleton;
        if (instance == null) {
          properSingleton = new ProperSingleton();
          instance = properSingleton;
        }
      }
    }
    return instance;
  }

  public void increment() {
    count.getAndIncrement();
  }

  public void decrement() {
    count.getAndDecrement();
  }

  public long getCounter() {
    return count.get();
  }

  public void reset() {
    count.set(0L);
  }
}
