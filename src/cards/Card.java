package cards;

public class Card {

	private int ownedBy = 0 ; //0 = board, 1= player1 2 = player2
	private int position = 0; //0=on board 1=in hand
	private int type; //0=property, 1 = money, 2 = action card
	private int value;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	private String name;
	
	
	public Card(int type,int value, String name) {
		this.type = type;
		this.value = value;
		this.name = name;
	}
	
	public void play(int p) {
		
	}
}
