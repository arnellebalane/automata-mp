
package mp.dfa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class InputReader {
  public static ArrayList read(String path) {
    ArrayList contents = new ArrayList();
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      String line = reader.readLine();
      while (line != null) {
        contents.add(line);
        line = reader.readLine();
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return contents;
  }
}
