import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileRenaming {

	public static String getRenameFile(String filename)
	{
		int length = filename.length();
		String res=null;
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2= new StringBuffer();
		StringBuffer sb3= new StringBuffer();
		if(length >= 7){
			if(filename.startsWith("DSC")){
				for(int index=3; index<5; index++){
					sb.append(filename.charAt(index));				
				}
				String sec_pat  =sb.toString();
				int sec = Integer.parseInt(sec_pat);
				
				for(int index=5; index<length; index++) {
					sb3.append(filename.charAt(index));
				}
				String third_pat = sb3.toString();
				int third = Integer.parseInt(third_pat);
				
				if(third == 0){
					System.out.println("Invalid file number");
				}
				else{
					switch(sec){
						case 1:res = "JAN_"+third;
							break;
						case 2:res = "FEB_"+third;
							break;
						case 3:res = "MAR_"+third;
							break;
						case 4:res = "APR_"+third;
							break;
						case 5:res = "MAY_"+third;
							break;
						case 6:res = "JUN_"+third;
							break;
						case 7:res = "JUL_"+third;
							break;
						case 8:res = "AUG_"+third;
							break;
						case 9:res = "SEP_"+third;
							break;
						case 10:res = "OCT_"+third;
							break;
						case 11:res = "NOV_"+third;
							break;
						case 12:res = "DEC_"+third;
							break;	
						default:
							System.out.println("Invalid month");
					}
				}
			}
				else{
					System.out.println("Invalid Input");
				}	
		}
		else{
			System.out.println("Invalid Input");
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name: ");
		String filename = sc.nextLine();

		System.out.println("Output is: "
				+ FileRenaming.getRenameFile(filename));

	}
}
