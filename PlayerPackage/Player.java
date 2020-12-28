package PlayerPackage;



public class Player {
     int PID;
     String name;
     String nationality;
     String club;
     int totalPoints;
     int weekPoints;
     PointCalculator pc;
     MatchStatus ms ;
     PlayerValue pv ;
     Position pos ;
     
     
     public Player()
     {
         ms =new MatchStatus();
         pv = new PlayerValue();
     }
     public void setName(String s)
     {
     	name=s;
     }
     
     public void setNation(String s)
     {
     	nationality=s;
     }
     
     
     public void setClub(String s)
     {
     	club=s;
     }
     
     public void setPoints()
     {
    	 
     	totalPoints+=pc.calPoints(ms); 
     	weekPoints=pc.calPoints(ms);
     }
     
     
     
     public int getTotPoints()
     {
     	return totalPoints;
     }
     public int getPoints()
     {
     	return weekPoints;
     }
     public String getName()
     {
     	return name;
     }
     public String getClub()
     {
     	return club;
     }
     public String getNation()
     {
     	return nationality;
     }
     
     public void setPostion(String s)
     {
     	if(s.equals("gk")) pos=Position.GKP;
     	if(s.equals("df")) pos=Position.DEF;
     	if(s.equals("md")) pos=Position.MID;
     	if(s.equals("fw")) pos=Position.FWD;
     }
     public void setCalculator()
     {
     	if(pos==Position.GKP) pc = new GKPoints();
     	if( pos==Position.DEF)pc = new DFPoints();
     	if(pos==Position.MID) pc = new MIDPoints();
     	if(pos==Position.FWD) pc = new FWDPoints();
     }
     public void setID(int n)
     {
    	 PID=n;
     }
     public int getID()
     {
    	 return PID;
     }
     public String getPostion()
     {
      	if(pos==Position.GKP) return "gk";
      	if( pos==Position.DEF) return "df";
      	if(pos==Position.MID) return "md";
        return "fw";
     }

     public int getPrice()
     {
    	return pv.getPrice();
     }
     
     public void  setPrice(int n)
     {
    	 pv.setPrice(n);
     }
}
