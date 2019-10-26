package code.practice.java.search;

public class BinarySearch {


  /**
   * Returns the position of the item when found in the items.
   * @param items array of sorted items to be searched
   * @param itemToSearch item to code.practice.java.search
   * @return the position of the item if found, <@code>null</@code> if not found
   */
  public static Integer search(int[] items, int itemToSearch) {
    return searchItem(items, itemToSearch, 0, items.length - 1);
  }



  private static Integer searchItem(int[] items, int itemToSearch, int start, int end) {
    int mid = (start + end)/2;
    if (start <= end) {
      if (items[mid] == itemToSearch) {
        return mid;
      } else if (items[mid] > itemToSearch) {
        return searchItem(items, itemToSearch, start, mid - 1);
      } else {
        return searchItem(items, itemToSearch, mid + 1, end);
      }
    }
    return null;
  }
}
