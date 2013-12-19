
package mp.string;

import utilities.inputreader.InputReader;
import utilities.nodelist.NodeList;
import utilities.outputwriter.OutputWriter;

public class StringTester {
  public static void main(String[] args) {
    NodeList contents = InputReader.read("inputs/mp/string/mp2.in");
    OutputWriter output = new OutputWriter("outputs/mp/string/mp2.out");

    int n = Integer.parseInt((String) contents.retrieve(0));
    Alphabet[] alphabets = new Alphabet[n];
    for (int x = 0; x < n; x++) {
      String[] symbols = ((String) contents.retrieve(x + 1)).split(" ");
      alphabets[x] = new Alphabet(symbols);
    }

    int m = Integer.parseInt((String) contents.retrieve(n + 1));
    for (int x = n + 2, y = 0; x < n + n * m + 2; x++) {
      String str = (String) contents.retrieve(x);
      output.write((alphabets[y].forms(str)) ? "true" : "false");
      if ((x - (n + 2)) % m == m - 1) {
        y++;
      }
    }

    int i = Integer.parseInt((String) contents.retrieve(n + n * m + 2));
    for (int x = n + n * m + 3, y = 0; y < i; y++) {
      String[] pair = ((String) contents.retrieve(x + y)).split(" ");
      output.write((pair[0].indexOf(pair[1]) >= 0) ? "true" : "false");
    }

    int j = Integer.parseInt((String) contents.retrieve(n + n * m + i + 3));
    for (int x = n + n * m + i + 4, y = 0; y < j; y++) {
      String[] pair = ((String) contents.retrieve(x + y)).split(" ");
      int occurence = 0;
      String indeces = "";
      int offset = 0;
      int index = pair[0].indexOf(pair[1]);
      while (index >= 0) {
        occurence++;
        indeces += (index + offset) + " ";
        pair[0] = pair[0].substring(index + 1);
        offset += index + 1;
        index = pair[0].indexOf(pair[1]);
      }
      output.write("" + occurence);
      if (indeces.length() > 0) {
        String[] indexArray = indeces.split(" ");
        for (int z = 0; z < indexArray.length; z++) {
          output.write(indexArray[z]);
        }
      }
    }

    int k = Integer.parseInt((String) contents.retrieve(n + n * m + i + j + 4));
    for (int x = n + n * m + i + j + 5, y = 0; y < k; y++) {
      String[] line = ((String) contents.retrieve(x + y)).split(" ");
      String str = line[1];
      if (line[0].equals("2")) {
        str = line[1] + line[2];
      }
      String reversed = "";
      for (int z = str.length() - 1; z >= 0; z--) {
        reversed += str.charAt(z);
      }
      output.write(reversed);
    }

    int l = Integer.parseInt((String) contents.retrieve(n + n * m + i + j + k + 5));
    for (int x = n + n * m + i + j + k + 6, y = 0; x < n + n * m + i + j + k + n * l + 6; x++) {
      int length = Integer.parseInt((String) contents.retrieve(x));
      alphabets[y].generateUptoLength(length, output);
      if (x - (n + n * m + i + j + k + 6) % l == l - 1) {
        y++;
      }
    }
  }
}
