
package mp.language;

public class Declaration {
  private String originalDeclaration;
  private String[] validDataTypes = {"int", "double", "char"};
  private final String declarationType;
  private String returnType;
  private String identifier;
  private String[] parameters;

  public Declaration(String declaration) {
    originalDeclaration = declaration;
    if (declaration.indexOf("=") == -1 && declaration.indexOf("(") >= 0) {
      declarationType = "function";
      parseFunction(declaration);
    } else {
      declarationType = "variable";
      parseVariable(declaration);
    }
  }

  private void parseVariable(String declaration) {

  }

  private void parseFunction(String declaration) {
    int parametersStart = declaration.indexOf("(") + 1;
    int parametersEnd = declaration.indexOf(")");
    parameters = declaration.substring(parametersStart, parametersEnd).split(",");
    declaration = declaration.substring(0, parametersStart - 1);
    int separationIndex = declaration.lastIndexOf(" ");
    returnType = (separationIndex == -1) ? "" : declaration.substring(0, separationIndex);
    identifier = (separationIndex == -1) ? declaration : declaration.substring(separationIndex + 1);
    for (int i = 0; i < parameters.length; i++) {
      parameters[i] = parameters[i].trim();
    }
  }

  public boolean valid() {
    return false;
  }
}
