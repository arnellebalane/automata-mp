
package mp.dfa;

import java.util.ArrayList;
import java.util.Iterator;
import utilities.outputwriter.OutputWriter;

public class ValidatorTester {
  public static void main(String[] args) {
    ArrayList inputContents = InputReader.read("inputs/mp/dfa/input.in");
    inputContents.remove(0);

    OutputWriter writer = new OutputWriter("outputs/mp/dfa/mp4.out");
    Iterator iterator = inputContents.iterator();
    while (iterator.hasNext()) {
      Validator validator = new Validator();
      String input = (String) iterator.next();
      boolean valid = validator.validate(input);
      writer.write((valid) ? "ACCEPTED" : "DENIED");
    }
  }
}
