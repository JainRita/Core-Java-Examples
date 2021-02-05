import java.util.Scanner;

class MaximumSpeedExceedException extends Exception{
	
	public MaximumSpeedExceedException(String msg) {
		super(msg);
	}
}
public class VehicleSpeed {
	
	public static boolean validateVehicleSpeed(int vehiclespeed){
		try {
			if(vehiclespeed > 180) {
				throw new MaximumSpeedExceedException("Maximum Speed Exceeded");
			}
			else {
				System.out.println("Maintain the same speed");
			}
		}
		catch(MaximumSpeedExceedException e) {
			System.out.println("Maximum Speed Exceeded");
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter speed of the Vehicle(in km/hr): ");
		int vehiclespeed = sc.nextInt();
		
		validateVehicleSpeed(vehiclespeed);
	}

}
