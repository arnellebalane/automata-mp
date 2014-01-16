
package mp.language;

import java.util.Iterator;
import utilities.inputreader.InputReader;
import utilities.nodelist.Node;
import utilities.nodelist.NodeList;
import utilities.outputwriter.OutputWriter;

public class DeclarationTester {
  public static void main(String[] args) {
    NodeList declarations = InputReader.read("inputs/mp/language/mp3.in");
    OutputWriter output = new OutputWriter("outputs/mp/language/mp3.out");

    Iterator iterator = declarations.iterator();
    while (iterator.hasNext()) {
      Declaration declaration = new Declaration(((Node) iterator.next()).toString());
      output.write((declaration.valid()) ? "valid" : "invalid");
    }
  }
}
