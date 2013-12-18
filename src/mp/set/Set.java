
package mp.set;

import utilities.binarysearchtree.BinarySearchTree;

public class Set<E extends Comparable<E>> implements Comparable<Set> {
  private BinarySearchTree set;
  private double uniqueId;

  public Set() {
    set = new BinarySearchTree();
    uniqueId = Math.random();
  }

  public Set(E[] elements) {
    this();
    for (int i = 0; i < elements.length; i++) {
      set.insert(elements[i]);
    }
  }

  public Set insert(E element) {
    set.insert(element);
    return this;
  }

  public Set insert(E[] elements) {
    for (int i = 0; i < elements.length; i++) {
      insert(elements[i]);
    }
    return this;
  }

  public Set remove(E element) {
    set.remove(element);
    return this;
  }

  public E[] elements() {
    return (E[]) set.elements();
  }

  public int size() {
    return set.size();
  }

  public boolean contains(E element) {
    return set.contains(element);
  }

  public Set union(Set anotherSet) {
    Set union = new Set(elements());
    return union.insert(anotherSet.elements());
  }

  public Set intersection(Set anotherSet) {
    Set intersection = new Set();
    E[] elements = elements();
    for (int i = 0; i < elements.length; i++) {
      if (anotherSet.contains(elements[i])) {
        intersection.insert(elements[i]);
      }
    }
    return intersection;
  }

  public Set difference(Set anotherSet) {
    Set difference = new Set();
    E[] elements = elements();
    for (int i = 0; i < elements.length; i++) {
      if (!anotherSet.contains(elements[i])) {
        difference.insert(elements[i]);
      }
    }
    return difference;
  }

  public Set powerSet() {
    Set powerSet = new Set();
    E[] elements = elements();
    powerSet.insert(new Set());
    for (int setSize = 1; setSize < elements.length; setSize++) {
      int[] indeces = new int[setSize];
      for (int i = 0; i < indeces.length; i++) {
        indeces[i] = i;
      }
      boolean doneCombining = false;
      while (!doneCombining) {
        E[] combination = (E[]) new Comparable[setSize];
        for (int i = 0; i < indeces.length; i++) {
          combination[i] = elements[indeces[i]];
        }
        powerSet.insert(new Set(combination));
        doneCombining = true;
        for (int i = indeces.length - 1; i >= 0 && doneCombining; i--) {
          if (indeces[i] - (elements.length - (setSize - i)) != 0) {
            doneCombining = false;
          }
        }
        int i = setSize - 1;
        while (i >= 0) {
          indeces[i]++;
          for (int a = i + 1; a < setSize; a++) {
            indeces[a] = indeces[a - 1] + 1;
          }
          if (indeces[i] % (elements.length - (setSize - (i + 1))) == 0) {
            i--;
          } else {
            break;
          }
        }
      }
    }
    powerSet.insert(new Set(elements));
    return powerSet;
  }

  @Override
  public int compareTo(Set set) {
    if (uniqueId < set.uniqueId) {
      return -1;
    } else if (uniqueId > set.uniqueId) {
      return 1;
    }
    return 0;
  }

  @Override
  public String toString() {
    return set.toString();
  }

  public String display() {
    String str = "";
    E[] elements = elements();
    for (int i = 0; i < elements.length; i++) {
      str += elements[i] + "\n";
    }
    return str;
  }
}
