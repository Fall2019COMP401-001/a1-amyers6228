package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int totalItems = scan.nextInt();
		
		String[] storeStock = new String[totalItems];
		
		double[] storeStockPrice = new double[totalItems];
		
		for (int i = 0; i < storeStock.length; i++) {
			storeStock[i] = scan.next();
			storeStockPrice[i] = scan.nextDouble();
	
		}
		int amountCustomers = scan.nextInt();
		
		String[] customers = new String[amountCustomers];
		double[] customersTotals = new double[amountCustomers];
		
		for (int i = 0; i < customers.length; i++) {
			customers[i] = scan.next() + " " + scan.next();
			int items = scan.nextInt();
			double total = 0;
			
			for (int j = 0; j < items; j++) {
				int quantity = scan.nextInt();
				String itemBought = scan.next();
				int index = 0;
				
				for (int k = 0; k < storeStock.length; k++) {
					if (storeStock[k].equals(itemBought)) {
						index = k;
					}
				}
				
				double itemBoughtPrice = storeStockPrice[index];
				total = (quantity * itemBoughtPrice) + total;
				customersTotals[i] = total;
			}
			
		}
		double biggestPrice = 0;
		int index = 0;
		
		for (int i = 0; i < customers.length; i++) {
			if (customersTotals[i] > biggestPrice) {
				biggestPrice = customersTotals[i];
				index = i;
			}
		}
		System.out.println("Biggest: " + customers[index] + " (" + String.format("%.2f", customersTotals[index]) + ")");
		
		double smallestPrice = 9999999;
		for (int i = 0; i < customers.length; i++) {
			if (customersTotals[i] < smallestPrice) {
				smallestPrice = customersTotals[i];
				index = i;
			}
		}
		System.out.println("Smallest: " + customers[index] + " (" + String.format("%.2f", customersTotals[index]) + ")");
		double fullTotal = 0;
		for (int i = 0; i < customers.length; i++) {
			fullTotal = fullTotal + customersTotals[i];
		}
		System.out.println("Average: " + String.format("%.2f", fullTotal / (customers.length)));
		
		
	}
}
