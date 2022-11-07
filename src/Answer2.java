import java.util.Scanner;

public class Answer2 {

	public static void main(String[] args) {
		println("Welcome to the Download Time Estimator \n");
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			print("Enter file size (MB): ");
			int fSize = sc.nextInt();
			
			print("Enter the download speed (MB/sec): ");
			int dSpeed = sc.nextInt();
			
			
			int rawSeconds = fSize/dSpeed;
			int seconds = rawSeconds%60;
			int minutes = rawSeconds/60%60;
			int hours = rawSeconds/3600;
			
			print(String.format(
				"This download will take approximately %s hours %s minutes %s seconds \n\n", 
				hours, 
				minutes, 
				seconds
			));
			
			print("Continue? (y/n): ");
			String continueRes = sc.next();
			continueRes = continueRes.toLowerCase();
			
			print("\n\n");
			
			if(continueRes.equals("n")) break;
		}

	}
	
	
	
	public static void println(Object str) {
		print(str + "\n");
	}
	
	public static void print(Object str) {
		System.out.print(str);
	}

}
