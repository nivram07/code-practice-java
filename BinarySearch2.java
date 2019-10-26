public class BinarySearch2 {

    public static void main(String args[]) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int foundIndex = search(arr, 0, arr.length - 1, 4);

        System.out.println("Number found at index: " + foundIndex);

        System.out.println("Number fround at index: " + search(arr, 0, arr.length - 1, 12));

        System.out.println("Number fround at index: " + search(arr, 0, arr.length - 1, 16));

        System.out.println("Number fround at index: " + search(arr, 0, arr.length - 1, -1));

    }

    public static int search(int arr[], int start, int end, int numToFind) {

        if (start <= end) {
            int midIndex = (start + end)/2;
            if (arr[midIndex] == numToFind) {
                return midIndex;
            } else if (arr[midIndex] > numToFind) {
                return search(arr, start, midIndex - 1, numToFind);
            } else {
                return search(arr, midIndex + 1, end, numToFind);
            }
        }
        return -1;
    }
}
