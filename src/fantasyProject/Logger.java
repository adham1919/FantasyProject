package fantasyProject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import PlayerPackage.Player;
//COMMENT TO CHECK
public class Logger {
public UserAccount register(UserAccount ua) throws IOException
{   
	String temp;
	AccountFileHandler account= new AccountFileHandler();
	String location="FantasyDatabase\\Users\\"+ua.getMail();
	File newfolder= new File(location);
	newfolder.mkdir();
	File personalInfo= new File(location+"\\personalInfo.txt");
	File Squad= new File(location+"\\squad");
	Squad.mkdir();
	personalInfo.createNewFile();
	temp= ua.getName();
	account.writeName(temp,location);
	temp= ua.getPass();
	account.writePassword(temp,location);
	temp= ua.getTeam();
	account.writeTeam(temp,location);
	int tem=100;
	account.writeWallet(tem,location);
	return ua;
	
}

public UserAccount login(UserAccount us) throws FileNotFoundException
{
	UserAccount temp=null;
	AccountFileHandler accountinfo= new AccountFileHandler();
	String mail=us.getMail();
	String password = us.getPass();
	File account= new File("FantasyDataBase\\Users\\"+mail);
	if(account.exists())
	{
		if(password.equals(accountinfo.readPassword(account.toString())))
		{   String val;
			temp = new UserAccount();
			temp.setMail(mail);
			temp.setPass(password);
			temp.setTeam(accountinfo.readTeam(account.toString()));
			temp.setName(accountinfo.readName(account.toString()));
			temp.setWallet(accountinfo.readWallet(account.toString()));
		}
	}
	return temp;
}


public UserAccount logout(UserAccount us)
{
	return null;
}
}
