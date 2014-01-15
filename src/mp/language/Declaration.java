
package mp.language;

import utilities.nodelist.NodeList;

public class Declaration {
  public static NodeList validDataTypes;
  private String declaration;
  private final String declarationType;
  private String returnType;
  private String identifier;
  private String[] parameters;

  public Declaration(String declaration) {
    this.declaration = declaration.trim();
    validDataTypes = new NodeList();
    validDataTypes.insert("void");
    validDataTypes.insert("int");
    validDataTypes.insert("long");
    validDataTypes.insert("long long");
    validDataTypes.insert("float");
    validDataTypes.insert("double");
    validDataTypes.insert("char");

    if (declaration.indexOf("=") == -1 && declaration.indexOf("(") >= 0) {
      declarationType = "function";
      parseFunction(declaration);
    } else {
      declarationType = "variable";
      parseVariable(declaration);
    }
  }

  private void parseFunction(String declaration) {
    int parametersStart = declaration.indexOf("(") + 1;
    int parametersEnd = declaration.indexOf(")");
    parameters = declaration.substring(parametersStart, parametersEnd).split(",");
    declaration = declaration.substring(0, parametersStart - 1);
    int separationIndex = declaration.lastIndexOf(" ");
    returnType = (separationIndex == -1) ? "" : declaration.substring(0, separationIndex).trim();
    identifier = (separationIndex == -1) ? declaration : declaration.substring(separationIndex + 1).trim();
    for (int i = 0; i < parameters.length; i++) {
      parameters[i] = parameters[i].trim();
    }
  }

  private void parseVariable(String declaration) {
    // TO BE IMPLEMENTED
  }

  public boolean valid() {
    if (declarationType.equals("function")) {
      return validFunction();
    }
    return validVariable();
  }

  private boolean validFunction() {
    return declaration.charAt(declaration.length() - 1) == ';'
            && validDataType(returnType) && validIdentifier() && validParameters();
  }

  private boolean validVariable() {
    // TO BE IMPLEMENTED
    return false;
  }

  private boolean validDataType(String dataType) {
    int pointerSeparationIndex = dataType.indexOf("*");
    int arraySeparationIndex = dataType.indexOf("[");
    boolean validAsterisks = true;
    boolean validBrackets = true;
    if (pointerSeparationIndex >= 0) {
      String asterisks = dataType.substring(pointerSeparationIndex);
      dataType = dataType.substring(0, pointerSeparationIndex);
      for (int i = 0; i < asterisks.length() &&  validAsterisks; i++) {
        if (asterisks.charAt(i) != '*') {
          validAsterisks = false;
        }
      }
    }
    if (arraySeparationIndex >= 0) {
      String brackets = dataType.substring(arraySeparationIndex);
      dataType = dataType.substring(0, arraySeparationIndex);
      validBrackets = brackets.length() % 2 == 0;
      for (int i = 0; i < brackets.length() && validBrackets; i++) {
        if ((i % 2 == 0 && brackets.charAt(i) != '[') || (i % 2 == 1 && brackets.charAt(i) != ']')) {
          validBrackets = false;
        }
      }
    }
    System.out.println(validDataTypes.contains(dataType) && validAsterisks && validBrackets);
    return validDataTypes.contains(dataType) && validAsterisks && validBrackets;
  }

  private boolean validIdentifier() {
    return false;
  }

  private boolean validParameters() {
    return false;
  }
}
