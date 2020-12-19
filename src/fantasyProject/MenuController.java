package fantasyProject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MenuController {
   private UserAccount account=new UserAccount();

   
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
		AccountInfoIO account= new AccountInfoIO();
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
	    l.register(tmpAccount);
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
}
