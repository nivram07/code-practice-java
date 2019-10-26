import java.util.Arrays;

public class QuickSort4 {


    public static void main(String arg[]) {

        int[] unsortedArray = {7, 5, 2, 3, 6, 10, 9, 8, 1, 4};
        quickSort(unsortedArray, 0, unsortedArray.length - 1);
        System.out.println(Arrays.toString(unsortedArray));
    }

   public static void quickSort(int[] arr, int firstIndex, int lastIndex) {
        if (firstIndex < lastIndex) {
           int partitionIndex = partition(arr, firstIndex, lastIndex);
          quickSort(arr, firstIndex, partitionIndex - 1);
          quickSort(arr, partitionIndex + 1, lastIndex);

        }
   }

   public static int partition(int[] arr, int firstIndex, int lastIndex) {
        int wallIndex = firstIndex;
        int pivot = arr[lastIndex];

        for (int currentIndex = firstIndex; currentIndex < lastIndex; currentIndex++) {
            // [0] | [1] [2] [3]
            if (arr[currentIndex] <= pivot) {
                int temp = arr[currentIndex];
                arr[currentIndex] = arr[wallIndex];
                arr[wallIndex] = temp;
                wallIndex++;
            }
        }
        int temp = arr[wallIndex];
        arr[wallIndex] = arr[lastIndex];
        arr[lastIndex] = temp;

        return wallIndex;
   }


}
