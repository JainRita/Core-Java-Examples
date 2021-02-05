import java.util.Scanner;
public class AcidIdentify {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the chemical formula");
		String a =sc.next();
		
		if(a.length() > 6) {
			System.out.println("Invalid Input");
		}
		
		else {
			
			if(a.startsWith("C")) {
				
				if(Character.isDigit(a.charAt(1))) {
					
					char c=a.charAt(2);
					if(c=='H') {
						
						if(Character.isDigit(a.charAt(3))) {
							
							char ch=a.charAt(4);
							if(ch=='O') {
								
								if(Character.isDigit(a.charAt(5))) {
									
									switch(a) {
										case "C2H4O2": System.out.println("Acetic Acid");
										break;
										case "C3H4O3": System.out.println("Pyruvic Acid");
										break;
										case "C3H6O3": System.out.println("Lactic Acid");
										break;
										case "C6H8O6": System.out.println("Ascorbic Acid");
										break;
										case "C6H8O7": System.out.println("Citric Acid");
										break;
										case "C7H6O2": System.out.println("Benzoic Acid");
										break;
										case "C9H8O4": System.out.println("Aspirin");
										break;
										default: System.out.println("Acid Not Found");
										break;
									}
								}
								else {
									System.out.println("Invalid Oxygen Count");
								}
							}
							else {
								System.out.println("Invalid Oxygen Symbol");
							}
						}
						else {
							System.out.println("Invalid Hydrogen Count");
						}
					}
					else {
						System.out.println("Invalid Hydrogen Symbol");
					}
				}
				else {
					System.out.println("Invalid Carbon Count");
				}			
			}
			else {
				System.out.println("Invalid Carbon Symbol");
			}
		}
		sc.close();
	}
}
