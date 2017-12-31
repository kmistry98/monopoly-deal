package game;

import java.util.ArrayList;
import java.util.Random;

import cards.Card;
import cards.PassGo;
import cards.Property;

public class Player {
	private ArrayList<Card> hand = new ArrayList<Card>();


	private ArrayList<Property> property = new ArrayList<Property>(); //type 0
	private ArrayList<Card> money = new ArrayList<Card>();  //type 1
	private int totalVal;
	private Deck deck;
	
	public Player(Deck d) {
		this.deck = d;
	}
	
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

	
	public ArrayList<Property> getProperty() {
		return property;
	}
	
	public ArrayList<String> getPropertyAsString(){
		ArrayList<String> arr = new ArrayList<String>();
		for(Property prop: property) {
			arr.add(prop.getName());
		}
		if(arr.isEmpty()) {
			arr.add("No properties put down yet!");
			return arr;
		}
		return arr;
	}
	
	public ArrayList<String> getMoneyAsString(){
		ArrayList<String> arr = new ArrayList<String>();
		for(Card prop: money) {
			arr.add(prop.getName());
		}
		if(arr.isEmpty()) {
			arr.add("No money put down yet!");
			return arr;
		}
		return arr;
	}
	
	public ArrayList<String> getHandAsString(){
		ArrayList<String> arr = new ArrayList<String>();
		for(Card h: hand) {
			arr.add(h.getName());
		}
		return arr;
	}
	

	public ArrayList<Card> getMoney() {
		return money;
	}

	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}
	
	public void assignCards(int numberOfCards, Player p) {
		for(int i=0;i<numberOfCards;i++) {
			Random rand = new Random();
			int b = rand.nextInt(deck.getDeck().size())+0;
			Card card = deck.getDeck().get(b);
			deck.getDeck().remove(b);
			p.getHand().add(card);
			
		}
	}
	
	public Card chooseCard(Card c) {
		return c;
	}
//	public void playCard(Card c) {
//		((PassGo) c).play(this,deck);
//		hand.remove(c);
//	}
	
	public void pay(int value, ArrayList<Card> chosen , Player payee, Player receiver) {
		int v =0;
		for(Card c: chosen) {
			v=v+c.getValue();
		}
		
		if(v>=value) {
			for(Card c: chosen) {
				if(payee.getMoney().contains(c)) {
					payee.getMoney().remove(c);
					receiver.getMoney().add(c);
				}
				else {
					payee.getProperty().remove(c);
					receiver.getProperty().add((Property) c);
					
				}
			}
			
		}
	}
	
	

	
}
