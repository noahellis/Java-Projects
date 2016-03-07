import java.util.Scanner;
public class Player {
	Scanner keyboard= new Scanner(System.in);
	
	String name;
	boolean stillAlive;
	int playerHealth;
	
	public Player(String Name, boolean StillAlive, int PlayerHealth){
		name = Name;
		stillAlive = StillAlive;
		playerHealth = PlayerHealth;
	}
	
	public void Dead()
	{	
		
		if (playerHealth<=0)
			stillAlive = false;
			System.out.println("You have died");
			System.exit(0);}
						
	public int takeDamage()
	{
		playerHealth=playerHealth-=10;
		//System.out.println(playerHealth);
		return playerHealth;
	}
		
	}


