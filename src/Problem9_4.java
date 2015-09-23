import java.util.*;

public class Problem9_4 {
  public static void main(String[] args) {
    List<Integer> set = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7 ));
    for (List<Integer> subset : subsets(set)) {
      System.out.println(subset);
    }
  }

  public static Set<List<Integer>> subsets(List<Integer> set) {
    Set<List<Integer>> ret = new HashSet<>();
    ret.add(set);

    if (set.size() == 1) {
      return ret;
    }

    for (int i = 0; i < set.size(); i++) {
      List<Integer> wo = new ArrayList<>(set);
      wo.remove(i);
      ret.addAll(subsets(wo));
    }
    return ret;
  }
}
