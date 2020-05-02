package code.practice.java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@RunWith(JUnit4.class)
public class PracticeCollectionsTest {

  @Test
  public void testMap() {
    Map<String, String> map = new HashMap<>();
    map.put("1", "val1");
    map.put("2", "val2");
    map.put("3", "val3");
    map.entrySet().removeIf(entry -> entry.getKey().equals("2"));
    map.forEach((k,v) -> System.out.format("%s:%s\n",k, v));

  }
}
