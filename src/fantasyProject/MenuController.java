package fantasyProject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import PlayerPackage.Player;
import PlayerPackage.Position;
public class MenuController {
   private UserAccount account;
   private ArrayList<Player> playerList;
   
   
   public MenuController() {
	   account=new UserAccount();
	  playerList = new ArrayList<Player>();
}
   public void updateList() throws FileNotFoundException
   {
	   PlayerFileHandler pf = new PlayerFileHandler();
		String location="fantasyDatabase\\Players\\";
		File f=new File(location);
		File[] players = f.listFiles();
		for (int i = 0; i < players.length; i++) {
			int c=Integer.parseInt(players[i].getName());
			Player p = new Player();
			p.setID(c);
			p=pf.getPlayerFromSys(p);
			if(playerList.indexOf(p)==-1) 
				playerList.add(p);
		}
		
   }
   public UserAccount getAccount()
   {
	   return account;
   }
   public void callRegister() throws IOException
   {   
	    Logger l= new Logger();
	    UserAccount tmpAccount=new UserAccount();
		Scanner scan=new Scanner(System.in);
		String temp;
		System.out.println("please enter email");
		temp= scan.nextLine();
		tmpAccount.setMail(temp);
		System.out.println("please enter name");
		temp= scan.nextLine();
		tmpAccount.setName(temp);
		System.out.println("please enter password");
		temp= scan.nextLine();
		tmpAccount.setPass(temp);
		System.out.println("please enter Favourite team");
		temp= scan.nextLine();
		tmpAccount.setTeam(temp);
		account=l.register(tmpAccount);
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
   public boolean callLogin() throws FileNotFoundException 
   {
	   Logger l= new Logger();
	   Scanner scanner=new Scanner(System.in);
	   UserAccount tmpAccount=new UserAccount();
	   System.out.print("please enter mail : ");
		String mail=scanner.next();
		System.out.print("please enter password : ");
		String pass=scanner.next();
		tmpAccount.setMail(mail);
		tmpAccount.setPass(pass); 
	   account=l.login(tmpAccount);
	   if(account==null)   
	   {
		   System.out.println("Error wrong mail or password");
		   return false;
	   }
	   else
	   {
		   System.out.println("login successful");
		   
		   return true;
	   }

   }
   
	 public void addPlayerToSqd() throws IOException
	 {
         System.out.println("please enter the players number");
         displayPlayers();
         AccountFileHandler af = new AccountFileHandler();
         int num=1;
         Scanner s =new Scanner(System.in);
         String loc="fantasyDatabase\\Users\\"+account.getMail();
         if(playerList.size()<15) {System.out.println("error not enough players created"); return; }
         int count=0;
         String error="error insertion failed please check ur wallet or the player postion";
   
         int n;
 
         System.out.println("insert 2 keepers");
         while(count!=2)
         {
         n=s.nextInt();
      	 if(!account.getSquad().insertGK(playerList.get(n),account)) 
      	 System.out.println(error);
      	 else
      	 {af.writeSquad(playerList.get(n), loc, num);
         af.writeWallet(account.getWallet(), loc); count++; num++;} }
         
      	System.out.println("insert 5 defeneders");
        while(count!=5)
        {
        n=s.nextInt();
     	 if(!account.getSquad().insertDF(playerList.get(n),account)) 
     	 System.out.println(error);
     	 else
     	 {af.writeSquad(playerList.get(n), loc, num);
        af.writeWallet(account.getWallet(), loc); count++; num++;} }
      	System.out.println("insert 5 midfields");
        while(count!=5)
        {
        n=s.nextInt();
     	 if(!account.getSquad().insertMID(playerList.get(n),account)) 
     	 System.out.println(error);
     	 else
     	 {af.writeSquad(playerList.get(n), loc, num);
        af.writeWallet(account.getWallet(), loc); count++; num++;} }
      	System.out.println("insert 3 forwards");
        while(count!=3)
        {
        n=s.nextInt();
     	 if(!account.getSquad().insertFW(playerList.get(n),account)) 
     	 System.out.println(error);
     	 else
     	 {af.writeSquad(playerList.get(n), loc, num);
        af.writeWallet(account.getWallet(), loc); count++; num++;}  }
       
      	 }


       
	 
	 
	 public void displayPlayers()
	 {
		 for(int i=0; i<playerList.size();i++)
		 {
			 System.out.println(i+" "+playerList.get(i).getName()+" "+playerList.get(i).getPostion()+" "+playerList.get(i).getPrice());  
		 }
	 }
}

