public class Main {

    private static final int NORTHEAST = 0;
    private static final int MIDWEST = 1;
    private static final int WEST = 2;
    private static final int SOUTH = 3;

    public static void main(String[] args) {
       

        State NY = new State("New York", true, true, true, 58.8, 37.5, 29, NORTHEAST);
        State NJ = new State("New Jersey", true, true, true, 55.0, 41.8, 14, NORTHEAST);
        State CA = new State("California", true, true, true, 61.5, 33.2, 55, WEST);
        State AZ = new State("Arizona", false, false, false, 48.6, 44.2, 11, WEST);
        State AL = new State("Alabama", false, false, false, 34.6, 62.9, 9, SOUTH);
        State TX = new State("Texas", false, false, false, 45.3, 47.5, 38, SOUTH);
        State FL = new State("Florida", false, true, true, 46.5, 43.3, 29, SOUTH);
        State PA = new State("Pennsylvania", false, true, true, 48.0, 41.3, 20, NORTHEAST);
        State NC = new State("North Carolina", false, false, true, 46.7, 47.0, 15, SOUTH);
        State SC = new State("South Carolina", false, false, false, 40.8, 54.9, 9, SOUTH);
        State MN = new State("Minnesota", true, true, true, 46.9, 45.4, 10, MIDWEST);
        State WI = new State("Wisconsin", false, true, true, 46.7, 44.0, 10, MIDWEST);
        State MI = new State("Michigan", false, true, true, 46.5, 41.0, 16, MIDWEST);
        State VA = new State("Virginia", true, true, true, 48.3, 41.0, 13, SOUTH);
        State NM = new State("New Mexico", true, true, true, 48.3, 40.0, 5, WEST);
        State CO = new State("Colorado", true, true, true, 47.2, 44.4, 9, WEST);
        State UT = new State("Utah", false, false, false, 27.8, 45.9, 6, WEST);
        State OH = new State("Ohio", false, true, true, 51.3, 44.7, 18, MIDWEST);
        State IN = new State("Indiana", false, false, true, 37.9, 57.2, 11, MIDWEST);
        State IL = new State("Illinois", true, true, true, 55.4, 39.4, 20, MIDWEST);
        State IA = new State("Iowa", false, true, true, 44.0, 48.8, 6, MIDWEST);
        State GA = new State("Georgia", false, false, false, 43.5, 51.0, 16, SOUTH);
        State ND = new State("North Dakota", false, false, false, 27.8, 64.1, 3, MIDWEST);
        State SD = new State("South Dakota", false, false, false, 31.7, 61.5, 3, MIDWEST);
        State ID = new State("Idaho", false, false, false, 27.6, 59.2, 4, WEST);
        State MS = new State("Mississippi", false, false, false, 39.7, 58.3, 6, SOUTH);
        State MO = new State("Missouri", false, false, false, 38.0, 57.1, 10, MIDWEST);
        State LA = new State("Louisiana", false, false, false, 38.4, 58.1, 8, SOUTH);
        State MT = new State("Montana", false, false, false, 36.0, 56.5, 3, WEST);
        State NE_PV = new State("Nebraska Popular Vote", false, false, false, 34.0, 60.3, 2, MIDWEST);
        State NE_1 = new State("Nebraska 1st Congressional District", false, false, false, 35.5, 56.1, 1, MIDWEST);
        State NE_2 = new State("Nebraska 2nd Congressional District", false, false, true, 44.9, 47.2, 1, MIDWEST);
        State NE_3 = new State("Nebraska 3rd Congressional District", false, false, false, 19.7, 73.9, 1, MIDWEST);
        State AK = new State("Alaska", false, false, false, 37.7, 52.9, 3, WEST);
        State KS = new State("Kansas", false, false, false, 36.2, 57.2, 6, MIDWEST);
        State AR = new State("Arkansas", false, false, false, 33.8, 60.4, 6, SOUTH);
        State TN = new State("Tennessee", false, false, false, 34.9, 61.1, 11, SOUTH);
        State KY = new State("Kentucky", false, false, false, 32.7, 62.5, 8, SOUTH);
        State OK = new State("Oklahoma", false, false, false, 28.9, 65.3, 7, SOUTH);
        State WV = new State("West Virginia", false, false, false, 26.5, 68.7, 5, SOUTH);
        State WY = new State("Wyoming", false, false, false, 22.5, 70.1, 3, WEST);
        State NV = new State("Nevada", true, true, true, 48.3, 44.7, 6, WEST);
        State OR = new State("Oregon", true, true, true, 51.7, 41.1, 7, WEST);
        State WA = new State("Washington", true, true, true, 54.4, 38.2, 12, WEST);
        State ME_PV = new State("Maine Popular Vote", true, true, true, 53.3, 43.3, 2, NORTHEAST);
        State ME_1 = new State("Maine 1st Congressional District", true, true, true, 54.0, 39.0, 1, NORTHEAST);
        State ME_2 = new State("Maine 2nd Congressional District", false, true, true, 41.0, 52.0, 1, NORTHEAST);
        State DE = new State("Delaware", true, true, true, 53.4, 41.9, 3, SOUTH);
        State CT = new State("Connecticut", true, true, true, 54.5, 41.2, 7, NORTHEAST);
        State MA = new State("Massachusetts", true, true, true, 60.8, 33.5, 11, NORTHEAST);
        State VT = new State("Vermont", true, true, true, 61.1, 32.6, 3, NORTHEAST);
        State NH = new State("New Hampshire", true, true, true, 48.3, 43.7, 4, NORTHEAST);
        State RI = new State("Rhode Island", true, true, true, 55.4, 39.8, 4, NORTHEAST);
        State MD = new State("Maryland", true, true, true, 60.5, 35.5, 10, SOUTH);
        State HI = new State("Hawaii", true, true, true, 62.3, 30.1, 4, WEST);
        State DC = new State("DC", true, true, true, 92.8, 4.1, 3, SOUTH);

        America a = new America(56);

        a.addState(AL);
        a.addState(AK);
        a.addState(AZ);
        a.addState(AR);
        a.addState(CA);
        a.addState(CO);
        a.addState(CT);
        a.addState(DC);
        a.addState(DE);
        a.addState(FL);
        a.addState(GA);
        a.addState(HI);
        a.addState(ID);
        a.addState(IL);
        a.addState(IN);
        a.addState(IA);
        a.addState(KS);
        a.addState(KY);
        a.addState(LA);
        a.addState(ME_PV);
        a.addState(ME_1);
        a.addState(ME_2);
        a.addState(MD);
        a.addState(MA);
        a.addState(MI);
        a.addState(MN);
        a.addState(MS);
        a.addState(MO);
        a.addState(MT);
        a.addState(NE_PV);
        a.addState(NE_1);
        a.addState(NE_2);
        a.addState(NE_3);
        a.addState(NV);
        a.addState(NH);
        a.addState(NJ);
        a.addState(NM);
        a.addState(NY);
        a.addState(NC);
        a.addState(ND);
        a.addState(OH);
        a.addState(OK);
        a.addState(OR);
        a.addState(PA);
        a.addState(RI);
        a.addState(SC);
        a.addState(SD);
        a.addState(TN);
        a.addState(TX);
        a.addState(UT);
        a.addState(VT);
        a.addState(VA);
        a.addState(WA);
        a.addState(WV);
        a.addState(WI);
        a.addState(WY);

       // a.printStateOdds();

      //  System.out.println("");
       // System.out.println("");
        
        // a.runFullBasicSimulation();

      a.runFullRegionAffectedSimulation(); 

    // a.runHugeRegionAffectedSimulation();
    }
}