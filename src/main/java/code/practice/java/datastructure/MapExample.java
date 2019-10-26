package code.practice.java.datastructure;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {

  public static void main(String[] args) {
    Map<String, Integer> myMap = new HashMap<>();
    myMap.put("hello", 1);
    myMap.put("world", 2);


    Iterator<Map.Entry<String, Integer>> mapIterator = myMap.entrySet().iterator();
    while (mapIterator.hasNext()) {
      Map.Entry<String, Integer> currentEntry = mapIterator.next();
      if (currentEntry.getKey().equalsIgnoreCase("world")) {
        currentEntry.setValue(currentEntry.getValue() + 3);
      }
    }

    myMap.forEach((k,v) -> System.out.println(k + ": " + v));

    String stringSample = "Hello World";
    System.out.println(stringSample.charAt(2));

    System.out.println(isPalindrome("racecar"));
    System.out.println(isPalindrome("hello"));
    System.out.println(isPalindrome("hellolleh"));

    ArrayList<String> myArrayList = new ArrayList<>();
    myArrayList.add("word1");
    myArrayList.add("word2");
    myArrayList.add("word3");

    Iterator<String> it = myArrayList.iterator();
    while (it.hasNext()) {
      String currentString = it.next();
      if (currentString.equalsIgnoreCase("word2")) {
        it.remove();
      }
    }

    myArrayList.forEach(e -> System.out.println(e));

  }

  public static boolean isPalindrome(String word) {

    for (int i = 0; i < word.length()/2; i++) {
      if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
        return false;
      }
    }
    return true;
  }

  public abstract class Shape {

  }

}


