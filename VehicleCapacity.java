import java.util.Scanner;

class PetrolOverflowException extends Exception{
	
	public PetrolOverflowException(String msg) {
		super(msg);
	}
}
public class VehicleCapacity {
	
	public static boolean validatePetrolUsage(int petrolUsage) {
		try {
			if(petrolUsage > 120) {
				throw new PetrolOverflowException("Petrol Tank Overflowed");
			}
			else {
				System.out.println("Petrol would be Sufficient");
			}
		}
		catch(PetrolOverflowException e) {
			System.out.println("Petrol Tank Overflowed");
		}
		 
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter petrol available in Vehicle(in ltr): ");
		int s1 = sc.nextInt();
		
		System.out.println("Enter petrol to be filled in Vehicle(in ltr): ");
		int s2 = sc.nextInt();
		
		int petrolUsage = s1 + s2;
		validatePetrolUsage(petrolUsage);
	}

}
