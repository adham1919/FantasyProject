package fantasyProject;

import java.io.IOException;
import java.util.ArrayList;

public class GameWeek {
   private  ArrayList<Match> matchesPlayed;
   int weekNum;
   public GameWeek()
   {
	   matchesPlayed = new ArrayList<Match>();
   }
    
   public void addMatches(Match m) throws IOException
   {   
	   matchesPlayed.add(m);
	   EventFileHandler ev = new EventFileHandler();
	   ev.SaveMatch(m, weekNum);
   }
   
   
}
