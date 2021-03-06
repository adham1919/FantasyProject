package PlayerPackage;

public class FWDPoints implements PointCalculator {
	 public int calPoints(MatchStatus m)
	{
			int tot=0;
			if(m.getTime()>60) tot+=2;
			else tot+=1;
			tot+=m.getGoals()*4;
			tot+=m.getAssists()*3;
			tot-=(m.getConcededGoals()/2);
			tot-=m.getOwnGoals()*2;
			if(m.hadCleanSh()) tot+=0;
			if(m.hadYCard()) tot-=1;
			if(m.hadRCard()) tot-=3;
			if(m.hadPenSaved()) tot+=0;
			if(m.hadPenMissd()) tot-=2;
	        return tot;
	}
}
