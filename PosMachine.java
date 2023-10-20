package pos;

public abstract class PosMachine {

	double fruitWeight;
	double fruitPrice;
	double discount;

	public PosMachine(double discount) {
		this.discount = discount;
	}

	public abstract double calculateTotalPrice(double fruitWeight, double fruitPrice);

	public abstract double discountPrice(double totalePrice, double discount);

	public abstract double calculateReturnMoney(double totalPrice, double moneyGiven);

	public void thanksMessage() {
		System.out.println("Thank you for shopping with us");
	}

	public static PosMachine getMebershipCardFromCustomer(String supermarketName) {
		switch (supermarketName) {
		case "Coles": {
			return new ColesPosMachine();
		}
		case "Woolies": {
			return new WoolliesPosMachine();
		}
		}
		return null;

	}
}
