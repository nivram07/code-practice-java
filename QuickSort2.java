import java.lang.Math.*;
import java.util.*;

public class QuickSort2 {

  public static void quickSort(int arr[], int startIndex, int endIndex) {

    if (startIndex < endIndex) {
      int pivot = partition(arr, startIndex, endIndex);
      quickSort(arr, startIndex, pivot - 1);
      quickSort(arr, pivot + 1, endIndex);
    }
  }

  public static int partition(int arr[], int startIndex, int endIndex ) {
    int pivot = arr[endIndex];
    int wallIndex = startIndex;

    for (int i = startIndex; i < endIndex; i++) {
      if (arr[i] <= pivot) {
        int temp = arr[wallIndex];
        arr[wallIndex] = arr[i];
        arr[i] = temp;
        wallIndex++;
      }
    }
    int temp = arr[wallIndex];
    arr[wallIndex] = pivot;
    arr[endIndex] = temp;
    return wallIndex;
  }

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String args[]) {
    //int arr[] = {7, 8, 9, 2, 1, 6, 3, 5, 4, 0};
    Scanner in = new Scanner(System.in);
    System.out.print("Enter array size: ");
    int arrSize = in.nextInt();
    in.close();
    int arr[] = new int[arrSize];
    Random ran = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = ran.nextInt(arrSize);
    }
    System.out.println("Before sorting: ");
    printArray(arr);
    quickSort(arr, 0, arr.length - 1);
    System.out.println("After sorting: ");
    printArray(arr);

  }

}
