package fantasyProject;
import java.io.IOException;
import java.util.Scanner;
public class Menu {
	MenuController mc= new MenuController() ;
public Menu() throws IOException
{
	System.out.println("Fantasy League");
	System.out.println("write 1 to sign up");
	System.out.println("write 2 to login");
	System.out.println("write -1 to exit");
	Scanner scanner = new Scanner(System.in);
	int n=0;
	while(n!=-1)
	{   n=scanner.nextInt();
		switch(n)
		{
		case 1:
			mc.callRegister();
			break;
			
		case 2:
			String mail=scanner.next();
			String pass=scanner.next();
			mc.callLogin(mail,pass);
			break;

		}
		System.out.println("THANKS U ");
	}
	

}

public static void main(String arg[]) throws IOException
{
	Menu m= new  Menu();
	
}
}
