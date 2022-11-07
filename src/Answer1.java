import java.util.Scanner;

public class Answer1 {
	public static void main(String [] args) {
		double invoiceTotal = 0;
		double discountTotal = 0;
		int invoiceCount = 0;
		
		print("Welcome to the Invoice Total Calculator \n\n");
		
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			print("Enter subtotal: ");
			int subtotal = sc.nextInt();
			
			print("Discount percent: ");
			double dsPercent = sc.nextDouble();
			
			double discount = subtotal * dsPercent;
			double invoice = subtotal - discount;
			
			println(String.format("Discount amount: %s", discount));
			println(String.format("Invoice total: %s\n\n", invoice));
			
			invoiceCount++;
			invoiceTotal+=invoice;
			discountTotal+=discount;
			
			
			print("Continue? (y/n): ");
			String continueRes = sc.next();
			continueRes = continueRes.toLowerCase();
			
			print("\n\n");
			
			if(continueRes.equals("n")) break;
			
		}
		
		println(String.format("Number of invoices: %s", invoiceCount));
		println(String.format("Average invoice: %s", invoiceTotal/invoiceCount));
		println(String.format("Average invoice: %s", discountTotal/invoiceCount));
		 
	}
	
	public static void println(Object str) {
		print(str + "\n");
	}
	
	public static void print(Object str) {
		System.out.print(str);
	}
}
