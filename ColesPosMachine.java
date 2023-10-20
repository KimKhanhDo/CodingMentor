package pos;

public class ColesPosMachine extends PosMachine {

	public ColesPosMachine() {
		super(5);
	}

	@Override
	public double calculateTotalPrice(double fruitWeight, double fruitPrice) {
		double totalPrice = Math.ceil((fruitWeight * fruitPrice) * 100.0) / 100;
		return totalPrice;
	}

	@Override
	public double discountPrice(double totalPrice, double discount) {
		double priceAfterDiscount = totalPrice * (1.0 - discount / 100);
		priceAfterDiscount = Math.ceil(priceAfterDiscount * 100) / 100;
		System.out.println("Apply discount price for Flybuys card with Coles membership");
		return priceAfterDiscount;
	}

	@Override
	public double calculateReturnMoney(double priceAfterDiscount, double moneyGiven) {
		if (moneyGiven < priceAfterDiscount) {
			System.out.println("Not enough money");
			return -1;
		}
		double returnMoney = Math.ceil((moneyGiven - priceAfterDiscount) * 100) / 100;
		System.out.println("You need to return to customer: " + returnMoney + "$");
		return returnMoney;
	}

	@Override
	public void thanksMessage() {
		System.out.println("Thank you for shopping at Coles");
	}

}
