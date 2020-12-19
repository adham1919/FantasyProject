package fantasyProject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
//COMMENT TO CHECK
public class Logger {
public void register(UserAccount ua) throws IOException
{   
	String temp;
	AccountInfoIO account= new AccountInfoIO();
	String location="FantasyDatabase\\"+ua.getMail();
	File newfolder= new File(location);
	newfolder.mkdir();
	File personalInfo= new File(location+"\\personalInfo.txt");
	personalInfo.createNewFile();
	temp= ua.getName();
	account.writeName(temp,location);
	temp= ua.getPass();
	account.writePassword(temp,location);
	temp= ua.getTeam();
	account.writeTeam(temp,location);
	
}

public UserAccount login(UserAccount us) throws FileNotFoundException
{
	UserAccount temp=null;
	AccountInfoIO accountinfo= new AccountInfoIO();
	String mail=us.getMail();
	String password = us.getPass();
	File account= new File("FantasyDataBase\\"+mail);
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
