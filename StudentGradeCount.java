import java.util.*;

public class StudentGradeCount {
	static HashMap<String, Character> hmap = new HashMap<>();
	static Scanner sc = new Scanner(System.in);
	static String rollNumber;
	static char securedGrade;
	
	public void addStudentDetails (String rollNumber,char securedGrade) {
            hmap.put(rollNumber, securedGrade);
	}
	public int findCountofStudents(char securedGrade) {
		int count = 0;
		if(securedGrade == 0) {
			System.out.println("No student found");
		}
		else {
			System.out.println("Enter the grade to find the count of students");
			char ch = sc.next().charAt(0);
			int counter = 0;
			for(Character value : hmap.values()) {            // iterate through all the keys in this HashMap
			    if(value.equals(ch)) {  // if a key maps to the string you need, increment the counter
			        counter++;
			    }
			}
			System.out.println(counter); 
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("To Calculate GPA for current semester select \n");
		int choice = 0;
		do { 
				System.out.println("1. Add Student Details \n2. Find the count of Student \n3. Exit");	
				StudentGradeCount d1 = new StudentGradeCount();
				
				System.out.println("Enter your choice");
				choice = sc.nextInt();
				
				switch(choice) {
					case 1: for (int i = 0; i < 4; i++) {
					            System.out.println("Enter the student roll_no");
					            rollNumber = sc.next();
					            System.out.println("Enter the grade secured");
					            securedGrade = sc.next().charAt(0);
								d1.addStudentDetails(rollNumber, securedGrade);
					}
							break;
					case 2: d1.findCountofStudents(securedGrade);
							break;
					case 3: System.out.println("Thank you for using the application");
							break;
			}
		}
		while( choice == 1 || choice == 2);	
	}

}
