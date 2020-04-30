public class America {

    State[] states;
    int numStatesAdded;
    final int numToWin = 270;
    int delegateTest;
    int BidenDel;
    int TrumpDel;
    double regionAffectedAvg;

    double impactSouth;
    double impactNortheast;
    double impactWest;
    double impactMidwest;

    boolean SouthWinner = true;
    boolean NortheastWinner = true;
    boolean WestWinner = true;
    boolean MidwestWinner = true;

    private static final int NORTHEAST = 0;
    private static final int MIDWEST = 1;
    private static final int WEST = 2;
    private static final int SOUTH = 3;

    public America(int numStates) {
        states = new State[numStates];
        numStatesAdded = 0;
    }

    public void addState(State s) {
        states[numStatesAdded] = s;
        numStatesAdded++;
    }

    public void printStateOdds() {
        for (int i = 0; i < numStatesAdded; i++) {
            System.out.println(states[i]);
        }
    }

    public void printElectoralCollege() {
        for (int i = 0; i < numStatesAdded; i++) {
            delegateTest = delegateTest + states[i].getDelegates();
        }
        System.out.println(delegateTest);
    }

    public void runBasicSimulation() {
        BidenDel = 0;
        TrumpDel = 0;
        for (int i = 0; i < numStatesAdded; i++) {
            if (Math.random() < states[i].getChance()) {
                BidenDel = BidenDel + states[i].getDelegates();
            } else {
                TrumpDel = TrumpDel + states[i].getDelegates();
            }
        }
        System.out.println(BidenDel);
    }

    public void runFullBasicSimulation() {
        BidenDel = 0;
        TrumpDel = 0;
        for (int i = 0; i < numStatesAdded; i++) {
            if (Math.random() < states[i].getChance()) {
                BidenDel = BidenDel + states[i].getDelegates();
                System.out.println(states[i].getName() + ": Biden (" + states[i].getDelegates() + ")");
            } else {
                TrumpDel = TrumpDel + states[i].getDelegates();
                System.out.println(states[i].getName() + ": Trump (" + states[i].getDelegates() + ")");
            }
        }
        if (BidenDel > 269) {
            System.out.println("Biden wins with " + BidenDel + " Delegates");
        } else if (BidenDel < 269) {
            System.out.println("Trump wins with " + TrumpDel + " Delegates");
        } else {
            System.out.println("Tie!");
        }
    }

    public void runHugeBasicSimulation() {
        for (int j = 0; j < 300; j++) {
            BidenDel = 0;
            TrumpDel = 0;
            for (int i = 0; i < numStatesAdded; i++) {
                if (Math.random() < states[i].getChance()) {
                    BidenDel = BidenDel + states[i].getDelegates();
                } else {
                    TrumpDel = TrumpDel + states[i].getDelegates();
                }
            }
            System.out.println(BidenDel);
        }
    }

   public void runFullRegionAffectedSimulation() {
        BidenDel = 0;
        TrumpDel = 0;

        impactMidwest = Math.random()*2;
        impactSouth = Math.random()*2;
        impactWest = Math.random()*2;
        impactNortheast = Math.random()*2;

        if(impactMidwest < 1){
          MidwestWinner = false;
          impactMidwest = impactMidwest +1;
        }
        if(impactSouth < 1){
          SouthWinner = false;
          impactSouth = impactSouth +1;
        }
        if(impactWest < 1){
          WestWinner = false;
          impactWest = impactWest +1;
        }
        if(impactNortheast < 1){
          NortheastWinner = false;
          impactNortheast = impactNortheast +1;
        }

        for (int i = 0; i < numStatesAdded; i++) {

          if(states[i].getRegion() == WEST){
          if(WestWinner = true){
          regionAffectedAvg = Math.pow(states[i].getChance(),impactWest);
          }
          else{
           regionAffectedAvg = 1.0-(Math.pow((1.0-states[i].getChance()),impactWest));
          }
          }

          else if(states[i].getRegion() == NORTHEAST){
          if(NortheastWinner = true){
          regionAffectedAvg = Math.pow(states[i].getChance(),impactNortheast);
          }
          else{
           regionAffectedAvg = 1.0-(Math.pow((1.0-states[i].getChance()),impactNortheast));
          }
          }

         else if(states[i].getRegion() == SOUTH){
          if(SouthWinner = true){
          regionAffectedAvg = Math.pow(states[i].getChance(),impactSouth);
          }
          else{
           regionAffectedAvg = 1.0-(Math.pow((1.0-states[i].getChance()),impactSouth));
          }
          }
          
         else if(states[i].getRegion() == MIDWEST){
          if(MidwestWinner = true){
          regionAffectedAvg = Math.pow(states[i].getChance(),impactMidwest);
          }
          else{
           regionAffectedAvg = 1.0-(Math.pow((1.0-states[i].getChance()),impactMidwest));
          }
          }
          

            if (Math.random() < regionAffectedAvg) {
                BidenDel = BidenDel + states[i].getDelegates();
                System.out.println(states[i].getName() + ": Biden (" + states[i].getDelegates() + ")");
            } else {
                TrumpDel = TrumpDel + states[i].getDelegates();
                System.out.println(states[i].getName() + ": Trump (" + states[i].getDelegates() + ")");
            }
        }

        if (BidenDel > 269) {
            System.out.println("Biden wins with " + BidenDel + " Delegates");
        } else if (BidenDel < 269) {
            System.out.println("Trump wins with " + TrumpDel + " Delegates");
        } else {
            System.out.println("Tie! (Trump probably wins this scenario)");
        }
    System.out.println(WestWinner);
    System.out.println(impactWest);
   }
   
    }