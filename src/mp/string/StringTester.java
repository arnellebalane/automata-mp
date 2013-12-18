
package mp.string;

import utilities.inputreader.InputReader;
import utilities.nodelist.NodeList;

public class StringTester {
  public static void main(String[] args) {
    NodeList contents = InputReader.read("inputs/mp/string/input.in");

    int alphabetsCount = Integer.parseInt((String) contents.retrieve(0));
    Alphabet[] alphabets = new Alphabet[alphabetsCount];
    for (int i = 0; i < alphabetsCount; i++) {
      String[] symbols = ((String) contents.retrieve(i + 1)).split(" ");
      alphabets[i] = new Alphabet(symbols);
      System.out.println(alphabets[i]);
    }
  }
}
