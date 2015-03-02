import java.util.Scanner;

public class Calc {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		double InitialTuition;
		double Rate;
		double Final;
		double LastYear;
		boolean IsScanning = true;
		
		while( IsScanning == true){
			System.out.print("Please Enter Inital Tuition Cost: ");
			InitialTuition = input.nextDouble();
			System.out.print("Please Enter Percentage Increase: ");
			Rate = input.nextDouble();
			Final = InitialTuition;
			LastYear = InitialTuition;
			
			for(int Year=1; Year < 4; Year++){
				Final = (Final + (LastYear + ((LastYear / 100) * Rate)));
				LastYear = (LastYear + ((LastYear / 100) * Rate));
			}
			System.out.print("The Cost Of Four Years Will Be:" + Final);
			
			break;
		}
		input.close();

	}
}
