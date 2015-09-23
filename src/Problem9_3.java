public class Problem9_3 {
  public static void main(String[] args) {
    int[] test = new int[]{ -40, -20, -10, 0, 1, 4, 5, 6, 8, 10 };

    System.out.println(findMagicIndex(test));
    System.out.println(findMagicIndexFast(test));
  }

  public static int findMagicIndex(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == i) return i;
    }
    return -1;
  }

  public static int findMagicIndexFast(int[] arr) {
    return findMagicIndexFast(arr, 0, arr.length - 1);
  }

  public static int findMagicIndexFast(int[] arr, int lo, int hi) {
    if (hi <= lo) return -1;
    int mid = (hi + lo) / 2;
    if (arr[mid] == mid) return mid;
    if (arr[mid] < mid) {
      return findMagicIndexFast(arr, mid + 1, hi);
    } else {
      return findMagicIndexFast(arr, lo, mid - 1);
    }
  }

}
