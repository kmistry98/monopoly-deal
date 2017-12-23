package cards;

public class Property extends Card{
	private String colour;
	private int value;
	private int rentOneCard;
	private int rentFullSet;
	private static String name;
	

	public Property(String name, int value, int rentOneCard, int rentFullSet, String colour) {
		super(0, value, name);
		this.rentOneCard = rentOneCard;
		this.rentFullSet = rentFullSet;
		this.colour = colour;
	}
	
	
	
}
