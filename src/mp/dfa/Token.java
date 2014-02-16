
package mp.dfa;

public class Token {
  private String content;

  public Token(String content) {
    this.content = content;
  }

  public String content() {
    return content;
  }

  @Override
  public String toString() {
    return content;
  }
}
