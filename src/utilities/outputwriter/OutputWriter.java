
package utilities.outputwriter;

import java.io.File;
import java.io.FileWriter;

public class OutputWriter {
  private File output;

  public OutputWriter(String path) {
    try {
      output = new File(path);
      output.createNewFile();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public void write(String line) {
    try {
      FileWriter writer = new FileWriter(output, true);
      writer.write(line + "\n");
      writer.flush();
      writer.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
