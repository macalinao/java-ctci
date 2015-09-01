import java.util.*;

public class Problem1_1 {
  public static void main(String[] args) {
    System.out.println(isUniqueChars("test") + " should be false");
    System.out.println(isUniqueChars("tesla") + " should be true");
  }

  public static boolean isUniqueChars(String str) {
    char[] chars = str.toCharArray();
    Arrays.sort(chars);
    for (int i = 0; i < chars.length - 1; i++) {
      if (chars[i] == chars[i + 1]) return false;
    }
    return true;
  }
}
