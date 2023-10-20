package pos;

import java.util.Scanner;

public class MainPos {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Scan user membership card");
		String supermarketMembership = scanner.nextLine();

		PosMachine service = PosMachine.getMebershipCardFromCustomer(supermarketMembership);

		System.out.println("Enter weight of apples: ");
		double fruitWeight = scanner.nextDouble();
		System.out.println("Enter apple's price: ");
		double fruitPrice = scanner.nextDouble();

		// Calculate the total price
		double totalPrice = service.calculateTotalPrice(fruitWeight, fruitPrice);
		System.out.println("Total Price: " + totalPrice);

		// Price after discount
		double discount = service.discount;
		double discountPrice = service.discountPrice(totalPrice, discount);
		System.out.println("Price after discount: " + discountPrice);

		// Calculate the return money when a customer pays
		System.out.println("Receive money from customer: ");
		double moneyReceived = scanner.nextDouble();

		service.calculateReturnMoney(discountPrice, moneyReceived);

		service.thanksMessage();
	}

}
