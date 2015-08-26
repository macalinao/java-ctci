public class Problem9_2 {
  public static void main(String[] args) {
    System.out.println(paths(10, 10));
  }

  static int paths(int x, int y) {
    int sum = 0;
    if (x != 0) {
      sum += paths(x - 1, y);
    }
    if (y != 0) {
      sum += paths(x, y - 1);
    }
    if (x == 0 && y == 0) {
      return 1;
    }
    return sum;
  }
}
