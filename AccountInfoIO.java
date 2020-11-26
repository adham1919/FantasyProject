package fantasyProject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class AccountInfoIO {
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


public void writePassword(String val, String loc) throws IOException
{
	File personal= new File(loc+"\\personalInfo.txt");
	FileOutputStream stream= new FileOutputStream(personal, true);
	stream.write(val.getBytes());
	String string="\n";
	stream.write(string.getBytes());
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
}
