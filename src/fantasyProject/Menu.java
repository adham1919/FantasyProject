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

			if(mc.callLogin())
			mainMenu();
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
    System.out.println("write 1 to add player to the system");
    System.out.println("write 2 to remove player from the system");
    System.out.println("write 3 to add player to the squad");
    System.out.println("write -1 to log out");
     mc.updateList();
	n=scanner.next();
	int c=Integer.parseInt(n);
	switch(c)
	{
	case 1:
		mc.addPlayerToSys();
		break;
		
	case 2:
        mc.reomvePlayerFromSys();
		break;
	case 3:
		 mc.addPlayerToSqd();
	     break;
	case -1:
		
	default : System.out.println("option unavailable "); 
	}
}
    }

public static void main(String arg[]) throws IOException
{
	Menu m= new  Menu();
	
}
}
