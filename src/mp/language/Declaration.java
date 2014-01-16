
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
    int parametersStart = declaration.indexOf("(");
    int parametersEnd = declaration.indexOf(")");
    String parametersString = declaration.substring(parametersStart + 1, parametersEnd).trim();
    parameters = (parametersString.length() == 0) ? null : parametersString.split(",");
    declaration = declaration.substring(0, parametersStart).trim();
    int typeSeparationIndex = declaration.lastIndexOf("*");
    if (typeSeparationIndex < 0) {
      typeSeparationIndex = declaration.lastIndexOf(" ");
    }
    returnType = (typeSeparationIndex < 0) ? "" : declaration.substring(0, typeSeparationIndex + 1).trim();
    identifier = declaration.substring(typeSeparationIndex + 1).trim();
    for (int i = 0; parameters != null && i < parameters.length; i++) {
      parameters[i] = parameters[i].trim();
    }
  }

  public boolean valid() {
    boolean validEnding = declaration.charAt(declaration.length() - 1) == ';';
    for (int i = declaration.indexOf(")") + 1; i < declaration.length() - 1 && validEnding; i++) {
      validEnding = declaration.charAt(i) == ' ';
    }
    return validReturnType(returnType) && validIdentifier(identifier) && validParameters(parameters) && validEnding;
  }

  private boolean validReturnType(String returnType) {
    return !isArray(returnType) && validDataType(returnType);
  }

  private boolean validIdentifier(String identifier) {
    String characters = "_abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String digits = "0123456789";
    boolean validIdentifier = identifier.length() > 0 && digits.indexOf(identifier.charAt(0)) == -1;
    for (int i = 0; i < identifier.length() && validIdentifier; i++) {
      char character = identifier.charAt(i);
      validIdentifier = characters.indexOf(character) >= 0 || digits.indexOf(character) >= 0;
    }
    return !validDataTypes.contains(identifier) && validIdentifier;
  }

  private boolean validParameters(String[] parameters) {
    boolean validParameters = true;
    for (int i = 0; parameters != null && i < parameters.length && validParameters; i++) {
      String brackets = "";
      int arraySeparationIndex = parameters[i].indexOf("[");
      if (arraySeparationIndex >= 0) {
        brackets = parameters[i].substring(arraySeparationIndex).trim();
        parameters[i] = parameters[i].substring(0, arraySeparationIndex).trim();
      }
      int typeSeparationIndex = parameters[i].lastIndexOf("*");
      if (typeSeparationIndex < 0) {
        typeSeparationIndex = parameters[i].lastIndexOf(" ");
      }
      String parameterDataType = (typeSeparationIndex == -1) ? parameters[i] : parameters[i].substring(0, typeSeparationIndex + 1).trim();
      String parameterIdentifier = (typeSeparationIndex == -1) ? "" : parameters[i].substring(typeSeparationIndex + 1).trim();
      validParameters = validDataType(parameterDataType + brackets) && (parameterIdentifier.length() == 0 || validIdentifier(parameterIdentifier));
    }
    return validParameters;
  }

  private boolean validDataType(String dataType) {
    boolean validPointer = true;
    boolean validArray = true;
    if (isPointer(dataType)) {
      int pointerSeparationIndex = dataType.indexOf("*");
      String asterisks = dataType.substring(pointerSeparationIndex).trim();
      dataType = dataType.substring(0, pointerSeparationIndex).trim();
      for (int i = 0; i < asterisks.length() && validPointer; i++) {
        char character = asterisks.charAt(i);
        validPointer = character == '*' || character == ' ';
      }
    }
    if (isArray(dataType)) {
      String digits = "0123456789";
      int arraySeparationIndex = dataType.indexOf("[");
      String brackets = dataType.substring(arraySeparationIndex).trim();
      dataType = dataType.substring(0, arraySeparationIndex).trim();
      boolean opened = false;
      boolean sizeRequired = false;
      boolean sizeFound = false;
      for (int i = 0; i < brackets.length() && validArray; i++) {
        char character = brackets.charAt(i);
        if (character == '[' && !opened) {
          opened = true;
        } else if (character == ']' && opened && (!sizeRequired || (sizeRequired && sizeFound))) {
          opened = false;
          sizeFound = false;
        } else if (character == ']' && opened && sizeRequired && !sizeFound) {
          validArray = false;
        } else {
          if (digits.indexOf(character) >= 0 && opened) {
            validArray = true;
            sizeRequired = true;
            sizeFound = true;
          } else {
            validArray = false;
          }
        }
      }
    }
    return validDataTypes.contains(dataType) && validPointer && validArray;
  }

  private boolean isArray(String dataType) {
    return dataType.indexOf("[") >= 0 && dataType.indexOf("]") >= 0;
  }

  private boolean isPointer(String dataType) {
    return dataType.indexOf("*") >= 0;
  }
}
