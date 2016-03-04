import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class SalaryComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter your wage");
		double wage= Double.parseDouble(scanner.next());
		System.out.println("Enter your hours:");
		double hours=Double.parseDouble(scanner.next());
		
		double netPay=wage*hours;
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
		
		String payFormatted = formatter.format(netPay);
		
			System.out.println("you are awarded" + payFormatted);
			
		
		
		
		
	}

}
