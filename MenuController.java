package fantasyProject;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MenuController {
   private UserAccount account=new UserAccount();

   
   public UserAccount getAccount()
   {
	   return account;
   }
   public void callRegister() throws IOException
   {
	   Logger l= new Logger();
	   l.register();
   }
   public void callLogin(String s, String n) throws FileNotFoundException
   {
	   Logger l= new Logger();
	   account=l.login(s,n);
	   if(account==null)
	   {
		   System.out.println("Error wrong mail or password");
	   }
	   else
	   {
		   System.out.println("login successful");
	   }
   }
}
