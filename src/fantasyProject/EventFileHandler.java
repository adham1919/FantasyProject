package fantasyProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EventFileHandler {
       public void SaveMatch(Match m,int weekNum) throws IOException
       {
   		String location="fantasyDatabase\\GameWeeks\\week"+weekNum;
   		File personal= new File(location+"\\match"+m.getNum()+".txt");
   		FileOutputStream stream= new FileOutputStream(personal, true);
   		String line;
   		line="";
   		stream.write((m.getTeam1()+"VS"+m.getTeam1()).getBytes());
   		stream.write((line+"\n").getBytes());
   		stream.write(("goal scorer id ").getBytes());
   		for(int i=0;i< m.getGoalScorer().size();i++)
   		{
   			line+=m.getGoalScorer().get(i)+" ";
   		}
   		stream.write((line+"\n").getBytes());
   		line="";
   		stream.write(("goal assist maker id ").getBytes());
   		for(int i=0;i< m.getgoalAssists().size();i++)
   		{
   			line+=m.getgoalAssists().get(i)+" ";
   		}
   		stream.write((line+"\n").getBytes());
   		line="";
   		stream.write(("own goal scorer id ").getBytes());
   		for(int i=0;i< m.getownGolScorer().size();i++)
   		{
   			line+=m.getownGolScorer().get(i)+" ";
   		}
   		stream.write((line+"\n").getBytes());
   		line="";
   		stream.write(("penalty misser id ").getBytes());
   		for(int i=0;i< m.getPenaltyMissed().size();i++)
   		{
   			line+=m.getPenaltyMissed().get(i)+" ";
   		}
   		stream.write((line+"\n").getBytes());
   		stream.write(("penalty savior id ").getBytes());
   		for(int i=0;i< m.getPenaltySaved().size();i++)
   		{
   			line+=m.getPenaltySaved().get(i)+" ";
   		}
   		stream.write((line+"\n").getBytes());
   		stream.write(("yellow card taker id ").getBytes());
   		for(int i=0;i< m.getYcardTaker().size();i++)
   		{
   			line+=m.getYcardTaker().get(i)+" ";
   		}
   		stream.write((line+"\n").getBytes());
   		stream.write(("red card taker id ").getBytes());
   		for(int i=0;i< m.getRcardTaker().size();i++)
   		{
   			line+=m.getRcardTaker().get(i)+" ";
   		}
   		stream.write((line+"\n").getBytes());
           stream.close();
       }
      
       public void createGameWeek(int weekNum) throws IOException
       {
   		String location="fantasyDatabase\\GameWeeks\\week"+weekNum;
   		File p=new File(location);
   		p.mkdir();
       }

}
