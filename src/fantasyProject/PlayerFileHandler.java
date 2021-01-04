package fantasyProject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import PlayerPackage.Player;
public class PlayerFileHandler {
	public void addToSys(Player p) throws IOException {
		String location="fantasyDatabase\\Players\\"+p.getID();
		File player=new File(location);
		player.mkdir();
		File personal= new File(location+"\\personalinfo.txt");
		FileOutputStream stream= new FileOutputStream(personal, true);
		stream.write((p.getName()+"\n").getBytes());
		stream.write((p.getClub()+"\n").getBytes());
		stream.write((p.getNation()+"\n").getBytes());
		stream.write((p.getPostion()+"\n").getBytes());
		p.setPrice(5);
		stream.write((p.getPrice()+"\n").getBytes());
        stream.close();

	}
	public boolean removeFromSys(Player p) {
		String location="fantasyDatabase\\Players\\"+p.getID();
		File player=new File(location);
		if(!player.exists()) System.out.println("SSS");
		File personal= new File(location+"\\personalinfo.txt");
		personal.delete();
		player.delete();
		return true;
	}
	
	public Player getPlayerFromSys(Player p) throws FileNotFoundException {
		String location="fantasyDatabase\\Players\\"+p.getID();
		File player=new File(location);
		File personal= new File(location+"\\personalinfo.txt");
		Scanner scan = new Scanner(personal);
		String s;
		s=scan.nextLine();
		p.setName(s);
		s=scan.nextLine();
		p.setClub(s);
		s=scan.nextLine();
		p.setNation(s);
		s=scan.nextLine();
		p.setPostion(s);
		s=scan.nextLine();
		p.setPrice(Integer.parseInt(s));
		return p;

	
	}
}
