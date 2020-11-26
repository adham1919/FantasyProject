package fantasyProject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Logger {
public void register() throws IOException
{   
	Scanner scan=new Scanner(System.in);
	String temp;
	AccountInfoIO account= new AccountInfoIO();
	System.out.println("please enter email");
	temp= scan.nextLine();
	File newfolder= new File("C:\\Users\\theda\\Documents\\FantasyDataBase\\"+temp);
	newfolder.mkdir();
	String location="C:\\Users\\theda\\Documents\\FantasyDataBase\\"+temp;
	File personalInfo= new File("C:\\Users\\theda\\Documents\\FantasyDataBase\\"+temp+"\\personalInfo.txt");
	personalInfo.createNewFile();
	System.out.println("please enter name");
	temp= scan.nextLine();
	account.writeName(temp,location);
	System.out.println("please enter password");
	temp= scan.nextLine();
	account.writePassword(temp,location);
	System.out.println("please enter Favourite team");
	temp= scan.nextLine();
	account.writeTeam(temp,location);
	
}

public UserAccount login(String mail,String password) throws FileNotFoundException
{
	UserAccount temp=null;
	AccountInfoIO accountinfo= new AccountInfoIO();
	File account= new File("C:\\Users\\theda\\Documents\\FantasyDataBase\\"+mail);
	if(account.exists())
	{
		if(password.equals(accountinfo.readPassword(account.toString())))
		{   String val;
			temp = new UserAccount();
			temp.setMail(mail);
			temp.setPass(password);
			temp.setTeam(accountinfo.readTeam(account.toString()));
			temp.setName(accountinfo.readName(account.toString()));
		}
	}
	return temp;
}


public void logout()
{
	
}
}
