package cards;

public class Rent extends Card{
	
	private String colour;
	private int cardsInSet;
	private int rent1;
	private int rent2;
	private int rent3;
	private int rent4;
	private int cardsOwned;
	
	
	public Rent(int value, int cardsInSet) {
		super(2,value,"Rent");
		this.cardsInSet = cardsInSet;
		
	}
	
	
}
