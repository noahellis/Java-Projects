import java.util.Scanner;

public class StoryOutline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		public class Player
		{
			Scanner keyboard= new Scanner(System.in);
			String Name;
			boolean stillAlive;
			int playerHealth;
			public Dead();
			{	
				stillAlive=false;
						if (playerHealth<=0)
							System.out.println("You have died");
							System.exit(0);}
								
			public takeDamage()
			{
				playerHealth=playerHealth-=10;
				System.out.println(playerHealth);
				
			}
				
			}
		

				
			Scanner keyboard= new Scanner(System.in);
			
			
			System.out.println("you are in a dark room.");
			System.out.println(" ");
			System.out.println("Do you turn on a light?");
			System.out.println("> ");
			String Choice= keyboard.next();
			switch(Choice){
			
				case "yes":
					System.out.println("Good choice. Nobody likes a dark room.");
					break;
				case "no":
					System.out.println("Why not? We'll turn in on anyway...weirdo");
					break;
				default:
					System.out.println("Invalid Response...I'll go ahead and turn it on...weirdo");
				
			}
			
			System.out.println("You see a door in North Wall, and One in South Wall. Which one will you take?");
			System.out.println(" ");
			System.out.println("Which door would you like to take? Enter North for North Door or South for South Door");
			System.out.println("> ");
				switch(Choice) {
				case "north, North":
					Class.forName("NorthClass");
					
					
					
				}
			
	}
	}


