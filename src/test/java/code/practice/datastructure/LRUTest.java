package code.practice.datastructure;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(JUnit4.class)
public class LRUTest {

  @Test
  public void itShouldSuccessfullyAdd() {
    LRU lru = new LRU(2);
    lru.offer(1);

    assertEquals(lru.getSize(), 1);

    lru.offer(2);

    assertEquals(lru.getCapacity(), 2);
    assertEquals(lru.getSize(), 2);
    lru.print();
  }

  @Test
  public void itShouldSuccessfullyGetItems() {
    LRU lru = new LRU(4);
    lru.offer(1);
    lru.offer(2);
    lru.offer(3);
    lru.offer(4);
    assertEquals(lru.getSize(), 4);
    lru.print();
    lru.offer(5);
    lru.print();
    LRU.Node node = lru.get(2);
    assertEquals(node.getId(), 2);
    System.out.format("get: %s\n", node.toString());
    lru.print();

    node = lru.get(4);
    assertEquals(node.getId(), 4);
    System.out.format("get: %s\n", node.toString());

    lru.print();
    lru.offer(5);
    lru.print();
    lru.offer(1);
    lru.print();
    lru.offer(4);
    lru.print();
    lru.offer(null);
    lru.print();
  }

  @Test
  public void itShouldSuccessfullyDeleteItems() {
    LRU lru = new LRU(4);
    lru.offer(1);
    lru.offer(2);
    lru.offer(3);
    lru.offer(4);
    lru.print();
    lru.offer(5);
    lru.print();
    lru.remove(2);
    LRU.Node node = lru.get(2);
    assertNull(node);
    lru.print();
    lru.offer(3);
    lru.print();
    lru.offer(1);
    lru.print();
  }
}
