package synchronization;

import code.practice.synchronization.ProperSingleton;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ProperSingletonTest {

  public class SampleThread extends Thread {

    @Override
    public void run() {
      ProperSingleton instance = ProperSingleton.getInstance();
      instance.increment();
      instance.increment();
      instance.increment();
      instance.increment();
      instance.increment();
    }
  }

  @Test
  public void itShouldIncrementProperly() throws InterruptedException {
    for (int i = 0; i < 10000; i++) {
      Thread t1 = new SampleThread();
      Thread t2 = new SampleThread();

      t1.start();
      t2.start();
      ProperSingleton instance = ProperSingleton.getInstance();
      t1.join();
      t2.join();
      Assert.assertEquals(10L, instance.getCounter());
      instance.reset();
    }

  }
}
