
package mp.language;

public class Declaration {
  private final String type;

  public Declaration(String declaration) {
    type = (declaration.indexOf("=") >= 0) ? "variable" : "function";

  }

  public boolean valid() {
    return false;
  }
}
