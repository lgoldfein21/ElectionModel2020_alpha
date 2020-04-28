public class State
{
    private String name;
    
    private boolean e2012;
    private boolean e2016;
    private boolean e2008;
    
    private double BidenAvg;
    private double TrumpAvg;
    private double avg;
    
    private double odds;
    private String swing;
    
    private double eff2016 = 1.3;
    private double eff2012 = 1.2; 
    private double eff2008 = 1.1; 
    
    public State(String name, boolean e2016, boolean e2012, boolean e2008, double BidenAvg, double TrumpAvg)
    {
        this.name = name;
        this.e2012 = e2012;
        this.e2016 = e2016;
        this.e2008 = e2008;
        
        this.BidenAvg = BidenAvg;
        this.TrumpAvg = TrumpAvg;
        
    }
    public double getPreAvg(){
        avg = (BidenAvg/(BidenAvg+TrumpAvg));
        avg = 1/(1+Math.pow((Math.E),-13*(avg-.5)));
        return avg;
    }
    public double getAvg()
    {
       avg = (BidenAvg/(BidenAvg+TrumpAvg));
           
        if(e2016 == true){
            avg = Math.pow(avg, .8);
        }
            else{
            avg = Math.pow(avg, 1.2);
        }
    
            if(e2012 == true){
            avg = Math.pow(avg, .9);
        }
            else{
            avg =  Math.pow(avg, 1.1);
    }
    
            if(e2008 == true){
            avg =  Math.pow(avg, .95);
    }
            else{
              avg =  Math.pow(avg, 1.05);
    }
    
       
        return avg;
    }
    
    public boolean get2012()
    {
        return e2012;
    }
    
     public boolean get2016()
    {
        return e2016;
    }
    
     public boolean e2008()
    {
        return e2008;
    }
    
    
    public double getOdds()
    {
        return odds;
    }
    
      public String getName()
    {
        return this.name;
    }
    
     public double getBidenAvg()
    {
        return BidenAvg;
    }
    
       public double getTrumpAvg()
    {
        return TrumpAvg;
    }
    
     public double getChance(){
         avg = (BidenAvg/(BidenAvg+TrumpAvg));
        avg = 1/(1+Math.pow((Math.E),-10*(avg-.5)));
           
        if(e2016 == true){
            avg = Math.pow(avg, .75);
        }
            else{
            avg = Math.pow(avg, 1.25);
        }
    
            if(e2012 == true){
            avg = Math.pow(avg, .85);
        }
            else{
            avg =  Math.pow(avg, 1.15);
    }
    
            if(e2008 == true){
            avg =  Math.pow(avg, .9);
    }
            else{
              avg =  Math.pow(avg, 1.1);
    }
    return avg;
    }
    
    public String toString()
    {
        avg = (BidenAvg/(BidenAvg+TrumpAvg));
        avg = 1/(1+Math.pow((Math.E),-13*(avg-.5)));
           
        if(e2016 == true){
            avg = Math.pow(avg, .75);
        }
            else{
            avg = Math.pow(avg, 1.25);
        }
    
            if(e2012 == true){
            avg = Math.pow(avg, .85);
        }
            else{
            avg =  Math.pow(avg, 1.15);
    }
    
            if(e2008 == true){
            avg =  Math.pow(avg, .9);
    }
            else{
              avg =  Math.pow(avg, 1.1);
    }
    
       
        return "Biden has " + avg*100 + "% odds to win " + name;
    }
}

