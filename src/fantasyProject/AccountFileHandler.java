package fantasyProject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import PlayerPackage.Player;

public class AccountFileHandler {
public void writeName(String val, String loc) throws IOException
{
	File personal= new File(loc+"\\personalInfo.txt");
	FileOutputStream stream= new FileOutputStream(personal, true);
	stream.write(val.getBytes());
	String string="\n";
	stream.write(string.getBytes());
}

public void writeTeam(String val, String loc) throws IOException
{
	File personal= new File(loc+"\\personalInfo.txt");
	FileOutputStream stream= new FileOutputStream(personal, true);
	stream.write(val.getBytes());
	String string="\n";
	stream.write(string.getBytes());
}

public void writeWallet(int val, String loc) throws IOException
{
	File personal= new File(loc+"\\personalInfo.txt");
	String n=readFile(loc);
	n+=val+"\n";
	FileOutputStream stream= new FileOutputStream(personal, false);
	stream.write(n.getBytes());

}



public void writePassword(String val, String loc) throws IOException
{
	File personal= new File(loc+"\\personalInfo.txt");
	FileOutputStream stream= new FileOutputStream(personal, true);
	stream.write(val.getBytes());
	String string="\n";
	stream.write(string.getBytes());
}
public void writeSquad(Player play,String loc,int num) throws IOException {
	File personal= new File(loc+"\\squad\\player"+num+".txt");

	FileOutputStream stream= new FileOutputStream(personal, true);
	String val="";
	val+=play.getID();
	stream.write(val.getBytes());
	String string="\n";
	stream.write(string.getBytes());
	val=play.getName();
	stream.write(val.getBytes());
	stream.write(string.getBytes());
	val=play.getNation();
	stream.write(val.getBytes());
	stream.write(string.getBytes());
	val=play.getClub();
	stream.write(val.getBytes());
	stream.write(string.getBytes());
	val=play.getPostion();
	stream.write(val.getBytes());
	stream.write(string.getBytes());
	val="";
	val+=play.getPrice();
	stream.write(val.getBytes());

}


public String readName(String loc) throws FileNotFoundException
{
	File info= new File(loc+"\\personalInfo.txt");
	Scanner scan = new Scanner(info);
	String s=scan.nextLine();
	return s;
}


public String  readPassword(String loc) throws FileNotFoundException
{
	File info= new File(loc+"\\personalInfo.txt");
	Scanner scan = new Scanner(info);
	scan.nextLine();
	String s=scan.nextLine();
	return s;
}




public String readTeam(String loc) throws FileNotFoundException
{
	File info= new File(loc+"\\personalInfo.txt");
	Scanner scan = new Scanner(info);
	scan.nextLine();
	scan.nextLine();
	String s=scan.nextLine();
	return s;
}

public int readWallet(String loc) throws FileNotFoundException
{
	File info= new File(loc+"\\personalInfo.txt");
	Scanner scan = new Scanner(info);
	scan.nextLine();
	scan.nextLine();
	scan.nextLine();
	String s=scan.nextLine();
	return Integer.parseInt(s);
}


public String readFile(String loc) throws FileNotFoundException
{
	File info= new File(loc+"\\personalInfo.txt");
	String s="";
	Scanner scan = new Scanner(info);
	s+=scan.nextLine();
	s+="\n";
	s+=scan.nextLine();
	s+="\n";
	s+=scan.nextLine();
	s+="\n";
	return s;
}



}
