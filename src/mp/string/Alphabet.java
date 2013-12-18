
package mp.string;

import mp.set.Set;
import utilities.nodelist.NodeList;

public class Alphabet {
  private Set symbols;

  public Alphabet(String[] symbols) {
    this.symbols = new Set(symbols);
  }

  public boolean forms(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (!symbols.contains("" + str.charAt(i))) {
        return false;
      }
    }
    return true;
  }

  public NodeList generateUptoLength(int length) {
    NodeList strings = new NodeList();
    strings.insert("");
    for (int i = 1; i <= length; i++) {
      NodeList list = generateOfLength(i);
      for (int j = 0; j < list.size(); j++) {
        strings.insert(list.retrieve(j));
      }
    }
    return strings;
  }

  public NodeList generateOfLength(int length) {
    Comparable[] elements = symbols.elements();
    NodeList strings = new NodeList();
    int[] indeces = new int[length];
    for (int i = 0; i < indeces.length; i++) {
      indeces[i] = 0;
    }
    boolean done = false;
    while (!done) {
      String str = "";
      for (int i = 0; i < indeces.length; i++) {
        str += elements[indeces[i]];
      }
      strings.insert(str);
      indeces[indeces.length - 1]++;
      for (int i = indeces.length - 1; i >= 0; i--) {
        if (indeces[i] == elements.length) {
          indeces[i] = 0;
          if (i > 0) {
            indeces[i - 1]++;
          }
        } else {
          break;
        }
      }
      done = true;
      for (int i = 0; i < indeces.length; i++) {
        if (indeces[i] > 0) {
          done = false;
        }
      }
    }
    return strings;
  }

  @Override
  public String toString() {
    return symbols.toString();
  }
}
