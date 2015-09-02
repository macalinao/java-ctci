import java.util.*;

public class Problem2_2 {
  public static void main(String[] args) {
    Node list = makeList(new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 1, 5, 7 });
    printList(list);
    printList(rmKthToLast(list, 4));
  }

  public static Node rmKthToLast(Node node, int k) {
    return remove(node, size(node) - k - 1);
  }

  public static Node remove(Node node, int index) {
    if (index == 0) {
      return node.next;
    }
    node.next = remove(node.next, index - 1);
    return node;
  }

  public static int size(Node node) {
    int ct = 1;
    while (node.next != null) {
      ct++;
      node = node.next;
    }
    return ct;
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
