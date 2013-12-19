
package mp.string;

import mp.set.Set;
import utilities.outputwriter.OutputWriter;

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

  public void generateUptoLength(int length, OutputWriter output) {
    Comparable[] elements = symbols.elements();
    for (int i = 0; i <= length; i++) {
      generateOfLength(i, "", elements, output);
    }
  }

  public void generateOfLength(int length, String word, Comparable[] elements, OutputWriter output) {
    if (word.length() == length) {
      output.write(word);
    } else {
      for (int i = 0; i < elements.length; i++) {
        generateOfLength(length, word + elements[i], elements, output);
      }
    }
  }

  @Override
  public String toString() {
    return symbols.toString();
  }
}
