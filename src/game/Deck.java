package game;

import java.util.ArrayList;

import cards.Card;
import cards.Cash;
import cards.DealBreaker;
import cards.DebtCollector;
import cards.DoubleTheRent;
import cards.ForcedDeal;
import cards.ItsMyBirthday;
import cards.JustSayNo;
import cards.PassGo;
import cards.Property;
import cards.SlyDeal;

public class Deck {
	private ArrayList<Card> deck = new ArrayList<Card>();


	private int size;

	public Deck() {
		addCards();
		System.out.println(deck.size());

	}
	public ArrayList<Card> getDeck() {
		return deck;
	}

	public void setDeck(ArrayList<Card> deck) {
		this.deck = deck;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void addCards() {



		deck.add(new Cash(10));
		deck.add(new Property("Mayfair",4,3,8,"Blue"));
		deck.add(new Property("Park Lane",4,3,8,"Blue"));
		deck.add(new Property("Water Works",2,1,2,"Mint"));
		deck.add(new Property("Electric Company",2,1,2,"Mint"));
		deck.add(new Property("Oxford Street",4,2,4,7,"Green"));
		deck.add(new Property("Regent Street",4,2,4,7,"Green"));
		deck.add(new Property("Bond Street",4,2,4,7,"Green"));
		deck.add(new Property("Fleet Street",3,2,4,6,"Red"));
		deck.add(new Property("Strand",3,2,4,6,"Red"));
		deck.add(new Property("Trafalgar Square",3,2,4,6,"Red"));
		deck.add(new Property("Leicester Square",3,2,4,6,"Yellow"));
		deck.add(new Property("Coventry Street",3,2,4,6,"Yellow"));
		deck.add(new Property("Picadilly",4,2,4,7,"Yellow"));
		deck.add(new Property("Pall Mall",3,2,3,6,"Red"));
		deck.add(new Property("Pentonville Road",3,2,3,6,"Red"));
		deck.add(new Property("Whitehall",3,2,3,6,"Red"));
		deck.add(new Property("Vine Street",2,1,3,5,"Orange"));
		deck.add(new Property("Bow Street",2,1,3,5,"Orange"));
		deck.add(new Property("Malborough Road",2,1,3,5,"Orange"));
		deck.add(new Property("Northumberland Avenue",2,1,2,4,"Pink"));
		deck.add(new Property("Whitehall",2,1,2,4,"Pink"));
		deck.add(new Property("Pall Mall",2,1,2,4,"Pink"));
		deck.add(new Property("The Angel Islington",1,1,2,3,"Light Blue"));
		deck.add(new Property("Euston Road",1,1,2,3,"Light Blue"));
		deck.add(new Property("Pentonville Road",1,1,2,3,"Light Blue"));
		deck.add(new Property("Old Kent Road",1,1,2,"Brown"));
		deck.add(new Property("Whitechapel Road",1,1,2,"Brown"));
		deck.add(new Property("Marylebone Station",1,1,2,3,4,"Black"));
		deck.add(new Property("Liverpool Street",1,1,2,3,4,"Black"));
		deck.add(new Property("Fenchurch St Station",1,1,2,3,4,"Black"));
		deck.add(new Property("Kings Cross Station",1,1,2,3,4,"Black"));
		deck.add(new DoubleTheRent());
		deck.add(new Cash(5));
		deck.add(new DealBreaker());
		deck.add(new DoubleTheRent());
		deck.add(new Cash(5));
		deck.add(new DealBreaker());
		deck.add(new Cash(4));
		deck.add(new Cash(3));
		deck.add(new ForcedDeal());
		deck.add(new SlyDeal());
		deck.add(new JustSayNo());
		deck.add(new DebtCollector());
		deck.add(new ItsMyBirthday());
		deck.add(new Cash(4));
		deck.add(new Cash(3));
		deck.add(new ForcedDeal());
		deck.add(new SlyDeal());
		deck.add(new JustSayNo());
		deck.add(new DebtCollector());
		deck.add(new ItsMyBirthday());
		deck.add(new Cash(4));
		deck.add(new Cash(3));
		deck.add(new ForcedDeal());
		deck.add(new SlyDeal());
		deck.add(new JustSayNo());
		deck.add(new DebtCollector());
		deck.add(new ItsMyBirthday());
		deck.add(new Cash(2));
		deck.add(new Cash(2));
		deck.add(new Cash(2));
		deck.add(new Cash(2));
		deck.add(new Cash(2));
		deck.add(new Cash(1));
		deck.add(new Cash(1));
		deck.add(new Cash(1));
		deck.add(new Cash(1));
		deck.add(new Cash(1));
		deck.add(new Cash(1));
		deck.add(new PassGo());
		deck.add(new PassGo());
		deck.add(new PassGo());
		deck.add(new PassGo());
		deck.add(new PassGo());
		deck.add(new PassGo());
		deck.add(new PassGo());
		deck.add(new PassGo());
		deck.add(new PassGo());
		deck.add(new PassGo());



	}


}





