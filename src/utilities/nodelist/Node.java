
package utilities.nodelist;

public class Node<E> {
  private E element;
  private Node previous;
  private Node next;

  public Node(E element) {
    this.element = element;
    this.previous = null;
    this.next = null;
  }

  public Node(E element, Node previous, Node next) {
    this.element = element;
    this.previous = previous;
    this.next = next;
  }

  public E element() {
    return element;
  }

  public Node previous() {
    return previous;
  }

  public Node next() {
    return next;
  }

  public Node previous(Node previous) {
    this.previous = previous;
    return this;
  }

  public Node next(Node next) {
    this.next = next;
    return this;
  }

  public boolean hasPrevious() {
    return previous != null;
  }

  public boolean hasNext() {
    return next != null;
  }

  @Override
  public String toString() {
    return element.toString();
  }
}
