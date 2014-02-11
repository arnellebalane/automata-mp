
package mp.dfa;

import java.util.ArrayList;
import java.util.Iterator;

public class ValidatorTester {
  public static void main(String[] args) {
    ArrayList inputContents = InputReader.read("inputs/mp/dfa/input.in");
    ArrayList inputs = new ArrayList();

    Iterator iterator = inputContents.iterator();
    while (iterator.hasNext()) {
      String input = (String) iterator.next();
      ArrayList tokens = Tokenizer.tokenize(input);
      inputs.add(tokens);
    }
  }
}
