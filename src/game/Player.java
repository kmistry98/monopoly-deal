package game;

import java.util.ArrayList;
import java.util.Random;

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
	
	public int numberOfCardsInSet(String colour) {
		int count = 0;
		for (Property prop: property) {
			if(prop.getColour() == colour) {
				count++;
			}
		}
		return count;
	}
	public ArrayList<Card> getHand() {
		return hand;
	}

	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}
	
	public void assignCards(int a, Player p, Deck d) {
		for(int i=a;i<a;i++) {
			Random rand = new Random();
			int b = rand.nextInt(d.getDeck().size())+0;
			Card card = d.getDeck().get(b);
			d.getDeck().remove(b);
			p.getHand().add(card);
		}
	}
	
	

	
}
