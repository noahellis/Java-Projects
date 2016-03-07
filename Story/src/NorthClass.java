import java.util.Scanner;


public class NorthClass {
	
	
		
		Scanner keyboard= new Scanner(System.in);
		
		public void TurnOnLight(){
			String Choice= keyboard.next();
			System.out.println("you are in a dark room.");
			System.out.println(" ");
			System.out.println("Do you turn on a light?");
			System.out.println("> ");
			
			Choice= keyboard.next();
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
		}
		
		public void StartStory(){
			System.out.println("You see a door in North Wall.");
			System.out.println("You try the North Door, but it is locked");
			System.out.println(" ");
			System.out.println("Do you try to kick it open or knock on the door?");
			System.out.println(" ");
			System.out.println("Enter kick to kick door open or knock to knock on the door");
			System.out.println("> ");
			
			String Choice = keyboard.next();	
			switch(Choice){
			
				case "kick" :
				System.out.println("You feel some resistance, and hear something fall on the other side."
						+ "You look through the now open door, and see a person has been knocked out. He had a knife." );
					break;
				case "knock" :
					System.out.println("A madman opens the door and pounces before you know what has happened. He plunges the knife he is holding to the "
							+ "hilt directly into your heart. The last thing you see are his eyes, inched from yours, which look almost sad.");
					System.exit(0);
			}			
		}
		
		public void knife (){
			System.out.println("Do you take the knife?");
			System.out.println(" ");
			System.out.println("Enter yes to take the knife, no to leave the knife");
			System.out.println("> ");
			
			String Choice= keyboard.next();
			switch(Choice){
			
			case "yes":
				
				System.out.println("you took the knife");
				System.out.println("Good call, you may need it. After all, there was a guy outside with it, and you don't know his intentions. You continue down the path, the trees on either side growing thicker and thicker. You eventually come to an area where the trees are too thick to walk through, and the only way forward is through some vines. "
						+ "Do you cut through them or turn back?" );
				
				System.out.println("enter cut through or turn back");
				System.out.println(" ");
				System.out.println(">");
				
				withKnife();
				break;
			case "no": 
					System.out.println ("Good call. You look clumsy, and  might trip and stab yourself.  You wander through the woods for a while, eventually it"
							+ " becomes so thick you can only go forward and the way   "
							+ "you came. You come to a dead end, but see light through the vines across the path. What do you do?");}		
					System.out.println (" ");					
					System.out.println("Do you try to push through or go back the way you came?");
					System.out.println("Enter push through or go back");
					System.out.println("> ");
					withoutKnife();
					}				
							
					
		public void withKnife (){
		
					String Choice = keyboard.next ();
					Choice= keyboard.next();
					
					if (Choice.equals("cut through")){
						System.out.println("You start to cut through the vines. Halfway through, you hear a rustling behind you. "
								+ "You turn quickly, brandishing the knife.  You see the man that was knocked out outside of the building. "
								+ "He looks at the knife in your hand, turns and walks away.  He won't be bothering you. You return to cutting the vines, "
								+ "and work through. There is another trail behind it, and you follow it until you come to a waist high fence.  You hop it, "
								+ "and continue on. You look back to see a “No Trespassing” sign on the fence. You keep walking until you come to a road, and "
								+ "flag down a passing motorist. He gives you a ride to a police station in a town you've never seen....          "
								+ "To be continued.....");
						System.exit(0);
						
	
					}else if(Choice.equals("turn back")){
						System.out.println("You see the man that you knocked out standing looking timid outside the building you left. "
								+ "I guess the knife in your hand makes him a little less confident");
						System.out.println("You return to the building and see for the first time that it is relatively small. Essentially just a hut. "
								+ "You walk around the hut, see just the door and no windows.  There is a trail north that you just came from, a dead end.  "
								+ "There is a paved path west of the hut. You decide to take it");
						System.out.println("You follow the paved path west. You see a car, and  a footpath running perpendicular to the paved path.  "
								+ "Do you take the car or take the foot path?");
						System.out.println("Enter take car to take the car, or take foot path to take the foot path");
						westPath();
						}
		}
		
	public void westPath (){	
		
			String Choice=keyboard.next();
			switch(Choice){
				case "take car":
					System.out.println("You turn the key, and instantly feel Intense heat on your face, but not for long.  "
							+ "The car was rigged to explode. Your  charred corpse is never found.");
					System.exit(0);
				case "take path":
					System.out.println("You follow the path, which winds, climbs, and descends. It is one of the most arduous climbs of your "
							+ "life, but eventually you  hear the sound of cars on a highway.  You  find the highway, and flag down a car. "
							+ "This good Samaritan gives you a ride to the local police  department. After giving a statement, you are released... "
							+ "But where are you? You've never been here before... To be continued.");
					System.exit(0);
										
	}
	}	
							
				public void withoutKnife(){
				
					String Choice=keyboard.next();
					Choice= keyboard.next();
					switch(Choice){
					
					case "push through":
						System.out.println("You get your head and shoulders through before you get stuck. As you struggle, you feel something pulling your legs. "
								+ "You look back through the vines to see the person with the knife pulling you.  Do you try to fight him off or push through "
								+ "the vines?");
						break;
					
					case "go back":
						System.out.println("You turn to go back to the building, and stop when you notice the guy with the knife in the path. ");
						break;
					
						
					}
						
	}
					
				
	
	}
	
			

