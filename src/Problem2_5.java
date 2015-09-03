import java.util.*;

public class Problem2_5 {
  public static void main(String[] args) {
    Node a = makeList(new int[]{ 6, 1, 7 });
    Node b = makeList(new int[]{ 2, 9, 5 });

    printList(a);
    System.out.println("plus");
    printList(b);

    Node result = add(a, b);
    printList(result);
  }

  public static Node add(Node a, Node b) {
    return add(a, b, 0);
  }

  public static Node add(Node a, Node b, int carry) {
    int sum = 0;
    if (a != null && b != null) {
      sum = a.val + b.val + carry;
    } else if (a != null) {
      sum = carry + a.val;
    } else if (b != null) {
      sum = carry + b.val;
    } else {
      return null;
    }
    Node head = new Node(sum % 10);
    head.next = add(a == null ? a : a.next, b == null ? b : b.next, sum / 10);
    return head;
  }

  public static Node makeList(int[] arr) {
    // makes list backwards bc im a lazy pos
    Node head = null;
    for (int i : arr) {
      if (head == null) {
        head = new Node(i);
      } else {
        Node h = new Node(i);
        h.next = head;
        head = h;
      }
    }
    return head;
  }

  public static void printList(Node head) {
    List<Integer> list = new ArrayList<>();
    while (head != null) {
      list.add(head.val);
      head = head.next;
    }
    System.out.println(list);
  }

  static class Node {
    Node next;
    int val;

    public Node(int val) {
      this.val = val;
    }
  }

}
