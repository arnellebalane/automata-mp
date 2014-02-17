
package mp.dfa;

import java.util.ArrayList;

public class Tokenizer {
  public static ArrayList tokenize(String input) {
    ArrayList tokens = new ArrayList();
    String delimeters = " &|(){}[]<>,;+-*/=!%";
    for (int i = 0; i < input.length(); i++) {
      String content = "" + input.charAt(i);
      if (delimeters.indexOf(content) < 0) {
        content = "";
        while (i < input.length() && delimeters.indexOf(input.charAt(i)) < 0) {
          content += input.charAt(i++);
        }
        i--;
      } else {
        String next = (i < input.length() - 1) ? "" + input.charAt(i + 1) : "";
        if (content.equals("&") && next.equals("&")
                || content.equals("|") && next.equals("|")
                || content.equals("+") && next.equals("+")
                || content.equals("-") && next.equals("-")
                || content.equals("=") && next.equals("=")
                || content.equals("!") && next.equals("=")
                || content.equals("<") && next.equals("=")
                || content.equals(">") && next.equals("=")
                || content.equals("+") && next.equals("=")
                || content.equals("-") && next.equals("=")
                || content.equals("*") && next.equals("=")
                || content.equals("/") && next.equals("=")
                || content.equals("%") && next.equals("=")) {
          content += input.charAt(++i);
        }
      }
      if (content.trim().length() > 0) {
        tokens.add(new Token(content));
      }
    }
    return tokens;
  }
}
