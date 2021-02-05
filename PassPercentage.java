import java.util.ArrayList;
import java.util.Scanner;

public class PassPercentage {
ArrayList<Integer> ar = new ArrayList();
	
	public void addGradeDetails(int gradePoint) {
		ar.add(gradePoint);
	}
	
	public double getGPAScored() {
		double GPA = 0,den = 0,count =0;
		if(ar.isEmpty()) {
			System.out.println("No GradePoints Available");
		}
		else {
			for(int i=0; i<ar.size();i++) {
				double num = (ar.get(i)*3);
				count +=num;
			}
			den = ar.size()*3;
			GPA = count/den;
		}
		return GPA;
	}

	public static void main(String[] args) {
		int choice = 0;
		PassPercentage s1 = new PassPercentage();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Add GradePoint\n2. Calculate GPA \n3.Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: System.out.println("Enter the Gradepoint scored");
					int gp = sc.nextInt();
					s1.addGradeDetails(gp);
					break;
			case 2: System.out.println("GPA Scored:" + s1.getGPAScored());
				break;
			case 3: System.out.println("Thank you for using the application");
			}
		}while(choice ==1 || choice == 2);
	}
}
