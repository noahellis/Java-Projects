import java.text.NumberFormat;
import java.util.Locale;


public class OvertimeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double OvertimeA;
		double OvertimeB;
		double WorkerARate;
		double WorkerBRate;
		double WorkerAHours;
		double WorkerBHours;
		double StandardA;
		double StandardB;	
		WorkerARate= 17.24d;
		WorkerBRate= 23.34d;
		WorkerAHours= 34d;
		WorkerBHours= 47d;
		
		if (WorkerAHours >40){
			OvertimeA= (WorkerARate * 40) + (WorkerAHours - 40) * (WorkerARate * 1.5);
			System.out.println(OvertimeA);
		}else{
			StandardA=WorkerAHours * WorkerARate;
			System.out.println(StandardA);
		}
					
		if (WorkerBHours >40){
			OvertimeB= (WorkerBRate * 40) + (WorkerBHours - 40) * (WorkerBRate * 1.5);
			System.out.println(OvertimeB);
		}else{
			StandardB=WorkerBHours * WorkerBRate;
			System.out.println(StandardB);
		}
	}
}
	