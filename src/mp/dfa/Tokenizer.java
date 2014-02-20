
package mp.dfa;

import java.util.ArrayList;

public class Tokenizer {
  public static ArrayList tokenize(String input, String delimeters) {
    ArrayList tokens = new ArrayList();
    for (int i = 0; i < input.length(); i++) {
      String content = "" + input.charAt(i);
      if (delimeters.indexOf(content) < 0) {
        content = "";
        while (i < input.length() && delimeters.indexOf(input.charAt(i)) < 0) {
          content += input.charAt(i++);
        }
        i--;
      }
      if (content.trim().length() > 0) {
        tokens.add(new Token(content));
      }
    }
    return tokens;
  }
}
