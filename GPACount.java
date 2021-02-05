import java.util.Scanner;
public class GPACount {
	static int grade;
	static int a[] = new int[5];
	
	public void addGradeDetails(int grade){
		int sum = 0;
		int total = a.length;
       
    	for (int k = 0; k < a.length; k++) {
    	    if (a[k] > 49) {
    	          sum += a[k];
    	    }
    	}
	}
	
	public double getGPAScored(double grade){
		if(a[(int) grade] == 0) {
			System.out.println("No marks entered");
		}
		else {
			double m=0,q=0;
			for (int i = 0; i < a.length; i++){
				m =a[(i)] * 3;
				q+=m;
			}
			double n= a.length;
			double o= q /(n*3);
			System.out.println("GPAScored: "+ o);
		}
		
		return (double) grade;
	}

	public static void main(String[] args) {
		System.out.println("To Calculate GPA for current semester select \n");
		int choice = 0;
		do { 
			System.out.println("1. Add GradePoint \n2.Calculate GPA \n3.Exit");	
		GPACount d1 = new GPACount();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		
		switch(choice) {
			case 1: for (int i = 0; i < a.length; i++){
		        		System.out.println("Enter the GPA scored: ");
		        			a[i] = sc.nextInt();
		        			d1.addGradeDetails(a[i]);
		        			}
				break ;
					
			case 2: d1.getGPAScored(grade);
			break;
			case 3: System.out.println("Thank you for using the application");
			break;
		}		
		}
		while( choice == 1 || choice == 2);	
	}
}
