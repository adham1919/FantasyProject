package fantasyProject;

public class UserAccount {
	private String name;
	private String pass;
	private String favTeam;
	private String mail;
    public void setName(String s)
    {
    	name=s;
    }
    
    public void setPass(String s)
    {
    	pass=s;
    }
    
    
    public void setMail(String s)
    {
    	mail=s;
    }
    
    public void setTeam(String s)
    {
    	favTeam=s;
    }
    
    public String getMail()
    {
    	return mail;
    }
    public String getName()
    {
    	return name;
    }
    public String getPass()
    {
    	return pass;
    }
    public String getTeam()
    {
    	return favTeam;
    }

}
