
package mp.dfa;

import java.util.ArrayList;
import java.util.Iterator;

public class ValidatorTester {
  public static void main(String[] args) {
    ArrayList inputContents = InputReader.read("inputs/mp/dfa/input.in");
    ArrayList inputs = new ArrayList();

    Iterator iterator = inputContents.iterator();
    while (iterator.hasNext()) {
      Validator validator = new Validator();
      String input = (String) iterator.next();
      boolean valid = validator.validate(input);
      System.out.println(input + " : " + ((valid) ? "ACCEPTED" : "DENIED"));
    }
  }
}
