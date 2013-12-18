
package utilities.binarysearchtree;

public class BinarySearchTree<E extends Comparable<E>> {
  private BinarySearchTreeNode root;

  public BinarySearchTree() {
    root = null;
  }

  public BinarySearchTree(BinarySearchTreeNode root) {
    this.root = root;
  }

  public BinarySearchTree insert(E element) {
    BinarySearchTreeNode insertedNode = new BinarySearchTreeNode(element);
    BinarySearchTreeNode node = find(element);
    if (node == null) {
      root = insertedNode;
    } else if (insertedNode.compareTo(node) < 0) {
      node.left(insertedNode);
    } else if (insertedNode.compareTo(node) > 0) {
      node.right(insertedNode);
    }
    return this;
  }

  public BinarySearchTree remove(E element) {
    BinarySearchTreeNode node = find(element);
    if (node != null && element.compareTo((E) node.element()) == 0) {
      if (node.hasRight()) {
        BinarySearchTreeNode replacement = findMinimum(node.right());
        if (replacement.isLeft()) {
          replacement.parent().left(replacement.right());
          replacement.right(node.right());
        }
        if (node.isLeft()) {
          node.parent().left(replacement);
        } else if (node.isRight()) {
          node.parent().right(replacement);
        }
        replacement.left(node.left());
        root = (node.equals(root)) ? replacement : root;
      } else if (node.hasLeft()) {
        BinarySearchTreeNode replacement = findMaximum(node.left());
        if (replacement.isRight()) {
          replacement.parent().right(replacement.left());
          replacement.left(node.left());
        }
        if (node.isLeft()) {
          node.parent().left(replacement);
        } else if (node.isRight()) {
          node.parent().right(replacement);
        }
        replacement.right(node.right());
        root = (node.equals(root)) ? replacement : root;
      } else {
        if (node.isLeft()) {
          node.parent().left(null);
        } else if (node.isRight()) {
          node.parent().right(null);
        } else {
          root = null;
        }
      }
    }
    return this;
  }

  public boolean contains(E element) {
    BinarySearchTreeNode node = find(element);
    return node != null && element.compareTo((E) node.element()) == 0;
  }

  public E[] elements() {
    return toArray(root);
  }

  public int size() {
    return count(root);
  }

  private BinarySearchTreeNode find(E element) {
    BinarySearchTreeNode node = root;
    BinarySearchTreeNode parentNode = null;
    while (node != null) {
      parentNode = node;
      if (element.compareTo((E) node.element()) < 0) {
        node = node.left();
      } else if (element.compareTo((E) node.element()) > 0) {
        node = node.right();
      } else {
        return node;
      }
    }
    return parentNode;
  }

  private int count(BinarySearchTreeNode node) {
    return (node == null) ? 0 : 1 + count(node.left()) + count(node.right());
  }

  private BinarySearchTreeNode findMinimum(BinarySearchTreeNode node) {
    while (node != null && node.left() != null) {
      node = node.left();
    }
    return node;
  }

  private BinarySearchTreeNode findMaximum(BinarySearchTreeNode node) {
    while (node != null && node.right() != null) {
      node = node.right();
    }
    return node;
  }

  private E[] toArray(BinarySearchTreeNode node) {
    E[] nodes = (E[]) new Comparable[count(node)];
    if (node != null) {
      E[] leftNodes = toArray(node.left());
      E[] rightNodes = toArray(node.right());
      nodes[leftNodes.length] = (E) node.element();
      System.arraycopy(leftNodes, 0, nodes, 0, leftNodes.length);
      System.arraycopy(rightNodes, 0, nodes, leftNodes.length + 1, rightNodes.length);
    }
    return nodes;
  }

  @Override
  public String toString() {
    String str = "[";
    E[] elements = elements();
    for (int i = 0; i < elements.length; i++) {
      str += elements[i];
      if (i < elements.length - 1) {
        str += ", ";
      }
    }
    return str + "]";
  }
}
