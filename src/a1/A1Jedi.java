package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int storeItemsAmount = scan.nextInt();
		String[] storeItems = new String[storeItemsAmount];
		int[] storeItemsAmountBought = new int[storeItemsAmount];
		int[] customersBought = new int[storeItemsAmount];
		
		for (int i = 0; i < storeItemsAmount; i++) {
			storeItems[i] = scan.next();
			scan.nextDouble();
		}
		
		int customers = scan.nextInt();
		
		for (int i = 0; i < customers; i++) {
			scan.next();
			scan.next();
			
			int itemsBought = scan.nextInt();
			
			for (int j = 0; j < itemsBought; j++) {
				int amountBought = scan.nextInt();
				String itemBought = scan.next();
				
				for (int k = 0; k < storeItems.length; k++) {
					if (storeItems[k].equals(itemBought)) {
						if (customersBought[k] <= i) {
							customersBought[k] = 1 + customersBought[k];
							if (customersBought[k] == 3) {
								customersBought[k] = 1;
							}
						}
						storeItemsAmountBought[k] = amountBought + storeItemsAmountBought[k];
					}
				}
				
			}
				
		}
		for (int i = 0; i < storeItems.length; i++) {
			if (customersBought[i] == 0) {
				System.out.println("No customers bought " + storeItems[i]);
			} else {
				System.out.println(customersBought[i] + " customers bought " + storeItemsAmountBought[i] + " " + storeItems[i]);
			}
		}
		
	}
}
