<<<<<<< HEAD
package PlayerPackage;

public class MIDPoints implements PointCalculator {
	 public int calPoints(MatchStatus m)
	{
			int tot=0;
			if(m.getTime()>60) tot+=2;
			else tot+=1;
			tot+=m.getGoals()*5;
			tot+=m.getAssists()*3;
			tot-=(m.getConcededGoals()/2);
			tot-=m.getOwnGoals()*2;
			if(m.hadCleanSh()) tot+=1;
			if(m.hadYCard()) tot-=1;
			if(m.hadRCard()) tot-=3;
			if(m.hadPenSaved()) tot+=0;
			if(m.hadPenMissd()) tot-=2;
	        return tot;
	}
}
=======
package PlayerPackage;

public class MIDPoints implements PointCalculator {
	 public int calPoints(MatchStatus m)
	{
			int tot=0;
			if(m.getTime()>60) tot+=2;
			else tot+=1;
			tot+=m.getGoals()*5;
			tot+=m.getAssists()*3;
			tot-=(m.getConcededGoals()/2);
			tot-=m.getOwnGoals()*2;
			if(m.hadCleanSh()) tot+=1;
			if(m.hadYCard()) tot-=1;
			if(m.hadRCard()) tot-=3;
			if(m.hadPenSaved()) tot+=0;
			if(m.hadPenMissd()) tot-=2;
	        return tot;
	}
}
>>>>>>> 1a79b75e71fe34fba5bf8d9b97ea25f92f9f0acb
