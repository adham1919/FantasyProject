package fantasyProject;
import java.io.IOException;
import java.util.Scanner;
public class Menu {
	MenuController mc= new MenuController() ;
public Menu() throws IOException
{
        loginMenu();
		System.out.println("THANK U ");
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
		}
	}
	
		
    }


public void mainMenu()
{   Scanner scanner = new Scanner(System.in);
    String n="7";
   
    while(Integer.parseInt(n)!=-1)
    {
    	System.out.println("--------MAIN MENU---------");
	System.out.println("write -1 to log out");
	System.out.println("more content coming soon ....");
	 n=scanner.next();
    }
}
public static void main(String arg[]) throws IOException
{
	Menu m= new  Menu();
	
}
}
