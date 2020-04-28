public class America{

  State[] states;
  int numStatesAdded;
  final int numToWin = 270;
  int delegateTest;

  public America(int numStates)
  {
    states = new State[numStates];
    numStatesAdded = 0;
  }
  
  public void addState(State s)
  {
    states[numStatesAdded] = s;
    numStatesAdded++;
  }

  public void printStateOdds()
    {
        for(int i = 0; i < numStatesAdded; i++)
        {
            System.out.println(states[i]);
        }
    }

     public void printElectoralCollege()
    {
        for(int i = 0; i < numStatesAdded; i++)
        {
          delegateTest = delegateTest + states[i].getDelegates();
        }
        System.out.println(delegateTest);
    }
}