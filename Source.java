import java.util.Scanner;
class Activity extends Exception{
	String string1 = "rita";
	String string2 = " ";
	String operator = "+";
	
	public Activity(String str1, String str2, String op) {
		this.string1 = str1;
		this.string2 = str2;
		this.operator = op;
	}
	
	public Activity(String msg) {
		System.out.println(msg);
	}
}

public class Source {
	
	public String handleException(Activity a) {
		try {
				if( a.string1.isEmpty() || a.string2.isEmpty()) {
					throw new Activity("Null Values Found");
				}
				if (!a.operator.equals("+") && !a.operator.equals("-")){
					throw new Activity("Worng Operator");
				}
				else {
					System.out.println("NO Exception Found");
				}
			}
		catch(Activity e) {
			System.out.println(e);
		}
		
		return "Handling Exception";
	}
	
	public String doOperation(Activity a) {
		switch(a.operator) {
		case "+" : System.out.println("Result: " + a.string1.concat(a.string2));
			break;
		case "-" : System.out.println("Result: " + a.string1);
			break;
		}
		return a.operator;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String str1 = sc.nextLine();
		System.out.println("Enter string 2: ");
		String str2 = sc.nextLine();
		System.out.println("Enter operator: ");
		String op = sc.nextLine();

		Activity act = new Activity(str1, str2, op);
		Source s1 = new Source();
		s1.handleException(act);
		s1.doOperation(act);
	}

}
