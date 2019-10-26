package code.practice.java.search;

public class BinarySearchMain {

  public static void main(String[] args) {

    int[] items = {1, 2, 3, 5};

    System.out.println("Find 4 in items: " + BinarySearch.search(items, 4));
    System.out.println("Find 1 in items: " + BinarySearch.search(items, 1));
    System.out.println("Find 1 in items: " + BinarySearch.search(items, 5));
  }
}
