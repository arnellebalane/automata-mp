
package mp.string;

import mp.set.Set;

public class Alphabet {
  private Set symbols;

  public Alphabet() {
    symbols = new Set();
  }

  public Alphabet(String[] symbols) {
    this.symbols = new Set(symbols);
  }

  @Override
  public String toString() {
    return symbols.toString();
  }
}
