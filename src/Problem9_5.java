import java.util.*;

public class Problem9_5 {

  public static void main(String[] args) {
    System.out.println(permutations("abcd"));
  }

  public static List<String> permutations(String s) {
    return permutations("", s);
  }

  public static List<String> permutations(String prefix, String s) {
    List<String> ret = new ArrayList<>();
    if (s.isEmpty()) {
      ret.add(prefix);
      return ret;
    }

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      ret.addAll(
        permutations(prefix + c, s.substring(0, i) + s.substring(i + 1, s.length()))
      );
    }
    return ret;
  }

}
