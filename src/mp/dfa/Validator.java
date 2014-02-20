
package mp.dfa;

import java.util.ArrayList;

public class Validator {
  private DeterministicFiniteAutomaton dfa;

  public Validator() {
    dfa = new DeterministicFiniteAutomaton(57, 33);
    dfa.initialState(0);
    dfa.transition(0, 1, 2).transition(0, 1, 3).transition(0, 1, 4).transition(0, 1, 5).transition(0, 1, 6).transition(0, 2, 7).transition(0, 4, 8).transition(0, 5, 0).transition(0, 5, 1).transition(0, 7, 9).transition(0, 28, 32);
    dfa.transition(1, 6, 25).transition(1, 7, 9);
    dfa.transition(2, 1, 4).transition(2, 3, 7).transition(2, 6, 25).transition(2, 7, 9);
    dfa.transition(3, 1, 4).transition(3, 6, 25).transition(3, 7, 9);
    dfa.transition(4, 1, 4).transition(4, 6, 25).transition(4, 7, 9);
    dfa.transition(5, 1, 3).transition(5, 1, 4).transition(5, 2, 7).transition(5, 4, 8).transition(5, 6, 25).transition(5, 7, 9);
    dfa.transition(6, 6, 25).transition(6, 7, 9);
    dfa.transition(7, 8, 13);
    dfa.transition(8, 9, 14).transition(8, 11, 3).transition(8, 11, 4).transition(8, 11, 5).transition(8, 11, 6).transition(8, 12, 2).transition(8, 13, 8).transition(8, 14, 7).transition(8, 16, 0).transition(8, 16, 1);
    dfa.transition(9, 10, 22);
    dfa.transition(10, 10, 22);
    dfa.transition(11, 9, 14).transition(11, 17, 25).transition(11, 18, 9).transition(11, 23, 21).transition(11, 27, 17);
    dfa.transition(12, 9, 14).transition(12, 17, 25).transition(12, 18, 9);
    dfa.transition(13, 9, 14).transition(13, 11, 4).transition(13, 17, 25).transition(13, 18, 9).transition(13, 23, 21).transition(13, 27, 17);
    dfa.transition(14, 9, 14).transition(14, 11, 4).transition(14, 15, 7).transition(14, 17, 25).transition(14, 18, 9).transition(14, 23, 21).transition(14, 27, 17);
    dfa.transition(15, 9, 14).transition(15, 11, 4).transition(15, 17, 25).transition(15, 18, 9).transition(15, 23, 21).transition(15, 27, 17);
    dfa.transition(16, 9, 14).transition(16, 11, 3).transition(16, 11, 4).transition(16, 13, 8).transition(16, 14, 7).transition(16, 17, 25).transition(16, 18, 9).transition(16, 23, 21).transition(16, 27, 17);
    dfa.transition(17, 9, 14).transition(17, 17, 25).transition(17, 18, 9).transition(17, 23, 21).transition(17, 27, 17);
    dfa.transition(18, 9, 14).transition(18, 23, 21).transition(18, 27, 17);
    dfa.transition(19, 9, 14).transition(19, 23, 21).transition(19, 25, 17);
    dfa.transition(20, 21, 18);
    dfa.transition(21, 9, 14).transition(21, 22, 17).transition(21, 23, 21);
    dfa.transition(22, 20, 10);
    dfa.transition(23, 11, 3).transition(23, 11, 4).transition(23, 11, 5).transition(23, 11, 6).transition(23, 13, 8).transition(23, 14, 7).transition(23, 16, 0).transition(23, 16, 1).transition(23, 24, 2);
    dfa.transition(24, 17, 21).transition(24, 18, 9);
    dfa.transition(25, 20, 10).transition(25, 26, 18);
    dfa.transition(26, 25, 17);
    dfa.transition(27, 19, 18).transition(27, 20, 10);
    dfa.transition(28, 29, 13);
    dfa.transition(29, 30, 22).transition(29, 33, 9).transition(29, 35, 10).transition(29, 49, 23).transition(29, 50, 24).transition(29, 51, 29);
    dfa.transition(30, 31, 22);
    dfa.transition(31, 32, 14);
    dfa.transition(32, 10, 22);
    dfa.transition(33, 30, 22).transition(33, 34, 28).transition(33, 45, 25).transition(33, 45, 26).transition(33, 45, 27).transition(33, 47, 23).transition(33, 48, 24).transition(33, 52, 19).transition(33, 52, 20).transition(33, 52, 29).transition(33, 55, 21);
    dfa.transition(34, 33, 9).transition(34, 35, 10).transition(34, 37, 23).transition(34, 53, 28).transition(34, 56, 24);
    dfa.transition(35, 30, 22).transition(35, 36, 25).transition(35, 36, 26).transition(35, 36, 27).transition(35, 39, 23).transition(35, 40, 24).transition(35, 52, 19).transition(35, 52, 20).transition(35, 51, 29).transition(35, 54, 28).transition(35, 55, 21);
    dfa.transition(36, 35, 10).transition(36, 37, 23).transition(36, 38, 9).transition(36, 56, 24);
    dfa.transition(37, 35, 10).transition(37, 38, 9).transition(37, 51, 23);
    dfa.transition(38, 30, 22).transition(38, 36, 25).transition(38, 36, 26).transition(38, 36, 27).transition(38, 41, 23).transition(38, 42, 24).transition(38, 52, 19).transition(38, 52, 20).transition(38, 52, 29).transition(38, 54, 28).transition(38, 55, 21);
    dfa.transition(39, 35, 10).transition(39, 38, 9).transition(39, 56, 24);
    dfa.transition(40, 35, 10).transition(40, 37, 23).transition(40, 38, 9);
    dfa.transition(41, 35, 10).transition(41, 38, 9).transition(41, 43, 23).transition(41, 56, 24);
    dfa.transition(42, 35, 10).transition(42, 37, 23).transition(42, 38, 9).transition(42, 44, 24);
    dfa.transition(43, 30, 22).transition(43, 36, 25).transition(43, 36, 26).transition(43, 36, 27).transition(43, 39, 23).transition(43, 40, 24).transition(43, 52, 19).transition(43, 52, 20).transition(43, 52, 29).transition(43, 54, 28).transition(43, 55, 21);
    dfa.transition(44, 30, 22).transition(44, 35, 25).transition(44, 35, 26).transition(44, 35, 27).transition(44, 39, 23).transition(44, 40, 24).transition(44, 52, 19).transition(44, 52, 20).transition(44, 52, 29).transition(44, 54, 28).transition(44, 55, 21);
    dfa.transition(45, 35, 10).transition(45, 37, 23).transition(45, 46, 28).transition(45, 56, 24);
    dfa.transition(46, 35, 10).transition(46, 37, 23).transition(46, 56, 24);
    dfa.transition(47, 35, 10).transition(47, 43, 23).transition(47, 46, 28).transition(47, 56, 24);
    dfa.transition(48, 35, 10).transition(48, 37, 23).transition(48, 44, 24).transition(48, 46, 28);
    dfa.transition(49, 35, 10).transition(49, 51, 23);
    dfa.transition(50, 35, 10).transition(50, 51, 24);
    dfa.transition(51, 38, 9);
    dfa.transition(52, 33, 9).transition(52, 35, 10).transition(52, 49, 23).transition(52, 50, 24).transition(52, 51, 29);
    dfa.transition(53, 33, 9).transition(53, 35, 10).transition(53, 49, 23).transition(53, 50, 24).transition(53, 51, 29);
    dfa.transition(54, 53, 28);
    dfa.transition(55, 33, 9).transition(55, 35, 10).transition(55, 49, 23).transition(55, 50, 24).transition(55, 51, 29);
    dfa.transition(56, 35, 10).transition(56, 38, 9).transition(56, 51, 24);

    int[] finalStates = {10};
    dfa.finalStates(finalStates);
  }

  public boolean validate(String input) {
    ArrayList tokens = Tokenizer.tokenize(input, " &|(){}[]<>,;+-*/=!%");
    for (int i = 0; i < tokens.size() && dfa.valid(); i++) {
      int token = indexify((Token) tokens.get(i));
      if (token >= 0) {
        dfa.read(token);
      } else {
        break;
      }
    }
    return dfa.correct();
  }

  private int indexify(Token token) {
    String content = token.content();
    switch (content) {
      case "signed": return 0;
      case "unsigned": return 1;
      case "void": return 2;
      case "char": return 3;
      case "int": return 4;
      case "float": return 5;
      case "double": return 6;
      case "long": return 7;
      case "short": return 8;
      case "&": return 11;
      case "|": return 12;
      case "(": return 13;
      case ")": return 14;
      case "{": return 15;
      case "}": return 16;
      case "[": return 17;
      case "]": return 18;
      case "<": return 19;
      case ">": return 20;
      case ",": return 21;
      case ";": return 22;
      case "+": return 23;
      case "-": return 24;
      case "*": return 25;
      case "/": return 26;
      case "%": return 27;
      case "=": return 28;
      case "!": return 29;
      case ".": return 30;
      case "'": return 31;
      case "for": return 32;
      default:
        if (validIdentifier(content)) {
          return 9;
        } else if (validNumeric(content)) {
          return 10;
        }
    }
    return -1;
  }

  private boolean validIdentifier(String input) {
    String[] keywords = "signed unsigned void char int float double long short if else do while break for switch case default return struct const".split(" ");
    String characters = "_abcdefghijklmnopqrstuvwxyz";
    String numbers = "0123456789";
    input = input.toLowerCase();
    for (int i = 0; i < keywords.length; i++) {
      if (input.equals(keywords[i])) {
        return false;
      }
    }
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      if (i == 0 && characters.indexOf(c) < 0 || i > 0 && numbers.indexOf(c) < 0 && characters.indexOf(c) < 0) {
        return false;
      }
    }
    return true;
  }

  private boolean validNumeric(String input) {
    String numbers = "0123456789";
    for (int i = 0; i < input.length(); i++) {
      if (numbers.indexOf(input.charAt(i)) < 0) {
        return false;
      }
    }
    return true;
  }
}
