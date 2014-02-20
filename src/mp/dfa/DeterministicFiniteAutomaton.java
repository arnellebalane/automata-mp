
package mp.dfa;

public class DeterministicFiniteAutomaton {
  private int[][] dfa;
  private int initialState;
  private int[] finalStates;

  public DeterministicFiniteAutomaton(int states, int tokens) {
    dfa = new int[states][tokens];
    for (int i = 0; i < states; i++) {
      for (int j = 0; j < tokens; j++) {
        dfa[i][j] = -1;
      }
    }
  }

  public void initialState(int initialState) {
    this.initialState = initialState;
  }

  public void finalStates(int[] finalStates) {
    this.finalStates = finalStates;
  }

  public DeterministicFiniteAutomaton transition(int from, int to, int token) {
    dfa[from][token] = to;
    return this;
  }
}
