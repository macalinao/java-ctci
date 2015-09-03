public class Problem3_2 {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(-1);
    stack.push(3);
    stack.push(4);

    System.out.println(stack.min() + " should be -1");

    System.out.println(stack.pop() + " should be 4");
    System.out.println(stack.pop() + " should be 3");
    System.out.println(stack.pop() + " should be -1");

    System.out.println(stack.min() + " should be 1");
  }

  static class Stack<T> {
    Node<T> head = null;
    // stack holding the lowest value in the stack
    Node<Node<T>> min = null;

    public Stack() {
    }

    public void push(T val) {
      if (head == null) {
        head = new Node<>(val);
        min = new Node<>(head);
      } else {
        Node<T> node = new Node<>(val);
        if (((Integer) val) < ((Integer) min.val.val)) {
          Node<Node<T>> nextMin = new Node<>(node);
          nextMin.next = min;
          min = nextMin;
        }
        node.next = head;
        head = node;
      }
    }

    public T pop() {
      if (head == null) {
        throw new IllegalStateException("Stack is empty!");
      }
      if (min.val == head) {
        min = min.next;
      }
      T ret = head.val;
      head = head.next;
      return ret;
    }

    public T min() {
      return min.val.val;
    }
  }

  static class Node<T> {
    T val;
    Node next;

    public Node(T val) {
      this.val = val;
    }
  }
}
