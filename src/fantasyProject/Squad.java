package fantasyProject;
import PlayerPackage.Player;

public class Squad {
	private Player[] goalKeeper= new Player[2];
	private Player[] Forward= new Player[5];
	private Player[] Defender= new Player[5];
	private Player[] Midfielder= new Player[3];
	private int goalKeeperC= 0;
	private int ForwardC= 0;
	private int DefenderC=0;
	private int MidfielderC=0;
	//restes the counters
	public void rester() {
		goalKeeperC= 0;
		ForwardC= 0;
		DefenderC=0; 
		MidfielderC=0;
	}   

	public  boolean insertGK(Player p,UserAccount user) { 
	    if(user.getWallet()< p.getPrice() || !p.getPostion().equals("gk") || goalKeeperC==2) return false;
	    user.setWallet(user.getWallet()-p.getPrice());
		this.goalKeeper[this.goalKeeperC]=p;  
		this.goalKeeperC+=1;
		return true;
	}
	//insert defender
	public  boolean insertDF(Player p,UserAccount user) {
		 if(user.getWallet()< p.getPrice() || !p.getPostion().equals("df") || DefenderC==5) return false;
		 user.setWallet(user.getWallet()-p.getPrice());
		this.Defender[this.DefenderC]=p;
		this.DefenderC+=1;
		return true;
	}
	//insert forward
	public  boolean insertFW(Player p,UserAccount user) { 
		 if(user.getWallet()< p.getPrice() || !p.getPostion().equals("fw") || ForwardC==3) return false;
		 user.setWallet(user.getWallet()-p.getPrice());
		this.Forward[this.ForwardC]=p;
		this.ForwardC+=1;
		return true;
	}
	//insert Midfielder
	public  boolean insertMID(Player p,UserAccount user) {
		 if(user.getWallet()< p.getPrice() || !p.getPostion().equals("md") || MidfielderC==5) return false;
		 user.setWallet(user.getWallet()-p.getPrice());
		this.Midfielder[this.MidfielderC]=p;
		this.MidfielderC+=1;
		return true;
	}
	//remove player then fix the array so that the last index is the empty one
	
	public void removegk(int index) { 
		this.goalKeeper[index]=null;
		this.goalKeeperC--;
		for(int i=index+1;i<2;i++) {
			goalKeeper[i-1]=goalKeeper[i];
			goalKeeper[i]=null;
		}
	}
	public void removeFW(int index) {
		this.Forward[index]=null;
		this.ForwardC--;
		for(int i=index+1;i<5;i++) {
			Forward[i-1]=Forward[i];
			Forward[i]=null;
		}
	}
	public void removeDF(int index) {
		this.Defender[index]=null;
		this.DefenderC--;
		for(int i=index+1;i<5;i++) {
			Defender[i-1]=Defender[i];
			Defender[i]=null;
		}
	}
	public void removeMID(int index) {
		this.Midfielder[index]=null;
		this.MidfielderC--;
		for(int i=index+1;i<3;i++) {
			Midfielder[i-1]=Midfielder[i];
			Midfielder[i]=null;
		}
	
	}
	
 public int SquadSize()
 {
	 int n=(this.goalKeeperC+this.ForwardC+this.MidfielderC+this.DefenderC);
	 return n;
 }

	
	
}
