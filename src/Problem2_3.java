import java.util.*;

public class Problem2_3 {
  public static void main(String[] args) {
    Node list = makeList(new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 1, 5, 7 });
    printList(list);
    rmList(list.next.next);
    printList(list);
  }

  public static void rmList(Node rem) {
    if (rem.next != null) {
      rem.val = rem.next.val;
      rem.next = rem.next.next;
    } else {
      // impossible
      // Occurs when node is the tail.
      rem.val = -1;
    }
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
