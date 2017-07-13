import java.util.*;
import java.io.*;

public class BinarySearch {

  public static int binarySearch(int arr[], int start, int end, int numToFind) {

   if (start <= end) {
     int mid = (start + end)/2;
     if (arr[mid] == numToFind) {
       return mid;
     } else if (arr[mid] > numToFind) {
       return binarySearch(arr, start, mid - 1, numToFind);
     } else {
       return binarySearch(arr, mid + 1, end, numToFind);
     }
   }
     return -1;
  }

  public static void main (String args[]) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Scanner in = new Scanner(System.in);
    while(true) {
      int numToFind = in.nextInt();
      if (numToFind < 0) {
        return;
      }
      int indexOfNumFound = binarySearch(arr, 0, 9, numToFind);
      if (indexOfNumFound < 0) {
        System.out.println("Number: " + numToFind + " not found in the array." );
      } else {
        System.out.println("Number: " + numToFind + " found at index: " + indexOfNumFound);
      }
    }
  }
}
