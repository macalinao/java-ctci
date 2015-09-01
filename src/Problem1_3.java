import java.util.*;

public class Problem1_3 {
  public static void main(String[] args) {
    System.out.println(isPermutation("test", "test") + " should be true");
    System.out.println(isPermutation("testa", "atest") + " should be true");
    System.out.println(isPermutation("testa", "ateet") + " should be false");
  }

  public static boolean isPermutation(String a, String b) {
    char[] aa = a.toCharArray();
    Arrays.sort(aa);

    char[] ba = b.toCharArray();
    Arrays.sort(ba);

    return String.valueOf(aa).equals(String.valueOf(ba));
  }
}
