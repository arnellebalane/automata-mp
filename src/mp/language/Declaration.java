
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
    declaration = declaration.substring(0, parametersStart);
    int typeSeparationIndex = declaration.lastIndexOf("*");
    if (typeSeparationIndex < 0) {
      typeSeparationIndex = declaration.lastIndexOf(" ");
    }
    returnType = (typeSeparationIndex < 0) ? "" : declaration.substring(0, typeSeparationIndex + 1).trim();
    identifier = declaration.substring(typeSeparationIndex + 1);

    System.out.println(returnType);
    System.out.println(identifier);
    for (int i = 0; parameters != null && i < parameters.length; i++) {
      parameters[i] = parameters[i].trim();
      System.out.println(parameters[i]);
    }
  }
}
