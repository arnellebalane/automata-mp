
package utilities.inputreader;

import java.io.BufferedReader;
import java.io.FileReader;
import utilities.nodelist.NodeList;

public class InputReader {
  public static NodeList read(String path) {
    NodeList contents = new NodeList();
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      String line = reader.readLine();
      while (line != null) {
        contents.insert(line);
        line = reader.readLine();
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return contents;
  }
}
