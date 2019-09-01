package a1;

import java.util.Scanner;

public class A1Novice {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int count = scan.nextInt();
		
		for (int i = 1; i <= count; i++) {
			
			double total = 0;
			char first = scan.next().charAt(0);
			String last = scan.next();
			int items = scan.nextInt();
			
			
			for (int e = 1; e <= items; e++) {
				int amount = scan.nextInt();
				scan.next();
				double price = scan.nextDouble();
				double subtotal = (amount * price);
				total = total + subtotal;
				
			}
			System.out.println(first + ". " + last + ": " + String.format("%.2f",  total));
		}
	}
}
