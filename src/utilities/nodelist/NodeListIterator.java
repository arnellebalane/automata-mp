
package utilities.nodelist;

import java.util.Iterator;

public class NodeListIterator implements Iterator {
  private NodeList list;
  private Node head;

  public NodeListIterator(NodeList list) {
    this.list = list;
    head = list.head();
  }

  @Override
  public boolean hasNext() {
    return head.hasNext();
  }

  @Override
  public Node next() {
    if (head.hasNext()) {
      head = head.next();
      return head;
    }
    return null;
  }

  @Override
  public void remove() {
    if (!list.empty()) {
      Node temp = head;
      head = head.previous();
      list.remove(temp);
    }
  }
}
