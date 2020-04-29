public class America{

  State[] states;
  int numStatesAdded;
  final int numToWin = 270;
  int delegateTest;
  int BidenDel;
  int TrumpDel;

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

      public void runBasicSimulation()
    {
      BidenDel = 0;
      TrumpDel = 0;
        for(int i = 0; i < numStatesAdded; i++)
        {
         if(Math.random() < states[i].getChance()){
           BidenDel = BidenDel + states[i].getDelegates();
         }
         else{
            TrumpDel = TrumpDel + states[i].getDelegates();
         }
        }
        System.out.println(BidenDel);
    }

      public void runFullBasicSimulation()
    {
      BidenDel = 0;
      TrumpDel = 0;
        for(int i = 0; i < numStatesAdded; i++)
        {
         if(Math.random() < states[i].getChance()){
           BidenDel = BidenDel + states[i].getDelegates();
           System.out.println(states[i].getName() + ": Biden (" +states[i].getDelegates() + ")");
         }
         else{
            TrumpDel = TrumpDel + states[i].getDelegates();
            System.out.println(states[i].getName() + ": Trump (" +states[i].getDelegates() + ")");
         }
        }
        if(BidenDel>269){
        System.out.println("Biden wins with " + BidenDel +" Delegates");
        }
        else if(BidenDel<269){
        System.out.println("Trump wins with " + TrumpDel +" Delegates");
        }
        else{
        System.out.println("Tie!");
        }
    }
}