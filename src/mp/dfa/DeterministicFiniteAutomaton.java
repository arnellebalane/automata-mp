
package mp.dfa;

public class DeterministicFiniteAutomaton {
  private int[][] dfa;
  private int[] finalStates;
  private int currentState;

  public DeterministicFiniteAutomaton(int states, int tokens) {
    dfa = new int[states][tokens];
    for (int i = 0; i < states; i++) {
      for (int j = 0; j < tokens; j++) {
        dfa[i][j] = -1;
      }
    }
  }

  public void initialState(int initialState) {
    currentState = initialState;
  }

  public void finalStates(int[] finalStates) {
    this.finalStates = finalStates;
  }

  public DeterministicFiniteAutomaton transition(int from, int to, int token) {
    dfa[from][token] = to;
    return this;
  }

  public boolean read(int token) {
    currentState = dfa[currentState][token];
    return currentState >= 0;
  }

  public boolean valid() {
    return currentState >= 0;
  }

  public boolean correct() {
    for (int i = 0; i < finalStates.length; i++) {
      if (currentState == finalStates[i]) {
        return valid();
      }
    }
    return false;
  }
}
