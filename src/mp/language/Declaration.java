
package mp.language;

import utilities.nodelist.NodeList;

public class Declaration {
  public static NodeList validDataTypes;
  private String declaration;
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

    parseFunction(declaration);
  }

  private void parseFunction(String declaration) {
    int parametersStart = declaration.indexOf("(") + 1;
    int parametersEnd = declaration.indexOf(")");
    String parametersString = declaration.substring(parametersStart, parametersEnd).trim();
    parameters = (parametersString.length() == 0) ? null : parametersString.split(",");
    declaration = declaration.substring(0, parametersStart - 1);
    int separationIndex = declaration.lastIndexOf(" ");
    returnType = (separationIndex == -1) ? "" : declaration.substring(0, separationIndex).trim();
    identifier = (separationIndex == -1) ? declaration : declaration.substring(separationIndex + 1).trim();
    for (int i = 0; parameters != null && i < parameters.length; i++) {
      parameters[i] = parameters[i].trim();
    }
  }

  public boolean valid() {
    return declaration.charAt(declaration.length() - 1) == ';'
            && (returnType.equals("") || validDataType(returnType))
            && validIdentifier(identifier) && validParameters();
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
    return validDataTypes.contains(dataType) && validAsterisks && validBrackets;
  }

  private boolean validIdentifier(String identifier) {
    String characters = "_abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String digits = "0123456789";
    boolean validIdentifier = digits.indexOf(identifier.charAt(0)) == -1;
    for (int i = 01; i < identifier.length() && validIdentifier; i++) {
      if (characters.indexOf(identifier.charAt(i)) == -1 && digits.indexOf(identifier.charAt(i)) == -1) {
        validIdentifier = false;
      }
    }
    return !validDataTypes.contains(identifier) && validIdentifier;
  }

  private boolean validParameters() {
    boolean validParameters = true;
    for (int i = 0; parameters != null && i < parameters.length && validParameters; i++) {
      if (parameters[i].indexOf(" ") == -1) {
        validParameters = validDataType(parameters[i]);
      } else {
        int separationIndex = parameters[i].lastIndexOf(" ");
        String parameterDataType = parameters[i].substring(0, separationIndex).trim();
        String parameterIdentifier = parameters[i].substring(separationIndex + 1).trim();
        validParameters = validDataType(parameterDataType) && validIdentifier(parameterIdentifier);
      }
    }
    return validParameters;
  }
}
