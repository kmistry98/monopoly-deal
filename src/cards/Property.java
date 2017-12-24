package cards;

public class Property extends Card{

	private static String name;
	private String colour;
	private int value;
	private int rentOneCard;
	private int rentTwoCard;
	private int rentThreeCard;
	private int rentFourCard;
	

	public Property(String name, int value, int rentOneCard, int rentTwoCard, String colour) {
		super(0, value, name);
		
		this.rentOneCard = rentOneCard;
		this.rentTwoCard = rentTwoCard;
		this.colour = colour;
	}
	
	public Property(String name, int value, int rentOneCard,int rentTwoCard, int rentThreeCard, String colour) {
		super(0, value, name);
		
		this.rentOneCard = rentOneCard;
		this.rentThreeCard = rentThreeCard;
		this.rentTwoCard = rentTwoCard;
		this.colour = colour;
	}
	public Property( String name, int value, int rentOneCard,int rentTwoCard, int rentThreeCard, int rentFourCard, String colour) {
		super(0, value, name);
		
		this.rentOneCard = rentOneCard;
		this.rentTwoCard = rentTwoCard;
		this.rentThreeCard = rentThreeCard;
		this.rentFourCard = rentFourCard;
		this.colour = colour;
	}
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getRentOneCard() {
		return rentOneCard;
	}

	public void setRentOneCard(int rentOneCard) {
		this.rentOneCard = rentOneCard;
	}

	public int getRentTwoCard() {
		return rentTwoCard;
	}

	public void setRentTwoCard(int rentTwoCard) {
		this.rentTwoCard = rentTwoCard;
	}

	public int getRentThreeCard() {
		return rentThreeCard;
	}
	public int getRentFourCard() {
		return rentFourCard;
	}

	public void setRentThreeCard(int rentThreeCard) {
		this.rentThreeCard = rentThreeCard;
	}




	
	
	
}
