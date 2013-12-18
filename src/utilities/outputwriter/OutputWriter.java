
package utilities.outputwriter;

import java.io.File;
import java.io.FileWriter;

public class OutputWriter {
  private FileWriter writer;

  public OutputWriter(String path) {
    try {
      File output = new File(path);
      output.createNewFile();
      writer = new FileWriter(output, true);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public void write(String line) {
    try {
      writer.write(line);
      writer.flush();
      writer.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
