package fantasyProject;
import java.io.IOException;
import java.util.Scanner;
public class Menu {
	MenuController mc= new MenuController() ;
public Menu() throws IOException
{
        loginMenu();
		
	}
	


	
	
	
	


public void loginMenu() throws IOException
{

	

	Scanner scanner = new Scanner(System.in);
	String n="6";
	while(Integer.parseInt(n)!=-1)
		
	{  	System.out.println("Fantasy League--------------");
	     System.out.println("write 1 to sign up");
	     System.out.println("write 2 to login");
	     System.out.println("write -1 to exit");
		n=scanner.next();
		int c=Integer.parseInt(n);
		switch(c)
		{
		case 1:
			mc.callRegister();
			mainMenu();
			break;
			
		case 2:
            int x=mc.callLogin();
			if(x==1)
			mainMenu();
			else if(x==2)
			adminMenu(); 
			break;
		case -1:
			System.out.println("THANK U ");
			break;
		default : System.out.println("option unavailable "); 
		}
	}
	
		
    }


public void mainMenu() throws IOException
{   Scanner scanner = new Scanner(System.in);
    String n="7";
   
    while(Integer.parseInt(n)!=-1)
    {
    System.out.println("--------MAIN MENU---------");
    System.out.println("write 1 to add player to the squad");
    System.out.println("write -1 to log out");
     mc.updateList();
	n=scanner.next();
	int c=Integer.parseInt(n);
	switch(c)
	{
	case 1:
		 mc.addPlayerToSqd();
		break;
	

	case -1:
		break;
	default : System.out.println("option unavailable "); 
	}
}
    }



public void adminMenu() throws IOException
{   Scanner scanner = new Scanner(System.in);
    String n="7";
   
    while(Integer.parseInt(n)!=-1)
    {
    System.out.println("--------ADMIN MENU---------");
    System.out.println("write 1 edit players in the system");
    System.out.println("write 2 start game week");
    System.out.println("write 3 add matches");
    System.out.println("write -1 to log out");
     mc.updateList();
	n=scanner.next();
	int c=Integer.parseInt(n);
	switch(c)
	{
	case 1:
		mc.editSysPlayers();
		break;
		
	case 2:mc.createGameW();
        
		break;
	case 3:mc.editSysMatch();
        
		break;
	case 4:
        
		break;
	case -1:
		break;
	default : System.out.println("option unavailable "); 
	}
}
    }

public static void main(String arg[]) throws IOException
{
	Menu m= new  Menu();
	
}
}
