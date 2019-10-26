package src.main.java.code.practice.java.sort;

import java.util.Arrays;

public class SelectionSortMain {

  public static void main(String[] args) {

    int[] arr1 = {5, 4, 3, 2, 1};

    SelectionSort.sortAscending(arr1);

    System.out.println("arr1: " + Arrays.toString(arr1));
  }
}
