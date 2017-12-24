package cards;

import game.Player;

public class Rent extends Card{

	private String colour;
	private int cardsInSet;
	private int rent1;
	private int rent2;
	private int rent3;
	private int rent4;
	private int cardsOwned;


	public Rent(int value, int cardsInSet, String colour) {
		super(2,value,"Rent");
		this.cardsInSet = cardsInSet;
		this.colour = colour;

	}

	public int rentAmount(Property p, Player d) {
		if(d.numberOfCardsInSet(p) == 1) {
			return p.getRentOneCard();
		}
		else if(d.numberOfCardsInSet(p) == 2) {
			return p.getRentTwoCard();
		}
		else if(d.numberOfCardsInSet(p) == 3) {
			return p.getRentThreeCard();
		}
		else if(d.numberOfCardsInSet(p) == 4) {
			return p.getRentFourCard();
		}
		else {
			return 0;
		}


	}
}
