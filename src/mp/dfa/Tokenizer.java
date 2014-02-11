
package mp.dfa;

import java.util.ArrayList;

public class Tokenizer {
  public static ArrayList tokenize(String input) {
    ArrayList tokens = new ArrayList();
    while (input.length() > 0) {
      int spaceIndex = input.indexOf(" ");
      int asteriskIndex = input.indexOf("*");
      int openParenthesisIndex = input.indexOf("(");
      int closeParenthesisIndex = input.indexOf(")");
      int commaIndex = input.indexOf(",");
      int semicolonIndex = input.indexOf(";");

      int index = 0;
      if (spaceIndex >= 0
          && (spaceIndex < asteriskIndex || asteriskIndex < 0)
          && (spaceIndex < openParenthesisIndex || openParenthesisIndex < 0)
          && (spaceIndex < closeParenthesisIndex || closeParenthesisIndex < 0)
          && (spaceIndex < commaIndex || commaIndex < 0)
          && (spaceIndex < semicolonIndex || semicolonIndex < 0)) {
        index = spaceIndex;
      } else if (asteriskIndex >= 0
          && (asteriskIndex < spaceIndex || spaceIndex < 0)
          && (asteriskIndex < openParenthesisIndex || openParenthesisIndex < 0)
          && (asteriskIndex < closeParenthesisIndex || closeParenthesisIndex < 0)
          && (asteriskIndex < commaIndex || commaIndex < 0)
          && (asteriskIndex < semicolonIndex || semicolonIndex < 0)) {
        index = asteriskIndex;
      } else if (openParenthesisIndex >= 0
          && (openParenthesisIndex < spaceIndex || spaceIndex < 0)
          && (openParenthesisIndex < asteriskIndex || asteriskIndex < 0)
          && (openParenthesisIndex < closeParenthesisIndex || closeParenthesisIndex < 0)
          && (openParenthesisIndex < commaIndex || commaIndex < 0)
          && (openParenthesisIndex < semicolonIndex || semicolonIndex < 0)) {
        index = openParenthesisIndex;
      } else if (closeParenthesisIndex >= 0
          && (closeParenthesisIndex < spaceIndex || spaceIndex < 0)
          && (closeParenthesisIndex < asteriskIndex || asteriskIndex < 0)
          && (closeParenthesisIndex < openParenthesisIndex || openParenthesisIndex < 0)
          && (closeParenthesisIndex < commaIndex || commaIndex < 0)
          && (closeParenthesisIndex < semicolonIndex || semicolonIndex < 0)) {
        index = closeParenthesisIndex;
      } else if (commaIndex >= 0
          && (commaIndex < spaceIndex || spaceIndex < 0)
          && (commaIndex < asteriskIndex || asteriskIndex < 0)
          && (commaIndex < openParenthesisIndex || openParenthesisIndex < 0)
          && (commaIndex < closeParenthesisIndex || closeParenthesisIndex < 0)
          && (commaIndex < semicolonIndex || semicolonIndex < 0)) {
        index = commaIndex;
      } else if (semicolonIndex >= 0
          && (semicolonIndex < spaceIndex || spaceIndex < 0)
          && (semicolonIndex < asteriskIndex || asteriskIndex < 0)
          && (semicolonIndex < openParenthesisIndex || openParenthesisIndex < 0)
          && (semicolonIndex < closeParenthesisIndex || closeParenthesisIndex < 0)
          && (semicolonIndex < commaIndex || commaIndex < 0)) {
        index = semicolonIndex;
      }

      String segment = input.substring(0, index);
      if (segment.trim().length() > 0) {
        tokens.add(segment);
      }
      segment = input.substring(index, index + 1);
      if (segment.trim().length() > 0) {
        tokens.add(segment);
      }

      input = input.substring(index + 1);
    }
    return tokens;
  }
}
