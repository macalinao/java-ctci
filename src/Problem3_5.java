import java.util.*;

public class Problem3_5 {
  public static void main(String[] args) {
    MyQueue<Integer> q = new MyQueue<>();
    for (int i = 0; i < 5; i++) q.add(i);
    for (int i = 0; i < 5; i++) System.out.println(q.poll() + " should be " + i);
  }

  public static class MyQueue<T> {
    private LinkedList<T> a = new LinkedList<>();
    private LinkedList<T> b = new LinkedList<>();

    public T poll() {
      while (!a.isEmpty()) b.push(a.pop());
      T ret = b.pop();
      while (!b.isEmpty()) a.push(b.pop());
      return ret;
    }

    public void add(T val) {
      a.push(val);
    }
  }
}
