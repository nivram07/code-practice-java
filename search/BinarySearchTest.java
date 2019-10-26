package search;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BinarySearchTest {

  private int[] items = {1, 2, 3, 4, 5, 8, 10};

  @Test
  public void itShouldFindTheItemOne() {
    Assert.assertEquals((Integer)0, BinarySearch.search(items, 1));
  }

  @Test
  public void itShouldFindTheItem10() {
    Assert.assertEquals((Integer)6, BinarySearch.search(items, 10));
  }

  @Test
  public void itShouldReturnNullIfItemIsNotFound() {
    Assert.assertNull(BinarySearch.search(items, 11));
  }
}
