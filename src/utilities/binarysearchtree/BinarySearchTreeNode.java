
package utilities.binarysearchtree;

public class BinarySearchTreeNode<E extends Comparable<E>> implements Comparable<BinarySearchTreeNode> {
  private E element;
  private BinarySearchTreeNode parent;
  private BinarySearchTreeNode left;
  private BinarySearchTreeNode right;

  public BinarySearchTreeNode(E element) {
    this.element = element;
    parent = null;
    left = null;
    right = null;
  }

  public E element() {
    return element;
  }

  public BinarySearchTreeNode parent() {
    return parent;
  }

  public BinarySearchTreeNode left() {
    return left;
  }

  public BinarySearchTreeNode right() {
    return right;
  }

  public BinarySearchTreeNode parent(BinarySearchTreeNode parent) {
    this.parent = parent;
    return this;
  }

  public BinarySearchTreeNode left(BinarySearchTreeNode left) {
    this.left = (left == null) ? null : left.parent(this);
    return this;
  }

  public BinarySearchTreeNode right(BinarySearchTreeNode right) {
    this.right = (right == null) ? null : right.parent(this);
    return this;
  }

  public boolean hasParent() {
    return parent != null;
  }

  public boolean hasLeft() {
    return left != null;
  }

  public boolean hasRight() {
    return right != null;
  }

  public boolean isLeft() {
    return hasParent() && equals(parent.left);
  }

  public boolean isRight() {
    return hasParent() && equals(parent.right);
  }

  @Override
  public int compareTo(BinarySearchTreeNode node) {
    return element.compareTo((E) node.element);
  }

  @Override
  public String toString() {
    return element.toString();
  }
}
