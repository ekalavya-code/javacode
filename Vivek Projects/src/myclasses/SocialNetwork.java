package myclasses;

public class SocialNetwork {
	private String name;
	StringBuilder sb = new StringBuilder();
	
	public SocialNetwork(String name)
	{
		this.name = name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void addFriend(String name)
	{
		sb.append(" "+name);
	}
	public void deleteFriend(String name)
	{
		int i = sb.indexOf(name);
		if(i!=0)
		{
			sb.delete(i, i+name.length());
		}
	}
	public StringBuilder getFriendsList()
	{
		return sb;
	}
	public static void main(String[] args) {
		SocialNetwork sn = new SocialNetwork("Vivek");
		sn.addFriend("Ram");
		sn.addFriend("Geethu");
		sn.addFriend("Kumar");
		
		System.out.println(sn.getFriendsList());
		
		sn.deleteFriend("Geethu");
		System.out.println(sn.getFriendsList());
	}

}
