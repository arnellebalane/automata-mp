
package mp.string;

import mp.set.Set;

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

  @Override
  public String toString() {
    return symbols.toString();
  }
}
