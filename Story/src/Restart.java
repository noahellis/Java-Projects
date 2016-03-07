

	import java.util.Scanner; 

	public class Restart { 
	public static void main(String[] args) { 
	boolean okContinue = true; 

	do { 

	Scanner scan = new Scanner(System.in); 
	System.out.println("Would you like to play again?"); 
	String response = scan.nextLine(); 
	if (response.toLowerCase().startsWith("n")) { 
	okContinue = false; 
	} 
	} while (okContinue); 

	System.out.println("Thank you for playing the game. Have a good day."); 

	System.exit(0); 
	} 
	}


