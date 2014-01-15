
package utilities.nodelist;

import java.util.Iterator;

public class NodeList<E> implements Iterable {
  private Node head;
  private Node tail;
  private int size;

  public NodeList() {
    head = null;
    tail = null;
    size = 0;
  }

  public NodeList insert(E element) {
    Node node = new Node(element);
    if (empty()) {
      head = node;
      tail = node;
    } else {
      tail.next(node.previous(tail));
      tail = node;
    }
    size++;
    return this;
  }

  public NodeList remove(int index) {
    if (index < size) {
      int i = 0;
      Node node = head;
      while (i < index) {
        node = node.next();
      }
      if (node != head && node != tail) {
        node.next().previous(node.previous());
        node.previous().next(node.next());
      } else {
        if (node == head) {
          head = node.next();
          if (head != null) {
            head.previous(null);
          }
        }
        if (node == tail) {
          tail = node.previous();
          if (tail != null) {
            tail.next(null);
          }
        }
      }
      node.previous(null).next(null);
      size--;
    }
    return this;
  }

  public NodeList remove(E element) {
    Node node = head;
    while (node != null && !node.element().equals(element)) {
      node = node.next();
    }
    if (node != null) {
      if (node != head && node != tail) {
        node.next().previous(node.previous());
        node.previous().next(node.next());
      } else {
        if (node == head) {
          head = node.next();
          if (head != null) {
            head.previous(null);
          }
        }
        if (node == tail) {
          tail = node.previous();
          if (tail != null) {
            tail.next(null);
          }
        }
      }
      node.previous(null).next(null);
      size--;
    }
    return this;
  }

  public E retrieve(int index) {
    if (index < size) {
      Node node = head;
      int i = 0;
      while (i++ < index) {
        node = node.next();
      }
      return (E) node.element();
    }
    return null;
  }

  public boolean contains(E element) {
    Node node = head;
    while (node != null && !node.element().equals(element)) {
      node = node.next();
    }
    return node != null;
  }

  public int size() {
    return size;
  }

  public boolean empty() {
    return size == 0;
  }

  public Node head() {
    return head;
  }

  public Node tail() {
    return tail;
  }

  @Override
  public Iterator iterator() {
    return new NodeListIterator(this);
  }

  @Override
  public String toString() {
    String str = "[";
    Node node = head;
    while (node != null) {
      str += node.element();
      if (node != tail) {
        str += ", ";
      }
      node = node.next();
    }
    return str + "]";
  }
}
