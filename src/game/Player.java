package game;

import java.util.ArrayList;

import cards.Card;
import cards.Property;

public class Player {
	private ArrayList<Card> hand = new ArrayList<Card>();
	private ArrayList<Property> property = new ArrayList<Property>();
	private ArrayList<Card> money = new ArrayList<Card>();
	private int totalVal;
	
	public boolean checkCards() {
		if (hand.size() > 7) {
			return false;
		} else {
			return true;
		}
	}
	
	public int getTotalValue() {
		totalVal=0;
		for (Card card: property) {
			totalVal = totalVal+card.getValue();
		}
		for (Card card: money) {
			totalVal = totalVal+card.getValue();
		}
		return totalVal; 	
	}
	
	public void discard(Card c) {
		if(hand.contains(c)) {
			hand.remove(c);
		}
	}
	
	public int numberOfCardsInSet(Property p) {
		int count = 0;
		for (Property prop: property) {
			if(prop.getColour() == p.getColour()) {
				count++;
			}
		}
		return count;
	}
	
	

	
}
