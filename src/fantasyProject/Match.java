package fantasyProject;

import java.util.ArrayList;

public class Match {
   String team1;
   String team2;
   int matchNum;
   ArrayList<Integer> goalScorer;
   ArrayList<Integer> goalAssists;
   ArrayList<Integer> YcardTaker;
   ArrayList<Integer> RcardTaker;
   ArrayList<Integer> ownGolScorer;
   ArrayList<Integer> PenaltyMissed;
   ArrayList<Integer> PenaltySaved;
   
   Match(int num,String name1, String name2)
   {    matchNum=num;
        team1=name1;
        team2=name2;
	    goalScorer = new ArrayList<Integer>();
	   goalAssists = new ArrayList<Integer>();
	   YcardTaker = new ArrayList<Integer>();
	   RcardTaker = new ArrayList<Integer>();
	    ownGolScorer = new ArrayList<Integer>();
	    PenaltyMissed = new ArrayList<Integer>();
	   PenaltySaved = new ArrayList<Integer>();
   }
   Match()
   {
	   
   }
   
   void addGoalScorer(int id)
   {
	   goalScorer.add(id);
   }
   
   
   
   void addGoalAssist(int id)
   {
	   goalAssists.add(id);
   }
   
   
   
   void addYcardTaker(int id)
   {
	   YcardTaker.add(id);
   }
   
   
   
   void addRcardTake(int id)
   {
	   RcardTaker.add(id);
   }
   
   
   
   void addownGolScorer(int id)
   {
	   ownGolScorer.add(id);
   }
   
   
   
   void addPenaltyMissed(int id)
   {
	   PenaltyMissed.add(id);
   }
   
   
   void addPenaltySaved(int id)
   {
	   PenaltySaved.add(id);
   }
   
   
   ArrayList<Integer> getGoalScorer()
   {
	   return goalScorer;
   }
   ArrayList<Integer> getgoalAssists()
   {
	   return goalAssists;
   }
  
   
   ArrayList<Integer> getYcardTaker()
   {
	   return YcardTaker;
   }
   
   
   ArrayList<Integer> getRcardTaker()
   {
	   return RcardTaker;
   }
   
   ArrayList<Integer> getownGolScorer()
   {
	   return ownGolScorer;
   }
   
   
   ArrayList<Integer> getPenaltySaved()
   {
	   return PenaltySaved;
   }
   
   ArrayList<Integer> getPenaltyMissed()
   {
	   return PenaltyMissed;
   }
   int getNum()
   {
	   
	    
	   return matchNum;
   }
   String getTeam1()
   {
	   return team1;
   }
   String  getTeam2()
   {
	   return team2;
   }

}
