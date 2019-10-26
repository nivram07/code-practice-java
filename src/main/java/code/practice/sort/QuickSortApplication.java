package code.practice.sort;

public class QuickSortApplication {

  public static void quickSort(int arr[], int start, int end) {
    if (start < end) {
      int partitionIndex = partition(arr, start, end);
      quickSort(arr, start, partitionIndex-1);
      quickSort(arr, partitionIndex+1, end);
    }
  }

  public static int partition(int arr[], int start, int end) {
    int pivot = arr[end];
    int wallIndex = start;
    for (int currentIndex = start; currentIndex < end; currentIndex++) {
      if (arr[currentIndex] <= pivot) {
        int temp = arr[currentIndex];
        arr[currentIndex] = arr[wallIndex];
        arr[wallIndex] = temp;
        wallIndex++;
      }
    }
    int temp = arr[wallIndex];
    arr[wallIndex] = arr[end];
    arr[end] = temp;
    return wallIndex;
  }

  public static void main(String args[]) {
    System.out.println("Hello World!");
    int testArray[] = {5, 8, 7, 2, 1, 4, 6, 9, 3, 0};
    quickSort(testArray, 0, testArray.length - 1);
    for (int i = 0; i < testArray.length; i++) {
      System.out.print(testArray[i] + " ");
    }
  }
}
