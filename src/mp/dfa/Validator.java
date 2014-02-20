
package mp.dfa;

import java.util.ArrayList;

public class Validator {
  private DeterministicFiniteAutomaton dfa;

  public Validator() {
    dfa = new DeterministicFiniteAutomaton(133, 33);
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
    dfa.transition(30, 31, 22).transition(30, 57, 9).transition(30, 59, 10).transition(30, 73, 23).transition(30, 74, 24).transition(30, 75, 29);
    dfa.transition(31, 32, 14).transition(31, 83, 9).transition(31, 85, 10).transition(31, 99, 23).transition(31, 100, 24).transition(31, 101, 29);
    dfa.transition(32, 10, 22).transition(32, 107, 15);
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
    dfa.transition(47, 35, 10).transition(47, 38, 9).transition(47, 43, 23).transition(47, 46, 28).transition(47, 56, 24);
    dfa.transition(48, 35, 10).transition(48, 38, 9).transition(48, 37, 23).transition(48, 44, 24).transition(48, 46, 28);
    dfa.transition(49, 35, 10).transition(49, 38, 9).transition(49, 51, 23);
    dfa.transition(50, 35, 10).transition(50, 38, 9).transition(50, 51, 24);
    dfa.transition(51, 38, 9);
    dfa.transition(52, 33, 9).transition(52, 35, 10).transition(52, 49, 23).transition(52, 50, 24).transition(52, 51, 29).transition(52, 53, 28);
    dfa.transition(53, 33, 9).transition(53, 35, 10).transition(53, 49, 23).transition(53, 50, 24).transition(53, 51, 29);
    dfa.transition(54, 53, 28);
    dfa.transition(55, 33, 9).transition(55, 35, 10).transition(55, 49, 23).transition(55, 50, 24).transition(55, 51, 29);
    dfa.transition(56, 35, 10).transition(56, 38, 9).transition(56, 51, 24);
    dfa.transition(57, 31, 22).transition(57, 58, 28).transition(57, 69, 25).transition(57, 69, 26).transition(57, 69, 27).transition(57, 71, 23).transition(57, 72, 24).transition(57, 76, 19).transition(57, 76, 20).transition(57, 76, 29).transition(57, 79, 11).transition(57, 81, 12);
    dfa.transition(58, 57, 9).transition(58, 59, 10).transition(58, 61, 23).transition(58, 77, 28).transition(58, 80, 24);
    dfa.transition(59, 31, 22).transition(59, 60, 25).transition(59, 60, 26).transition(59, 60, 27).transition(59, 63, 23).transition(59, 64, 24).transition(59, 76, 19).transition(59, 76, 20).transition(59, 75, 29).transition(59, 78, 28).transition(59, 79, 11).transition(59, 81, 12);
    dfa.transition(60, 59, 10).transition(60, 61, 23).transition(60, 62, 9).transition(60, 80, 24);
    dfa.transition(61, 59, 10).transition(61, 62, 9).transition(61, 75, 23);
    dfa.transition(62, 31, 22).transition(62, 60, 25).transition(62, 60, 26).transition(62, 60, 27).transition(62, 65, 23).transition(62, 66, 24).transition(62, 76, 19).transition(62, 76, 20).transition(62, 76, 29).transition(62, 78, 28).transition(62, 79, 11).transition(62, 81, 12);
    dfa.transition(63, 59, 10).transition(63, 62, 9).transition(63, 80, 24);
    dfa.transition(64, 59, 10).transition(64, 61, 23).transition(64, 62, 9);
    dfa.transition(65, 59, 10).transition(65, 62, 9).transition(65, 67, 23).transition(65, 80, 24);
    dfa.transition(66, 59, 10).transition(66, 61, 23).transition(66, 62, 9).transition(66, 68, 24);
    dfa.transition(67, 31, 22).transition(67, 60, 25).transition(67, 60, 26).transition(67, 60, 27).transition(67, 63, 23).transition(67, 64, 24).transition(67, 76, 19).transition(67, 76, 20).transition(67, 76, 29).transition(67, 78, 28).transition(67, 79, 11).transition(67, 81, 12);
    dfa.transition(68, 31, 22).transition(68, 59, 25).transition(68, 59, 26).transition(68, 59, 27).transition(68, 63, 23).transition(68, 64, 24).transition(68, 76, 19).transition(68, 76, 20).transition(68, 76, 29).transition(68, 78, 28).transition(68, 79, 11).transition(68, 81, 12);
    dfa.transition(69, 59, 10).transition(69, 61, 23).transition(69, 70, 28).transition(69, 80, 24);
    dfa.transition(70, 59, 10).transition(70, 61, 23).transition(70, 80, 24);
    dfa.transition(71, 59, 10).transition(71, 67, 23).transition(71, 70, 28).transition(71, 80, 24);
    dfa.transition(72, 59, 10).transition(72, 61, 23).transition(72, 68, 24).transition(72, 70, 28);
    dfa.transition(73, 59, 10).transition(73, 62, 9).transition(73, 75, 23);
    dfa.transition(74, 59, 10).transition(74, 62, 9).transition(74, 75, 24);
    dfa.transition(75, 62, 9);
    dfa.transition(76, 57, 9).transition(76, 59, 10).transition(76, 73, 23).transition(76, 74, 24).transition(76, 75, 29).transition(76, 77, 28);
    dfa.transition(77, 57, 9).transition(77, 59, 10).transition(77, 73, 23).transition(77, 74, 24).transition(77, 75, 29);
    dfa.transition(78, 77, 28);
    dfa.transition(79, 82, 11);
    dfa.transition(80, 59, 10).transition(80, 62, 9).transition(80, 75, 24);
    dfa.transition(81, 82, 12);
    dfa.transition(82, 57, 9).transition(82, 59, 10).transition(82, 73, 23).transition(82, 74, 24).transition(82, 75, 29);
    dfa.transition(83, 32, 14).transition(83, 84, 28).transition(83, 95, 25).transition(83, 95, 26).transition(83, 95, 27).transition(83, 97, 23).transition(83, 98, 24).transition(83, 102, 19).transition(83, 102, 20).transition(83, 102, 29).transition(83, 105, 21);
    dfa.transition(84, 83, 9).transition(84, 85, 10).transition(84, 87, 23).transition(84, 103, 28).transition(84, 106, 24);
    dfa.transition(85, 32, 14).transition(85, 86, 25).transition(85, 86, 26).transition(85, 86, 27).transition(85, 89, 23).transition(85, 90, 24).transition(85, 102, 19).transition(85, 102, 20).transition(85, 51, 29).transition(85, 104, 28).transition(85, 105, 21);
    dfa.transition(86, 85, 10).transition(86, 87, 23).transition(86, 88, 9).transition(86, 106, 24);
    dfa.transition(87, 85, 10).transition(87, 88, 9).transition(87, 101, 23);
    dfa.transition(88, 32, 14).transition(88, 86, 25).transition(88, 86, 26).transition(88, 86, 27).transition(88, 91, 23).transition(88, 92, 24).transition(88, 102, 19).transition(88, 102, 20).transition(88, 102, 29).transition(88, 104, 28).transition(88, 105, 21);
    dfa.transition(89, 85, 10).transition(89, 88, 9).transition(89, 106, 24);
    dfa.transition(90, 85, 10).transition(90, 87, 23).transition(90, 88, 9);
    dfa.transition(91, 85, 10).transition(91, 88, 9).transition(91, 93, 23).transition(91, 106, 24);
    dfa.transition(92, 85, 10).transition(92, 87, 23).transition(92, 88, 9).transition(92, 94, 24);
    dfa.transition(93, 32, 14).transition(93, 86, 25).transition(93, 86, 26).transition(93, 86, 27).transition(93, 89, 23).transition(93, 90, 24).transition(93, 102, 19).transition(93, 102, 20).transition(93, 102, 29).transition(93, 104, 28).transition(93, 105, 21);
    dfa.transition(94, 32, 14).transition(94, 85, 25).transition(94, 85, 26).transition(94, 85, 27).transition(94, 89, 23).transition(94, 90, 24).transition(94, 102, 19).transition(94, 102, 20).transition(94, 102, 29).transition(94, 104, 28).transition(94, 105, 21);
    dfa.transition(95, 85, 10).transition(95, 87, 23).transition(95, 96, 28).transition(95, 106, 24);
    dfa.transition(96, 85, 10).transition(96, 87, 23).transition(96, 106, 24);
    dfa.transition(97, 85, 10).transition(97, 88, 9).transition(97, 93, 23).transition(97, 96, 28).transition(97, 106, 24);
    dfa.transition(98, 85, 10).transition(98, 88, 9).transition(98, 87, 23).transition(98, 94, 24).transition(98, 96, 28);
    dfa.transition(99, 85, 10).transition(99, 88, 9).transition(99, 101, 23);
    dfa.transition(100, 85, 10).transition(100, 88, 9).transition(100, 101, 24);
    dfa.transition(101, 88, 9);
    dfa.transition(102, 83, 9).transition(102, 85, 10).transition(102, 99, 23).transition(102, 100, 24).transition(102, 101, 29).transition(102, 53, 28);
    dfa.transition(103, 83, 9).transition(103, 85, 10).transition(103, 99, 23).transition(103, 100, 24).transition(103, 101, 29);
    dfa.transition(104, 103, 28);
    dfa.transition(105, 83, 9).transition(105, 85, 10).transition(105, 99, 23).transition(105, 100, 24).transition(105, 101, 29);
    dfa.transition(106, 85, 10).transition(106, 88, 9).transition(106, 101, 24);
    dfa.transition(107, 10, 16).transition(107, 108, 9).transition(107, 110, 10).transition(107, 124, 23).transition(107, 125, 24).transition(107, 126, 29);
    dfa.transition(108,132, 22).transition(108, 109, 28).transition(108, 120, 25).transition(108, 120, 26).transition(108, 120, 27).transition(108, 122, 23).transition(108, 123, 24).transition(108, 127, 19).transition(108, 127, 20).transition(108, 127, 29).transition(108, 130, 21);
    dfa.transition(109, 108, 9).transition(109, 110, 10).transition(109, 112, 23).transition(109, 128, 28).transition(109, 131, 24);
    dfa.transition(110,132, 22).transition(110, 111, 25).transition(110, 111, 26).transition(110, 111, 27).transition(110, 114, 23).transition(110, 115, 24).transition(110, 127, 19).transition(110, 127, 20).transition(110, 126, 29).transition(110, 129, 28).transition(110, 130, 21);
    dfa.transition(111, 110, 10).transition(111, 112, 23).transition(111, 113, 9).transition(111, 131, 24);
    dfa.transition(112, 110, 10).transition(112, 113, 9).transition(112, 126, 23);
    dfa.transition(113,132, 22).transition(113, 111, 25).transition(113, 111, 26).transition(113, 111, 27).transition(113, 116, 23).transition(113, 117, 24).transition(113, 127, 19).transition(113, 127, 20).transition(113, 127, 29).transition(113, 129, 28).transition(113, 130, 21);
    dfa.transition(114, 110, 10).transition(114, 113, 9).transition(114, 131, 24);
    dfa.transition(115, 110, 10).transition(115, 112, 23).transition(115, 113, 9);
    dfa.transition(116, 110, 10).transition(116, 113, 9).transition(116, 118, 23).transition(116, 131, 24);
    dfa.transition(117, 110, 10).transition(117, 112, 23).transition(117, 113, 9).transition(117, 119, 24);
    dfa.transition(118,132, 22).transition(118, 111, 25).transition(118, 111, 26).transition(118, 111, 27).transition(118, 114, 23).transition(118, 115, 24).transition(118, 127, 19).transition(118, 127, 20).transition(118, 127, 29).transition(118, 129, 28).transition(118, 130, 21);
    dfa.transition(119,132, 22).transition(119, 110, 25).transition(119, 110, 26).transition(119, 110, 27).transition(119, 114, 23).transition(119, 115, 24).transition(119, 127, 19).transition(119, 127, 20).transition(119, 127, 29).transition(119, 129, 28).transition(119, 130, 21);
    dfa.transition(120, 110, 10).transition(120, 112, 23).transition(120, 121, 28).transition(120, 131, 24);
    dfa.transition(121, 110, 10).transition(121, 112, 23).transition(121, 131, 24);
    dfa.transition(122, 110, 10).transition(122, 113, 9).transition(122, 118, 23).transition(122, 121, 28).transition(122, 131, 24);
    dfa.transition(123, 110, 10).transition(123, 113, 9).transition(123, 112, 23).transition(123, 119, 24).transition(123, 121, 28);
    dfa.transition(124, 110, 10).transition(124, 113, 9).transition(124, 126, 23);
    dfa.transition(125, 110, 10).transition(125, 113, 9).transition(125, 126, 24);
    dfa.transition(126, 113, 9);
    dfa.transition(127, 108, 9).transition(127, 110, 10).transition(127, 124, 23).transition(127, 125, 24).transition(127, 126, 29).transition(127, 128, 28);
    dfa.transition(128, 108, 9).transition(128, 110, 10).transition(128, 124, 23).transition(128, 125, 24).transition(128, 126, 29);
    dfa.transition(129, 128, 28);
    dfa.transition(130, 108, 9).transition(130, 110, 10).transition(130, 124, 23).transition(130, 125, 24).transition(130, 126, 29);
    dfa.transition(131, 110, 10).transition(131, 113, 9).transition(131, 126, 24);
    dfa.transition(132, 10, 16).transition(132, 108, 9).transition(132, 110, 10).transition(132, 124, 23).transition(132, 125, 24).transition(132, 126, 29);

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
