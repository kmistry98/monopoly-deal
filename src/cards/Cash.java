package cards;

public class Cash extends Card{


	private static String name = "Cash";
	private int value;
	
	public Cash(int value) {
		super(1,value, name);
	}
}
