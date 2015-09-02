import java.util.*;

public class Problem2_4 {
  public static void main(String[] args) {
    Node list = makeList(new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 1, 5, 7 });
    printList(list);
    list = partition(list, 4);
    printList(list);
  }

  public static Node partition(Node head, int threshold) {
    Node lt = null, gte = null, ltlast = null;

    while (head != null) {
      Node next = head.next;
      if (head.val >= threshold) {
        head.next = gte;
        gte = head;
      } else {
        head.next = lt;
        lt = head;
        if (lt.next == null) {
          ltlast = lt;
        }
      }
      head = next;
    }

    if (ltlast != null) {
      ltlast.next = gte;
      return lt;
    } else {
      return gte;
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
