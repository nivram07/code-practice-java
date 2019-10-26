package sort;

public class SelectionSort {

  public static void sortAscending(int[] items) {
    int temp, minIndex;
    for (int i = 0; i < items.length - 1; i++) {
      minIndex = i;
      for (int j = i + 1; j < items.length; j++) {
        if (items[minIndex] > items[j]) {
          minIndex = j;
        }
        temp = items[i];
        items[i] = items[minIndex];
        items[minIndex] = temp;
      }
    }
  }
}
