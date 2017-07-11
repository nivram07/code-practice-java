public class MergeSortApplication {

  public static void mergeSort(int arr[]) {
    int mid = arr.length/2;
    int leftArr[] = new int[mid];
    int rightArr[] = new int[arr.length-mid];
    if (arr.length < 2) {
      return;
    }
    for (int i = 0; i < mid; i++) {
      leftArr[i] = arr[i];
    }
    for (int i = 0; i < arr.length - mid; i++) {
      rightArr[i] = arr[i + mid];
    }
    mergeSort(leftArr);
    mergeSort(rightArr);
    merge(leftArr, rightArr, arr);
  }

  public static void merge(int leftArr[], int rightArr[], int parentArr[]) {
    int leftIndex = 0;
    int rightIndex = 0;
    int parentIndex = 0;
    while(leftIndex < leftArr.length && rightIndex < rightArr.length) {
      if (leftArr[leftIndex] <= rightArr[rightIndex]) {
        parentArr[parentIndex] = leftArr[leftIndex];
        leftIndex++;
      } else {
        parentArr[parentIndex] = rightArr[rightIndex];
        rightIndex++;
      }
      parentIndex++;
    }
    while (leftIndex < leftArr.length) {
      parentArr[parentIndex] = leftArr[leftIndex];
      leftIndex++;
      parentIndex++;
    }
    while (rightIndex < rightArr.length) {
      parentArr[parentIndex] = rightArr[rightIndex];
      rightIndex++;
      parentIndex++;
    }
  }

  public static void main (String args[]) {
    System.out.println("Hello World!");
    int testArray[] = {5, 8, 7, 2, 1, 4, 6, 9, 3, 0};
    mergeSort(testArray);
    for (int i = 0; i < testArray.length; i++) {
      System.out.print(testArray[i] + " ");
    }
  }
}
