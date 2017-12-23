package game;

import java.util.ArrayList;

import cards.Card;

public class Player {
	private ArrayList<Card> hand = new ArrayList<Card>();
	private ArrayList<Card> property = new ArrayList<Card>();
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
	
	

	
}
