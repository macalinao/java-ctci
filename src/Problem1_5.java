public class Problem1_5 {
  public static void main(String[] args) {
    System.out.println(compress("aabcccccaaa") + " should be a2blc5a3");
    System.out.println(compress("abca") + " should be abca");
  }

  public static String compress(String s) {
    String maybe = compressMaybe(s);
    if (maybe.length() < s.length()) {
      return maybe;
    }
    return s;
  }

  public static String compressMaybe(String s) {
    char[] ca = s.toCharArray();

    StringBuilder ret = new StringBuilder();

    char last = '\0';
    int ct = 0;
    for (char c : ca) {
      if (c == last) {
        ct++;
      } else {
        if (ct > 0) {
          ret.append(last).append(ct);
        }

        last = c;
        ct = 1;
      }
    }

    ret.append(last).append(ct);

    return ret.toString();
  }
}

