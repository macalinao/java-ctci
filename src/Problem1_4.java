public class Problem1_4 {
  public static void main(String[] args) {
    System.out.println(replaceSpaces("The quick brown fox       ") + " should be fine");
    System.out.println(replaceSpaces("Thequickbrownfox       ") + " should be fine");
  }

  public static String replaceSpaces(String s) {
    char[] sa = s.toCharArray();

    // find non-trailing spaces
    int lastNonSpace = sa.length - 1;
    while (sa[lastNonSpace] == ' ') {
      lastNonSpace--;
    }

    int spaceCt = 0;
    for (int i = lastNonSpace; i >= 0; i--) {
      if (sa[i] == ' ') spaceCt++;
    }

    // multiply by 2 -- offset to right
    int offset = spaceCt * 2;

    // iterate backwards and fill the gaps
    int curPos = lastNonSpace + offset;
    for (int i = lastNonSpace; i >= 0; i--) {
      if (sa[i] != ' ') {
        sa[curPos] = sa[i];
      } else {
        sa[curPos] = '0';
        curPos--;
        sa[curPos] = '2';
        curPos--;
        sa[curPos] = '%';
      }
      curPos--;
    }

    return String.valueOf(sa);
  }
}
