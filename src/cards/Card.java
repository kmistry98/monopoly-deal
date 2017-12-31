package cards;

import java.util.ArrayList;

import game.Player;

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
	
	public void play(Player p) {
		
	}
	public String getName() {
		return name;
	}

	public Card(int type,int value, String name) {
		this.type = type;
		this.value = value;
		this.name = name;
	}
	
//	public void play(Player p, Deck d) {
//		
//	}
	public void transferCard(Card c, Player p1, Player p2) {
		if(c.getType() == 0) {
			p1.getProperty().remove(c);
			p2.getProperty().add((Property) c);
		}
		else {
			p1.getMoney().remove(c);
			p2.getMoney().add(c);
		}
	
	}

	
	public int getType() {
		return type;
	}

	public String toString() {
		return name;
	}
	
}
