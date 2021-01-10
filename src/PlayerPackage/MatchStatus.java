package PlayerPackage;

public class MatchStatus {
       int goals;
       int assists;
       int goalsConceded;
       int ownGoals;
       int timePlayed;
       boolean yellowCard;
       boolean redCard;
       boolean cleanSheet;
       boolean penaltySaved;
       boolean penaltyMissed;
       
       public void setGoals(int n)
       {
    	   goals=n;
       }
       public void setTime(int n)
       {
    	   timePlayed=n;
       }
       
       public void setOwnGoals(int n)
       {
    	   ownGoals=n;
       }
       
       public void setGoalsCon(int n)
       {
    	   goalsConceded=n;
       }
       public void setAssists(int n)
       {
    	   goals=n;
       }
       public void setYCard(boolean n )
       {
    	   yellowCard=n;
       }
       public void setRCard(boolean n )
       {
    	   redCard=n;
       }
       public void setCleanSh(boolean n )
       {
    	   cleanSheet=n;
       }
       
       public void setPenSaved(boolean n)
       {
    	   penaltySaved=n;
       }
    
       
       public void setPenMiss(boolean n)
       {
    	   penaltyMissed=n;
       }
       
      public int getGoals()
      {
    	  return goals;
      }
      
      public int getTime()
      {
    	  return timePlayed;
      }
      
      public int getOwnGoals()
      {
    	  return ownGoals;
      }
      
      public int getConcededGoals()
      {
    	  return goalsConceded;
      }
      public int getAssists()
      {
    	  return assists;
      }
      
      
      public boolean hadYCard()
      {
    	  return yellowCard;
      }
      
      public boolean hadRCard()
      {
    	  return redCard;
      }
      public boolean hadCleanSh()
      {
    	  return cleanSheet;
      }
      public boolean hadPenSaved()
      {
    	  return penaltySaved;
      }
      public boolean hadPenMissd()
      {
    	  return penaltyMissed;
      }
}
