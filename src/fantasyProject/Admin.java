package fantasyProject;

import java.io.IOException;
import java.util.Scanner;

import PlayerPackage.Player;

public class Admin   {
	private String username="admin";
	private String password="admin";
    public String getName()
    {
    	return username;
    }
    public String getPass()
    {
    	return password;
    }
    
    public void addPlayerToSys() throws IOException {
 	   Player p=new Player();
 	   PlayerFileHandler p2 = new PlayerFileHandler();
 	   Scanner input=new Scanner(System.in);
 	   String pname = "" , pclub="" , pnation="",s;
 	   System.out.println("Enter the player name");
 	   pname=input.nextLine();
 	   p.setName(pname);
 	   System.out.println("Enter the player club");
 	   pclub=input.nextLine();
 	   p.setClub(pclub);
 	   System.out.println("Enter the player nation");
 	   pnation=input.nextLine();
 	   p.setNation(pnation);
 	   System.out.println("Enter the player postion");
 	   s=input.nextLine();
 	   p.setPostion(s);
 	   System.out.println("Enter the player id");
 	   int n=input.nextInt();
 	   p.setID(n);
 	   System.out.println("Enter the player price");
 	  n=input.nextInt();
 	   p.setPrice(n);
 	   p2.addToSys(p);
 	   
 	   
    }
    public void reomvePlayerFromSys() throws IOException {
 	   Player p=new Player();
 	   PlayerFileHandler p2 = new PlayerFileHandler();
 	   Scanner input=new Scanner(System.in);
 	   System.out.println("Enter the player id");
 	   int n=input.nextInt();
 	   p.setID(n);
 	   p2.removeFromSys(p);
 	     
    }
    
    public Match createMatch()
    {  
    	Scanner input=new Scanner(System.in);
    	Scanner input2=new Scanner(System.in);
    	
        System.out.println("enter the first team name");
        String nm1=input2.nextLine();
        System.out.println("enter the second team name");
        String nm2=input2.nextLine();
        System.out.println("enter the macth number");
        int n3=input2.nextInt();
    	Match newMatch = new Match(n3,nm1,nm2);
    	
    	int n=12;
    	int n2;
    	while(n!=-1)
    	{
    		System.out.println("1 add goal scorer");
    		System.out.println("2 add goal assist");
    		System.out.println("3 add plenaty miss");
    		System.out.println("4 add own goal scorer");
    		System.out.println("5 add penalty save");
    		System.out.println("6 add yellow card taker");
    		System.out.println("7 add red card taker");
    		System.out.println("-1 to exit");
    		System.out.println("enter option then the player id");
    		 n=input.nextInt();
    		 n2=input.nextInt();
    		switch(n)
    		{
    		case 1: 
    			newMatch.addGoalScorer(n2);
    			break;
    		case 2: 
    			newMatch.addGoalAssist(n2);
    			break;
    		case 3: 
    			newMatch.addPenaltyMissed(n2);
    			break;
    		case 4: 
    			newMatch.addownGolScorer(n2);
    			break;
    		case 5: 
    			newMatch.addPenaltySaved(n2);
    			break;
    		case 6: 
    			newMatch.addYcardTaker(n2);
    			break;
    		case 7: 
    			newMatch.addRcardTake(n2);
    			break;

    		}
  
    	}
    	
    	
    	return newMatch;
    }
    
    public void createGW() throws IOException
    {
    	EventFileHandler p2=new EventFileHandler();
    	Scanner input=new Scanner(System.in);
    	int n;
    	n=input.nextInt();
    	p2.createGameWeek(n);
    	
    }
    

}
