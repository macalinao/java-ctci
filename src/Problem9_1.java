class Problem9_1 {
  public static void main(String[] args) {
    System.out.println(ways(4));
  }

  static long[] memo = new long[1000000];
  public static long ways(int n) {
    if (n == 0) return 1;
    if (n < 0) return 0;
    if (memo[n] != 0) return memo[n];
    return memo[n] = ways(n - 1) + ways(n - 2) + ways(n - 3);
  }
}
