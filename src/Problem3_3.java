import java.util.*;

public class Problem3_3 {

  public static void main(String[] args) {
    SetOfStacks<Integer> stack = new SetOfStacks<>(5);

    for (int i = 0; i < 40; i++) {
      stack.push(i);
    }

    for (int i = 39; i >= 0; i--) {
      System.out.println(stack.pop() + " should be " + i);
    }
  }

  static class SetOfStacks<T> {
    LinkedList<LinkedList<T>> stacks = new LinkedList<>();
    int cap;

    public SetOfStacks(int cap) {
      this.cap = cap;
    }

    public T pop() {
      LinkedList<T> top = stacks.peek();
      if (top == null) {
        throw new IllegalStateException("Nothing left!");
      }
      T ret = top.pop();
      if (top.peek() == null) {
        stacks.pop();
      }
      return ret;
    }

    public void push(T val) {
      LinkedList<T> top = stacks.peek();
      if (top == null || top.size() >= cap) {
        top = new LinkedList<>();
        stacks.push(top);
      }
      top.push(val);
    }

  }

}
