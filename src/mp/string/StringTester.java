
package mp.string;

import utilities.inputreader.InputReader;
import utilities.nodelist.NodeList;

public class StringTester {
  public static void main(String[] args) {
    NodeList contents = InputReader.read("inputs/mp/string/input.in");

    int n = Integer.parseInt((String) contents.retrieve(0));
    Alphabet[] alphabets = new Alphabet[n];
    for (int x = 0; x < n; x++) {
      String[] symbols = ((String) contents.retrieve(x + 1)).split(" ");
      alphabets[x] = new Alphabet(symbols);
    }

    int m = Integer.parseInt((String) contents.retrieve(n + 1));
    for (int x = n + 2, y = 0; x < n + 2 + n * m; x++) {
      String str = (String) contents.retrieve(x);
      System.out.println(alphabets[y].forms(str));
      if ((x - (n + 2)) % m == m - 1) {
        y++;
      }
    }
  }
}
